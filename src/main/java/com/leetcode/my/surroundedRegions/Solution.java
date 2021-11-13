package com.leetcode.my.surroundedRegions;

class Solution {

    public void solve(final char[][] board) {
        if (board.length <= 1 || board[0].length <= 1) {
            return;
        }
        for (var i = 0; i < board.length; i++) {
            // left
            boundaryDFS(board, i, 0);
            // right
            boundaryDFS(board, i, board[0].length - 1);
        }

        for (var j = 0; j < board[0].length; j++) {
            // top
            boundaryDFS(board, 0, j);
            // bottom
            boundaryDFS(board, board.length - 1, j);
        }

        for (var i = 0; i < board.length; i++) {
            for (var j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                } else if (board[i][j] == '@') {
                    board[i][j] = 'O';
                }
            }
        }
    }

    // Use DFS to turn internal however boundary-connected 'O' to '@';
    private static void boundaryDFS(
            final char[][] board,
            final int i,
            final int j
    ) {
        if (i < 0 || j < 0 || i > board.length - 1 || j > board[0].length - 1) {
            return;
        }
        if (board[i][j] == 'O') {
            board[i][j] = '@';
            // top cell
            boundaryDFS(board, i - 1, j);
            // bottom cell
            boundaryDFS(board, i + 1, j);
            // left cell
            boundaryDFS(board, i, j - 1);
            // right cell
            boundaryDFS(board, i, j + 1);
        }
    }
}
