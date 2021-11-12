### 20. Valid Parentheses

<span style="color:green">Easy</span>

Given a string s containing just the characters 
`'('`, `')'`, `'{'`, `'}'`, `'['` and `']'`, 
determine if the input string is valid.

An input string is valid if:

1. Open brackets must be closed by the same type of brackets.
2. Open brackets must be closed in the correct order.

__Example 1:__
<pre>
<b>Input:</b> s = "()"
<b>Output:</b> true
</pre>

__Example 2:__
<pre>
<b>Input:</b> s = "()[]{}"
<b>Output:</b> true
</pre>

__Example 3:__
<pre>
<b>Input:</b> s = "(]"
<b>Output:</b> false
</pre>

__Example 4:__
<pre>
<b>Input:</b> s = "([)]"
<b>Output:</b> false
</pre>

__Example 5:__
<pre>
<b>Input:</b> s = "{[]}"
<b>Output:</b> true
</pre>

__Constraints:__
* <code>1 <= s.length <= 10<sup>4</sup></code>
* `s` consists of parentheses only `'()[]{}'`.

[On LeetCode](https://leetcode.com/problems/valid-parentheses/)
