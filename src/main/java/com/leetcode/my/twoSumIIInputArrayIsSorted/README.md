<a href="https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/">
    <img src="/leetcode-logo.png" style="width:200px" alt="LeetCode"/>
</a>

### 167. Two Sum II - Input Array Is Sorted

:green_circle: Easy

Given a __1-indexed__ array of integers `numbers` that is already ___sorted in
non-decreasing order___, find two numbers such that they add up to a specific
`target` number. Let these two numbers be `numbers[index1]`
and `numbers[index2]`
where `1 <= index1 < index2 <= numbers.length`.

Return the indices of the two numbers, `index1` and `index2`, ___added by one__
as an integer array `[index1, index2]` of length 2_.

The tests are generated such that there __is exactly one solution__. You __may
not__ use the same element twice.

__Example 1:__
<pre>
<b>Input:</b> numbers = [2,7,11,15], target = 9
<b>Output:</b> [1,2]
<b>Explanation:</b> The sum of 2 and 7 is 9. 
Therefore, index1 = 1, index2 = 2. We return [1, 2].
</pre>

__Example 2:__
<pre>
<b>Input:</b> numbers = [2,3,4], target = 6
<b>Output:</b> [1,3]
<b>Explanation:</b> The sum of 2 and 4 is 6. 
Therefore index1 = 1, index2 = 3. We return [1, 3].
</pre>

__Example 3:__
<pre>
<b>Input:</b> numbers = [-1,0], target = -1
<b>Output:</b> [1,2]
<b>Explanation:</b> The sum of -1 and 0 is -1. 
Therefore index1 = 1, index2 = 2. We return [1, 2].
</pre>

__Constraints:__

* <code>2 <= numbers.length <= 3 * 10<sup>4</sup></code>
* `-1000 <= numbers[i] <= 1000`
* `numbers` is sorted in __non-decreasing order__.
* The tests are generated such that there is __exactly one solution__.
