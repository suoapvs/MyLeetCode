### 108. Convert Sorted Array to Binary Search Tree

<span style="color:green">Easy</span>

Given an integer array `nums` where the elements are 
sorted in __ascending order__, convert it to _a __height-balanced__ 
binary search tree_.

A __height-balanced__ binary tree is a binary tree in which 
the depth of the two subtrees of every node never differs 
by more than one.

__Example 1:__

![](https://assets.leetcode.com/uploads/2021/02/18/btree1.jpg)
<pre>
<b>Input:</b> nums = [-10,-3,0,5,9]
<b>Output:</b> [0,-3,9,-10,null,5]
<b>Explanation:</b> [0,-10,5,null,-3,null,9] is also accepted:
</pre>
![](https://assets.leetcode.com/uploads/2021/02/18/btree2.jpg)

__Example 2:__

![](https://assets.leetcode.com/uploads/2021/02/18/btree.jpg)
<pre>
<b>Input:</b> nums = [1,3]
<b>Output:</b> [3,1]
<b>Explanation:</b> [1,3] and [3,1] are both a height-balanced BSTs.
</pre>

__Constraints:__
* <code>1 <= nums.length <= 10<sup>4</sup></code>
* <code>-10<sup>4</sup> <= nums[i] <= 10<sup>4</sup></code>
* `nums` is sorted in a __strictly increasing__ order.

[On LeetCode](https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/)
