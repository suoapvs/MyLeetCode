package com.leetcode.my.firstBadVersion;


abstract class Solution {

    public int firstBadVersion(final int n) {
        int left = 1;
        int right = n;
        while (left < right) {
            final int middle = left + (right - left) / 2;
            if (isBadVersion(middle)) {
                right = middle;
            } else {
                left = middle + 1;
            }
        }
        return left;
    }

    /* The isBadVersion API is defined in the parent class VersionControl. */
    abstract boolean isBadVersion(int version);
}
