<a href="https://leetcode.com/problems/longest-substring-without-repeating-characters/">
    <img src="/leetcode-logo.png" style="width:200px" alt="LeetCode"/>
</a>

### 3. Longest Substring Without Repeating Characters

:orange_circle: Medium

Given a string `s`, find the length of the __longest substring__
without repeating characters.
A substring is a contiguous non-empty sequence of characters within a string.

__Example 1:__
<pre>
<b>Input:</b> s = "abcabcbb"
<b>Output:</b> 3
<b>Explanation:</b> The answer is "abc", with the length of 3.
</pre>

__Example 2:__
<pre>
<b>Input:</b> s = "bbbbb"
<b>Output:</b> 1
<b>Explanation:</b> The answer is "b", with the length of 1.
</pre>

__Example 3:__
<pre>
<b>Input:</b> s = "pwwkew"
<b>Output:</b> 3
<b>Explanation:</b> The answer is "wke", with the length of 3.
Notice that the answer must be a substring, 
"pwke" is a subsequence and not a substring.
</pre>

__Constraints:__

* <code>0 <= s.length <= 5 * 10<sup>4</sup></code>
* `s` consists of English letters, digits, symbols and spaces.
