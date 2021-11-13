package com.leetcode.my.surroundedRegions;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

abstract class BaseSolutionTest {

    /**
     * Input: board = [
     * ['X','X','X','X'],
     * ['X','O','O','X'],
     * ['X','X','O','X'],
     * ['X','O','X','X']
     * ]
     * Output: [
     * ['X','X','X','X'],
     * ['X','X','X','X'],
     * ['X','X','X','X'],
     * ['X','O','X','X']
     * ]
     * Explanation: Surrounded regions should not be on the border,
     * which means that any 'O' on the border of the board are not flipped
     * to 'X'. Any 'O' that is not on the border and it is not connected
     * to an 'O' on the border will be flipped to 'X'. Two cells are
     * connected if they are adjacent cells connected horizontally or
     * vertically.
     */
    @Test
    public void surroundedRegions_test1() {
        val board = new char[][]{
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'X', 'O', 'X'},
                {'X', 'O', 'X', 'X'}
        };
        val output = new char[][]{
                {'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'X', 'X'}
        };
        test(board, output);
    }

    /**
     * Input: board = [['X']]
     * Output: [['X']]
     */
    @Test
    public void surroundedRegions_test2() {
        val board = new char[][]{{'X'},};
        val output = new char[][]{{'X'},};
        test(board, output);
    }

    /**
     * Input: board = [
     * ['X','O','X'],
     * ['O','X','O'],
     * ['X','O','X']
     * ]
     * Output: [
     * ['X','O','X'],
     * ['O','X','O'],
     * ['X','O','X']
     * ]
     */
    @Test
    public void surroundedRegions_test3() {
        val board = new char[][]{
                {'X', 'O', 'X'},
                {'O', 'X', 'O'},
                {'X', 'O', 'X'}
        };
        val output = new char[][]{
                {'X', 'O', 'X'},
                {'O', 'X', 'O'},
                {'X', 'O', 'X'}
        };
        test(board, output);
    }

    /**
     * Input: board = [
     * ['O','X','X','O','X'],
     * ['X','O','O','X','O'],
     * ['X','O','X','O','X'],
     * ['O','X','O','O','O'],
     * ['X','X','O','X','O']
     * ]
     * Output: [
     * ['O','X','X','O','X'],
     * ['X','X','X','X','O'],
     * ['X','X','X','O','X'],
     * ['O','X','O','O','O'],
     * ['X','X','O','X','O']
     * ]
     */
    @Test
    public void surroundedRegions_test4() {
        val board = new char[][]{
                {'O', 'X', 'X', 'O', 'X'},
                {'X', 'O', 'O', 'X', 'O'},
                {'X', 'O', 'X', 'O', 'X'},
                {'O', 'X', 'O', 'O', 'O'},
                {'X', 'X', 'O', 'X', 'O'}
        };
        val output = new char[][]{
                {'O', 'X', 'X', 'O', 'X'},
                {'X', 'X', 'X', 'X', 'O'},
                {'X', 'X', 'X', 'O', 'X'},
                {'O', 'X', 'O', 'O', 'O'},
                {'X', 'X', 'O', 'X', 'O'}
        };
        test(board, output);
    }

    @Test
    public void surroundedRegions_test5() {
        val board = new char[][]{
                {'O', 'X', 'X', 'O', 'X'},
                {'X', 'O', 'O', 'X', 'O'},
                {'X', 'O', 'X', 'O', 'X'},
                {'O', 'X', 'O', 'O', 'O'},
                {'X', 'X', 'O', 'X', 'O'},
                {'X', 'O', 'O', 'O', 'X'},
                {'X', 'O', 'X', 'O', 'X'},
                {'X', 'X', 'O', 'X', 'O'},
        };
        val output = new char[][]{
                {'O', 'X', 'X', 'O', 'X'},
                {'X', 'X', 'X', 'X', 'O'},
                {'X', 'X', 'X', 'O', 'X'},
                {'O', 'X', 'O', 'O', 'O'},
                {'X', 'X', 'O', 'X', 'O'},
                {'X', 'O', 'O', 'O', 'X'},
                {'X', 'O', 'X', 'O', 'X'},
                {'X', 'X', 'O', 'X', 'O'},
        };
        test(board, output);
    }

    abstract void solve(char[][] board);

    private void test(final char[][] input, final char[][] output) {
        solve(input);
        for (var i = 0; i < input.length; i++) {
            assertArrayEquals(output[i], input[i]);
        }
    }

    private void printBoard(final char[][] board) {
        for (char[] row : board) {
            for (char ch : row) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
