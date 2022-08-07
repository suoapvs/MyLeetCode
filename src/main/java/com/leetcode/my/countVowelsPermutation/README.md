<a href="https://leetcode.com/problems/count-vowels-permutation/">
    <img src="/leetcode-logo.png" style="width:200px" alt="LeetCode"/>
</a>

### 1220. Count Vowels Permutation

:red_circle: Hard

Given an integer `n`, your task is to count how many strings of length `n` 
can be formed under the following rules:

* Each character is a lower case vowel (`'a'`, `'e'`, `'i'`, `'o'`, `'u'`)
* Each vowel `'a'` may only be followed by an `'e'`.
* Each vowel `'e'` may only be followed by an `'a'` or an `'i'`.
* Each vowel `'i'` __may not__ be followed by another `'i'`.
* Each vowel `'o'` may only be followed by an `'i'` or a `'u'`.
* Each vowel `'u'` may only be followed by an `'a'`.

Since the answer may be too large, return it modulo `10^9 + 7`.


__Example 1:__
<pre>
<b>Input:</b> n = 1
<b>Output:</b> 5
<b>Explanation:</b> All possible strings are: "a", "e", "i" , "o" and "u".
</pre>

__Example 2:__
<pre>
<b>Input:</b> n = 2
<b>Output:</b> 10
<b>Explanation:</b> All possible strings are: 
"ae", "ea", "ei", "ia", "ie", "io", "iu", "oi", "ou" and "ua".
</pre>

__Example 3:__
<pre>
<b>Input:</b> n = 5
<b>Output:</b> 68
</pre>


__Constraints:__

* <code>1 <= n <= 10<sup>4</sup></code>
