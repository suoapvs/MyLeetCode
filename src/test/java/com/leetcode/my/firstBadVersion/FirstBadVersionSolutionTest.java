package com.leetcode.my.firstBadVersion;

import lombok.experimental.Delegate;

class FirstBadVersionSolutionTest
        extends BaseSolutionTest {

    private int badVersion;

    @Delegate
    private final Solution solution = new Solution() {
        @Override
        boolean isBadVersion(final int version) {
            return version >= badVersion;
        }
    };

    @Override
    void setBadVersion(final int version) {
        this.badVersion = version;
    }
}
