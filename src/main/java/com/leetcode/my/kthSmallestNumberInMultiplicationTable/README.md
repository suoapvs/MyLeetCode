<a href="https://leetcode.com/problems/kth-smallest-number-in-multiplication-table/">
    <img src="/leetcode-logo.png" style="width:200px" alt="LeetCode"/>
</a>

### 668. Kth Smallest Number in Multiplication Table

:red_circle: Hard

Nearly everyone has used the `Multiplication Table`. The multiplication table of
size `m x n` is an integer matrix mat where `mat[i][j] == i * j` (__1-indexed__)
.

Given three integers `m`, `n`, and `k`, return _the <code>k<sup>th</sup></code>
smallest element in the `m x n` multiplication table_.

__Example 1:__

![](https://assets.leetcode.com/uploads/2021/05/02/multtable1-grid.jpg)

<pre>
<b>Input:</b> m = 3, n = 3, k = 5
<b>Output:</b> 3
<b>Explanation:</b> The 5th smallest number is 3.
</pre>

__Example 2:__

![](https://assets.leetcode.com/uploads/2021/05/02/multtable2-grid.jpg)

<pre>
<b>Input:</b> m = 2, n = 3, k = 6
<b>Output:</b> 6
<b>Explanation:</b> The 6th smallest number is 6.
</pre>

__Constraints:__

* <code>1 <= m, n <= 3 * 10<sup>4</sup></code>
* `1 <= k <= m * n`
