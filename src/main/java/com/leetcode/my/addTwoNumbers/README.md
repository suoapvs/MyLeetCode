<a href="https://leetcode.com/problems/add-two-numbers/" target="_blank">
    <img src="https://assets.leetcode.com/static_assets/public/webpack_bundles/images/logo-dark.e99485d9b.svg" 
         style="width:150px" alt="LeetCode"/>
</a>

### 2. Add Two Numbers

<span style="color:orange">Medium</span>

You are given two non-empty linked lists representing two non-negative integers.
The digits are stored in reverse order, and each of their nodes contains a
single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the
number 0 itself.

__Example 1:__

![](https://assets.leetcode.com/uploads/2020/10/02/addtwonumber1.jpg)

<pre>
<b>Input:</b> l1 = [2,4,3], l2 = [5,6,4]
<b>Output:</b> [7,0,8]
<b>Explanation:</b> 342 + 465 = 807.
</pre>

__Example 2:__
<pre>
<b>Input:</b> l1 = [0], l2 = [0]
<b>Output:</b> [0]
</pre>

__Example 3:__
<pre>
<b>Input:</b> l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
<b>Output:</b> [8,9,9,9,0,0,0,1]
</pre>

__Constraints:__

* The number of nodes in each linked list is in the range `[1,100]`.
* `0 <= Node.val <= 9`
* It is guaranteed that the list represents a number that does not have leading
  zeros.
