<a href="https://leetcode.com/problems/maximum-product-difference-between-two-pairs/">
    <img src="/leetcode-logo.png" style="width:200px" alt="LeetCode"/>
</a>

### 1913. Maximum Product Difference Between Two Pairs

:green_circle: Easy

The __product difference__ between two pairs `(a, b)` and `(c, d)` 
is defined as `(a * b) - (c * d)`.

For example, the product difference between `(5, 6)` and `(2, 7)` 
is `(5 * 6) - (2 * 7) = 16`.
Given an integer array nums, choose four distinct indices `w`, `x`, `y`, 
and z such that the product difference between pairs `(nums[w], nums[x])` 
and `(nums[y], nums[z])` is maximized.

Return _the __maximum__ such product difference_.

__Example 1:__
<pre>
<b>Input:</b> nums = [5,6,2,7,4]
<b>Output:</b> 34
<b>Explanation:</b> We can choose indices 1 and 3 for the first pair (6, 7) 
and indices 2 and 4 for the second pair (2, 4).
The product difference is (6 * 7) - (2 * 4) = 34.
</pre>

__Example 2:__
<pre>
<b>Input:</b> nums = [4,2,5,9,7,4,8]
<b>Output:</b> 64
<b>Explanation:</b> We can choose indices 3 and 6 for the first pair (9, 8) 
and indices 1 and 5 for the second pair (2, 4).
The product difference is (9 * 8) - (2 * 4) = 64.
</pre>

__Constraints:__

* <code>4 <= nums.length <= 10<sup>4</sup></code>
* <code>1 <= nums[i] <= 10<sup>4</sup></code>
