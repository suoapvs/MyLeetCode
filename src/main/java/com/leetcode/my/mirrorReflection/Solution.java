package com.leetcode.my.mirrorReflection;

/**
 * Approach :
 *
 * First, think about the case p = 3 & q = 2.
 *
 * So, this problem can be transformed into finding m * p = n * q, where
 * m = the number of room extension + 1.
 * n = the number of light reflection + 1.
 *
 * 1. If the number of light reflection is odd (which means n is even),
 * it means the corner is on the left-hand side. The possible corner is 2.
 * Otherwise, the corner is on the right-hand side.
 * The possible corners are 0 and 1.
 *
 * 2. Given the corner is on the right-hand side.
 * If the number of room extension is even (which means m is odd),
 * it means the corner is 1. Otherwise, the corner is 0.
 * m is even & n is odd => return 0.
 * m is odd & n is odd => return 1.
 * m is odd & n is even => return 2.
 *
 * Note: The case m is even & n is even is impossible.
 * Because in the equation m * q = n * p, if m and n are even,
 * we can divide both m and n by 2. Then, m or n must be odd.
 *
 * Because we want to find m * p = n * q, where either m or n is odd,
 * we can do it this way.
 *
 * https://leetcode.com/problems/mirror-reflection/discuss/2376191/C%2B%2B-Java-Python-or-Faster-then-100-or-Full-explanations-or
 */
public class Solution {

    public int mirrorReflection(int p, int q) {
        while (p % 2 == 0 && q % 2 == 0) {
            p /= 2;
            q /= 2;
        }
        return 1 - p % 2 + q % 2;
    }
}
