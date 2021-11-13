<a href="https://leetcode.com/problems/rotate-array/">
    <img src="/leetcode-logo.png" style="width:200px" alt="LeetCode"/>
</a>

### 189. Rotate Array

<span style="color:orange">Medium</span>

Given an array, rotate the array to the right by `k` steps, where `k` is
non-negative.

__Example 1:__
<pre>
<b>Input:</b> nums = [1,2,3,4,5,6,7], k = 3
<b>Output:</b> [5,6,7,1,2,3,4]
<b>Explanation:</b>
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
</pre>

__Example 2:__
<pre>
<b>Input:</b> nums = [-1,-100,3,99], k = 2
<b>Output:</b> [3,99,-1,-100]
<b>Explanation:</b> 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
</pre>

__Constraints:__

* <code>1 <= nums.length <= 10<sup>5</sup></code>
* <code>-2<sup>31</sup> <= nums[i] <= 2<sup>31</sup> - 1</code>
* <code>0 <= k <= 10<sup>5</sup></code>

__Follow up:__

* Try to come up with as many solutions as you can. There are at least __three__
  different ways to solve this problem.
* Could you do it in-place with `O(1)` extra space?
