package com.leetcode.my.kthSmallestNumberInMultiplicationTable;

class Solution {

    public int findKthNumber(final int m, final int n, final int k) {
        int low = 0;
        int high = m * n;
        while (low < high) {
            final int middle = (low + high) / 2;
            // check how many numbers are smaller than middle
            int count = 0;
            for (int i = 1; i <= m; i++) {
                count += Math.min(n, middle / i);
            }
            if (count >= k) {  // target <= middle
                high = middle;
            } else {  // target > middle
                low = middle + 1;
            }
        }
        return low;
    }
}
