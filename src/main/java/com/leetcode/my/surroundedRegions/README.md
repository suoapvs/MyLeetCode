<a href="https://leetcode.com/problems/surrounded-regions/">
    <img src="/leetcode-logo.png" style="width:200px" alt="LeetCode"/>
</a>

### 130. Surrounded Regions

<span style="color:orange">Medium</span>

Given an `m x n` matrix `board` containing `'X'` and `'O'`, _capture all regions
that are 4-directionally surrounded by `'X'`_.

A region is __captured__ by flipping all `'O'`s into `'X'`s in that surrounded
region.

__Example 1:__

![](https://assets.leetcode.com/uploads/2021/02/19/xogrid.jpg)
<pre>
<b>Input:</b> board = [
    ['X','X','X','X'],
    ['X','O','O','X'],
    ['X','X','O','X'],
    ['X','O','X','X']
]
<b>Output:</b> [
    ['X','X','X','X'],
    ['X','X','X','X'],
    ['X','X','X','X'],
    ['X','O','X','X']
]
<b>Explanation:</b> Surrounded regions should not be on the border, 
which means that any 'O' on the border of the board are not flipped 
to 'X'. Any 'O' that is not on the border and it is not connected 
to an 'O' on the border will be flipped to 'X'. Two cells are 
connected if they are adjacent cells connected horizontally or 
vertically.
</pre>

__Example 2:__
<pre>
<b>Input:</b> board = [['X']]
<b>Output:</b> [['X']]
</pre>

__Constraints:__

* `m == board.length`
* `n == board[i].length`
* `1 <= m, n <= 200`
* `board[i][j]` is `'X'` or `'O'`.
