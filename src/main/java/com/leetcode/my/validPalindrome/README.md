### 125. Valid Palindrome

<span style="color:green">Easy</span>

A phrase is a __palindrome__ if, after converting all 
uppercase letters into lowercase letters and removing 
all non-alphanumeric characters, it reads the same 
forward and backward. Alphanumeric characters include 
letters and numbers.

Given a string `s`, return `true` _if it is a __palindrome__, 
or `false` otherwise_.

__Example 1:__
<pre>
<b>Input:</b> s = "A man, a plan, a canal: Panama"
<b>Output:</b> true
<b>Explanation:</b> "amanaplanacanalpanama" is a palindrome.
</pre>

__Example 2:__
<pre>
<b>Input:</b> s = "race a car"
<b>Output:</b> false
<b>Explanation:</b> "raceacar" is not a palindrome.
</pre>

__Example 3:__
<pre>
<b>Input:</b> s = " "
<b>Output:</b> true
<b>Explanation:</b> s is an empty string "" after removing 
non-alphanumeric characters.
Since an empty string reads the same forward and backward, 
it is a palindrome.
</pre>

__Constraints:__
* <code>1 <= s.length <= 2 * 10<sup>5</sup></code>
* `s` consists only of printable ASCII characters.

[On LeetCode](https://leetcode.com/problems/valid-palindrome/)
