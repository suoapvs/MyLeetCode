<a href="https://leetcode.com/problems/length-of-last-word/">
    <img src="/leetcode-logo.png" style="width:200px" alt="LeetCode"/>
</a>

### 58. Length of Last Word

:green_circle: Easy

Given a string `s` consisting of words and spaces, 
return _the length of the __last__ word in the string_.

A __word__ is a maximal substring consisting of 
non-space characters only.

__Example 1:__

<pre>
<b>Input:</b> s = "Hello World"
<b>Output:</b> 5
<b>Explanation:</b> The last word is "World" with length 5.
</pre>

__Example 2:__
<pre>
<b>Input:</b> s = "   fly me   to   the moon  "
<b>Output:</b> 4
<b>Explanation:</b> The last word is "moon" with length 4.
</pre>

__Example 3:__
<pre>
<b>Input:</b> s = "luffy is still joyboy"
<b>Output:</b> 6
<b>Explanation:</b> The last word is "joyboy" with length 6.
</pre>

__Constraints:__

* <code>1 <= s.length <= 10<sup>4</sup></code>
* `s` consists of only English letters and spaces `' '`.
* There will be at least one word in `s`.
