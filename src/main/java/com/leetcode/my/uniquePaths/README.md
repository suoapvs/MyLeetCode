<a href="https://leetcode.com/problems/unique-paths/">
    <img src="/leetcode-logo.png" style="width:200px" alt="LeetCode"/>
</a>

### 62. Unique Paths

:orange_circle: Medium

A robot is located at the top-left corner of a `m x n` grid (marked 'Start' in
the diagram below).

The robot can only move either down or right at any point in time. The robot is
trying to reach the bottom-right corner of the grid (marked 'Finish' in the
diagram below).

How many possible unique paths are there?

__Example 1:__

![](https://assets.leetcode.com/uploads/2018/10/22/robot_maze.png)

<pre>
<b>Input:</b> m = 3, n = 7
<b>Output:</b> 28
</pre>

__Example 2:__
<pre>
<b>Input:</b> m = 3, n = 2
<b>Output:</b> 3
<b>Explanation:</b>
From the top-left corner, there are a total of 3 ways 
to reach the bottom-right corner:
1. Right -> Down -> Down
2. Down -> Down -> Right
3. Down -> Right -> Down
</pre>

__Example 3:__
<pre>
<b>Input:</b> m = 7, n = 3
<b>Output:</b> 28
</pre>

__Example 4:__
<pre>
<b>Input:</b> m = 3, n = 3
<b>Output:</b> 6
</pre>

__Constraints:__

* `1 <= m, n <= 100`
* `-1000 <= numbers[i] <= 1000`
* It's guaranteed that the answer will be less than or equal to <code>2 *
  10<sup>9</sup></code>.
