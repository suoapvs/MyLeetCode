<a href="https://leetcode.com/problems/palindrome-number/" target="_blank">
    <img src="https://assets.leetcode.com/static_assets/public/webpack_bundles/images/logo-dark.e99485d9b.svg"
        style="width:150px" alt="LeetCode"/>
</a>

### 9. Palindrome Number

<span style="color:orange">Medium</span>

Given an integer `x`, return `true` if `x` is palindrome integer.

An integer is a __palindrome__ when it reads the same backward as forward. For
example, `121` is palindrome while `123` is not.

__Example 1:__
<pre>
<b>Input:</b> x = 121
<b>Output:</b> true
</pre>

__Example 2:__
<pre>
<b>Input:</b> x = -121
<b>Output:</b> false
<b>Explanation:</b> From left to right, it reads -121. 
From right to left, it becomes 121-. 
Therefore it is not a palindrome.
</pre>

__Example 3:__
<pre>
<b>Input:</b> x = 10
<b>Output:</b> false
<b>Explanation:</b> Reads 01 from right to left. 
Therefore it is not a palindrome.
</pre>

__Example 4:__
<pre>
<b>Input:</b> x = -101
<b>Output:</b> false
</pre>

__Constraints:__

* <code>-2<sup>31</sup> <= x <= 2<sup>31</sup> - 1</code>

__Follow up:__
Could you solve it without converting the integer to a string?
