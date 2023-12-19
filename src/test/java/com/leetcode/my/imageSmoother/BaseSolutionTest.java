package com.leetcode.my.imageSmoother;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

abstract class BaseSolutionTest {

    /**
     * Input: img = [[1,1,1],[1,0,1],[1,1,1]]
     * Output: [[0,0,0],[0,0,0],[0,0,0]]
     * Explanation:
     * For the points (0,0), (0,2), (2,0), (2,2): floor(3/4) = floor(0.75) = 0
     * For the points (0,1), (1,0), (1,2), (2,1): floor(5/6) = floor(0.83333333) = 0
     * For the point (1,1): floor(8/9) = floor(0.88888889) = 0
     */
    @Test
    public void imageSmoother_test1() {
        val img = new int[][]{
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };
        val output = new int[][]{
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };
        val res = imageSmoother(img);
        assertTrue(matrixEquals(output, res));
    }

    /**
     * Input: img = [[100,200,100],[200,50,200],[100,200,100]]
     * Output: [[137,141,137],[141,138,141],[137,141,137]]
     * Explanation:
     * For the points (0,0), (0,2), (2,0), (2,2): floor((100+200+200+50)/4) = floor(137.5) = 137
     * For the points (0,1), (1,0), (1,2), (2,1): floor((200+200+50+200+100+100)/6) = floor(141.666667) = 141
     * For the point (1,1): floor((50+200+200+200+200+100+100+100+100)/9) = floor(138.888889) = 138
     */
    @Test
    public void imageSmoother_test2() {
        val img = new int[][]{
                {100, 200, 100},
                {200, 50, 200},
                {100, 200, 100}
        };
        val output = new int[][]{
                {137, 141, 137},
                {141, 138, 141},
                {137, 141, 137}
        };
        val res = imageSmoother(img);
        assertTrue(matrixEquals(output, res));
    }

    abstract int[][] imageSmoother(int[][] img);

    private static boolean matrixEquals(final int[][] a, final int[][] b) {
        val rows = a.length;
        val cols = a[0].length;
        if ((rows != b.length) || (cols != b[0].length)) {
            return false;
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (a[i][j] != b[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
