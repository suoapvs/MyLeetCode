<a href="https://leetcode.com/problems/binary-search/" target="_blank">
    <img src="/leetcode-logo.png" style="width:200px" alt="LeetCode"/>
</a>

### 704. Binary Search

<span style="color:orange">Medium</span>

Given an array of integers `nums` which is sorted in ascending order, and an
integer `target`, write a function to search `target` in `nums`. If `target`
exists, then return its index. Otherwise, return `-1`.

You must write an algorithm with `O(log n)` runtime complexity.

__Example 1:__
<pre>
<b>Input:</b> nums = [-1,0,3,5,9,12], target = 9
<b>Output:</b> 4
<b>Explanation:</b> 9 exists in nums and its index is 4
</pre>

__Example 2:__
<pre>
<b>Input:</b> nums = [-1,0,3,5,9,12], target = 2
<b>Output:</b> -1
<b>Explanation:</b> 2 does not exist in nums so return -1
</pre>

__Constraints:__

* <code>1 <= nums.length <= 10<sup>4</sup></code>
* <code>-10<sup>4</sup> < nums[i], target < 10<sup>4</sup></code>
* All the integers in `nums` are __unique__.
* `nums` is sorted in ascending order.
