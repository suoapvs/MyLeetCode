package com.leetcode.my.sumOfTwoIntegers;

class Solution2 {

    public int getSum(int a, int b) {
        return (b == 0) ? a : getSum(a ^ b, (a & b) << 1);
    }
}
