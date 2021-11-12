### 203. Remove Linked List Elements

<span style="color:green">Easy</span>

Given the `head` of a linked list and an integer `val`, 
remove all the nodes of the linked list that has 
`Node.val == val`, and return the new head.

__Example 1:__

![](https://assets.leetcode.com/uploads/2021/03/06/removelinked-list.jpg)
<pre>
<b>Input:</b> head = [1,2,6,3,4,5,6], val = 6
<b>Output:</b> [1,2,3,4,5]
</pre>

__Example 2:__
<pre>
<b>Input:</b> head = [], val = 1
<b>Output:</b> []
</pre>

__Example 3:__
<pre>
<b>Input:</b> head = [7,7,7,7], val = 7
<b>Output:</b> []
</pre>

__Constraints:__
* The number of nodes in the list is 
  in the range <code>[0, 10<sup>4</sup>]</code>.
* `1 <= Node.val <= 50`
* `0 <= val <= 50`

[On LeetCode](https://leetcode.com/problems/remove-linked-list-elements/)
