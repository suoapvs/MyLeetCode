<a href="https://leetcode.com/problems/merge-sorted-array/">
    <img src="/leetcode-logo.png" style="width:200px" alt="LeetCode"/>
</a>

### 88. Merge Sorted Array

:green_circle: Easy

You are given two integer arrays `nums1` and `nums2`, sorted in __non-decreasing order__, 
and two integers `m` and `n`, representing the number of elements in `nums1` and `nums2` respectively.

Merge `nums1` and `nums2` into a single array sorted in __non-decreasing order__.

The final sorted array should not be returned by the function, but instead be 
_stored inside the array_ `nums1`. To accommodate this, `nums1` has a length of `m + n`, 
where the first `m` elements denote the elements that should be merged, 
and the last `n` elements are set to 0 and should be ignored. `nums2` has a length of `n`.

__Example 1:__
<pre>
<b>Input:</b> nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
<b>Output:</b> [1,2,2,3,5,6]
<b>Explanation:</b> The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
</pre>

__Example 2:__
<pre>
<b>Input:</b> nums1 = [1], m = 1, nums2 = [], n = 0
<b>Output:</b> [1]
<b>Explanation:</b> The arrays we are merging are [1] and [].
The result of the merge is [1].
</pre>

__Example 3:__
<pre>
<b>Input:</b> nums1 = [0], m = 0, nums2 = [1], n = 1
<b>Output:</b> [1]
<b>Explanation:</b> The arrays we are merging are [] and [1].
The result of the merge is [1].
Note that because m = 0, there are no elements in nums1. 
The 0 is only there to ensure the merge result can fit in nums1.
</pre>

__Constraints:__

* `nums1.length == m + n`
* `nums2.length == n`
* `0 <= m, n <= 200`
* `1 <= m + n <= 200`
* <code>-10<sup>9</sup> <= nums1[i], nums2[j] <= 10<sup>9</sup></code>
