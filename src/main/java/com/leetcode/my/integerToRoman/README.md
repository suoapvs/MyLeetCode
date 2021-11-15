<a href="https://leetcode.com/problems/integer-to-roman/">
    <img src="/leetcode-logo.png" style="width:200px" alt="LeetCode"/>
</a>

### 12. Integer to Roman

:orange_circle: Medium

Roman numerals are represented by seven different symbols:
`I`, `V`, `X`, `L`, `C`, `D` and `M`.

Symbol | Value
-------|------
I   |   1
V   |   5
X   |   10
L   |   50
C   |   100
D   |   500
M   |   1000

For example, `2` is written as `II` in Roman numeral, just two one's added
together. 12 is written as `XII`, which is simply `X + II`. The number `27` is
written as `XXVII`, which is `XX + V + II`.

Roman numerals are usually written largest to smallest from left to right.
However, the numeral for four is not `IIII`. Instead, the number four is written
as IV. Because the one is before the five we subtract it making four. The same
principle applies to the number nine, which is written as `IX`. There are six
instances where subtraction is used:

* `I` can be placed before `V` (5) and `X` (10) to make 4 and 9.
* `X` can be placed before `L` (50) and `C` (100) to make 40 and 90.
* `C` can be placed before `D` (500) and `M` (1000) to make 400 and 900.

Given an integer, convert it to a roman numeral.

__Example 1:__
<pre>
<b>Input:</b> num = 3
<b>Output:</b> "III"
</pre>

__Example 2:__
<pre>
<b>Input:</b> num = 4
<b>Output:</b> "IV"
</pre>

__Example 3:__
<pre>
<b>Input:</b> num = 9
<b>Output:</b> "IX"
</pre>

__Example 4:__
<pre>
<b>Input:</b> num = 58
<b>Output:</b> "LVIII"
<b>Explanation:</b> L = 50, V = 5, III = 3.
</pre>

__Example 5:__
<pre>
<b>Input:</b> num = 1994
<b>Output:</b> "MCMXCIV"
<b>Explanation:</b> M = 1000, CM = 900, XC = 90 and IV = 4.
</pre>

__Constraints:__

* `1 <= num <= 3999`
