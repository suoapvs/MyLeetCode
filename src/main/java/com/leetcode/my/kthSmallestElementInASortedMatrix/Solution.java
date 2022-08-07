package com.leetcode.my.kthSmallestElementInASortedMatrix;

class Solution {

    // modified binary searching using median and count
    public int kthSmallest(final int[][] matrix, final int k) {
        int n = matrix.length;
        int lo = matrix[0][0];
        int hi = matrix[n - 1][n - 1];
        int mid;
        int count;
        while (lo <= hi) {
            mid = lo + (hi - lo) / 2;
            count = getCountLessOrEqual(matrix, mid, n);
            if (count < k) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    private int getCountLessOrEqual(
            final int[][] matrix,
            final int val,
            final int n
    ) {
        int i = 0;
        int j = n - 1;
        int res = 0;
        while (i < n) {
            while (j >= 0 && matrix[i][j] > val) {
                j--;
            }
            res += j + 1;
            i++;
        }
        return res;
    }
}
