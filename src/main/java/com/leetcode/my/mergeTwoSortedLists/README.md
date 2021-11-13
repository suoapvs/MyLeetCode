<a href="https://leetcode.com/problems/merge-two-sorted-lists/" target="_blank">
    <img src="/leetcode-logo.png" style="width:200px" alt="LeetCode"/>
</a>

### 21. Merge Two Sorted Lists

<span style="color:green">Easy</span>

Merge two sorted linked lists and return it as a __sorted__ list. The list
should be made by splicing together the nodes of the first two lists.

__Example 1:__

![](https://assets.leetcode.com/uploads/2020/10/03/merge_ex1.jpg)

<pre>
<b>Input:</b> l1 = [1,2,4], l2 = [1,3,4]
<b>Output:</b> [1,1,2,3,4,4]
</pre>

__Example 2:__
<pre>
<b>Input:</b> l1 = [], l2 = []
<b>Output:</b> []
</pre>

__Example 3:__
<pre>
<b>Input:</b> l1 = [], l2 = [0]
<b>Output:</b> [0]
</pre>

__Constraints:__

* The number of nodes in each linked list is in the range `[1,50]`.
* `-100 <= Node.val <= 100`
* Both `l1` and `l2` are sorted in __non-decreasing__ order.
