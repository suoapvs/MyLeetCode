<a href="https://leetcode.com/problems/first-bad-version/" target="_blank">
    <img src="https://assets.leetcode.com/static_assets/public/webpack_bundles/images/logo-dark.e99485d9b.svg"
        style="width:150px" alt="LeetCode"/>
</a>

### 278. First Bad Version

<span style="color:green">Easy</span>

You are a product manager and currently leading a team to develop a new product.
Unfortunately, the latest version of your product fails the quality check. Since
each version is developed based on the previous version, all the versions after
a bad version are also bad.

Suppose you have n versions `[1, 2, ..., n]` and you want to find out the first
bad one, which causes all the following ones to be bad.

You are given an API `bool isBadVersion(version)` which returns whether `version` is
bad. Implement a function to find the first bad version. You should minimize the
number of calls to the API.

__Example 1:__
<pre>
<b>Input:</b> n = 5, bad = 4
<b>Output:</b> 4
<b>Explanation:</b>
call isBadVersion(3) -> false
call isBadVersion(5) -> true
call isBadVersion(4) -> true
Then 4 is the first bad version.
</pre>

__Example 2:__
<pre>
<b>Input:</b> n = 1, bad = 1
<b>Output:</b> 1
</pre>

__Constraints:__

* <code>1 <= bad <= n <= 2<sup>31</sup> - 1</code>
