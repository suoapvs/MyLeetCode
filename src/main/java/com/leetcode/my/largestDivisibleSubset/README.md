<a href="https://leetcode.com/problems/largest-divisible-subset/">
    <img src="/leetcode-logo.png" style="width:200px" alt="LeetCode"/>
</a>

### 368. Largest Divisible Subset

:orange_circle: Medium

Given a set of distinct positive integers nums, return the largest subset answer
such that every pair (answer[i], answer[j]) of elements in this subset
satisfies:

* `answer[i] % answer[j] == 0`, or
* `answer[j] % answer[i] == 0`

If there are multiple solutions, return any of them.

__Example 1:__
<pre>
<b>Input:</b> nums = [1,2,3]
<b>Output:</b> [1,2]
<b>Explanation:</b> [1,3] is also accepted.
</pre>

__Example 2:__
<pre>
<b>Input:</b> nums = [1,2,4,8]
<b>Output:</b> [1,2,4,8]
</pre>

__Constraints:__

* `1 <= nums.length <= 1000`
* <code>1 <= nums[i] <= 2 * 10<sup>9</sup></code>
* All the integers in `nums` are __unique__.
