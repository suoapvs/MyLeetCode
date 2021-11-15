<a href="https://leetcode.com/problems/longest-increasing-subsequence/">
    <img src="/leetcode-logo.png" style="width:200px" alt="LeetCode"/>
</a>

### 300. Longest Increasing Subsequence

:orange_circle: Medium

Given an integer array `nums`, return the length of the longest strictly
increasing subsequence.

A __subsequence__ is a sequence that can be derived from an array by deleting
some or no elements without changing the order of the remaining elements. For
example, `[3,6,2,7]` is a subsequence of the array `[0,3,1,6,2,2,7]`.

__Example 1:__
<pre>
<b>Input:</b> nums = [10,9,2,5,3,7,101,18]
<b>Output:</b> 4
<b>Explanation:</b> The longest increasing subsequence is [2,3,7,101], therefore the length is 4.
</pre>

__Example 2:__
<pre>
<b>Input:</b> nums = [0,1,0,3,2,3]
<b>Output:</b> 4
</pre>

__Example 3:__
<pre>
<b>Input:</b> nums = [7,7,7,7,7,7,7]
<b>Output:</b> 1
</pre>

__Constraints:__

* `1 <= nums.length <= 2500`
* <code>-10<sup>4</sup> <= nums[i] <= 10<sup>4</sup></code>
