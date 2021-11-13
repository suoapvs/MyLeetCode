<a href="https://leetcode.com/problems/search-insert-position/">
    <img src="/leetcode-logo.png" style="width:200px" alt="LeetCode"/>
</a>

### 35. Search Insert Position

<span style="color:green">Easy</span>

Given a sorted array of distinct integers and a target value, return the index
if the target is found. If not, return the index where it would be if it were
inserted in order.

You must write an algorithm with `O(log n)` runtime complexity.

__Example 1:__
<pre>
<b>Input:</b> nums = [1,3,5,6], target = 5
<b>Output:</b> 2
</pre>

__Example 2:__
<pre>
<b>Input:</b> nums = [1,3,5,6], target = 2
<b>Output:</b> 1
</pre>

__Example 3:__
<pre>
<b>Input:</b> nums = [1,3,5,6], target = 7
<b>Output:</b> 4
</pre>

__Example 4:__
<pre>
<b>Input:</b> nums = [1,3,5,6], target = 0
<b>Output:</b> 0
</pre>

__Example 5:__
<pre>
<b>Input:</b> nums = [1], target = 0
<b>Output:</b> 0
</pre>

__Constraints:__

* <code>1 <= nums.length <= 10<sup>4</sup></code>
* <code>-10<sup>4</sup> <= nums[i] <= 10<sup>4</sup></code>
* `nums` contains __distinct__ values sorted in __ascending__ order.
* <code>-10<sup>4</sup> <= target <= 10<sup>4</sup></code>
