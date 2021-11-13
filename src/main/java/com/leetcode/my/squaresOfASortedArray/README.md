<a href="https://leetcode.com/problems/squares-of-a-sorted-array/">
    <img src="https://assets.leetcode.com/static_assets/public/webpack_bundles/images/logo-dark.e99485d9b.svg"
        style="width:150px" alt="LeetCode"/>
</a>

### 977. Squares of a Sorted Array

<span style="color:green">Easy</span>

Given an integer array `nums` sorted in __non-decreasing__ order, return an array of
___the squares of each number__ sorted in non-decreasing order_.

__Example 1:__
<pre>
<b>Input:</b> nums = [-4,-1,0,3,10]
<b>Output:</b> [0,1,9,16,100]
<b>Explanation:</b> After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
</pre>

__Example 2:__
<pre>
<b>Input:</b> nums = [-7,-3,2,3,11]
<b>Output:</b> [4,9,9,49,121]
</pre>

__Constraints:__

* <code>1 <= nums.length <= 10<sup>4</sup></code>
* <code>-10<sup>4</sup> <= nums[i] <= 10<sup>4</sup></code>
* `nums` is sorted in __non-decreasing__ order.
