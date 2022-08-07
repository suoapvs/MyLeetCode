<a href="https://leetcode.com/problems/implement-strstr/">
    <img src="/leetcode-logo.png" style="width:200px" alt="LeetCode"/>
</a>

### 28. Implement strStr()

:green_circle: Easy

Implement `strStr()`.

Given two strings `needle` and `haystack`, return the index of the first 
occurrence of `needle` in `haystack`, or `-1` if `needle` is not part 
of `haystack`.


__Clarification:__

What should we return when `needle` is an empty string? 
This is a great question to ask during an interview.

For the purpose of this problem, we will return `0` when `needle` 
is an empty string. This is consistent to C's `strstr()` and Java's `indexOf()`.


__Example 1:__
<pre>
<b>Input:</b> haystack = "hello", needle = "ll"
<b>Output:</b> 2
</pre>

__Example 2:__
<pre>
<b>Input:</b> haystack = "aaaaa", needle = "bba"
<b>Output:</b> -1
</pre>


__Constraints:__

* <code>1 <= haystack.length, needle.length <= 10<sup>4</sup></code>
* `haystack` and `needle` consist of only lowercase English characters.
