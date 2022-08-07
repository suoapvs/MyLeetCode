package com.leetcode.my.countVowelsPermutation;

class Solution {

    public int countVowelPermutation(final int n) {
        long a = 1, e = 1, i = 1, o = 1, u = 1;
        long mod = 1000000007; // pow(10, 9) + 7;
        long a2, e2, i2, o2, u2;

        for (int j = 2; j <= n; j++) {
            a2 = (e + i + u) % mod;
            e2 = (a + i) % mod;
            i2 = (e + o) % mod;
            o2 = i;
            u2 = (o + i) % mod;

            a = a2;
            e = e2;
            i = i2;
            o = o2;
            u = u2;
        }

        return (int) ((a + e + i + o + u) % mod);
    }

    private long pow(final int p, final int n) {
        long res = 1;
        for (int i = 0; i < n; i++) {
            res *= p;
        }
        return res;
    }
}
