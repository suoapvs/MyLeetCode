<a href="https://leetcode.com/problems/remove-nth-node-from-end-of-list/">
    <img src="/leetcode-logo.png" style="width:200px" alt="LeetCode"/>
</a>

### 19. Remove Nth Node From End of List

:orange_circle: Medium

Given the `head` of a linked list, remove the<code>n<sup>th</sup></code> node
from the end of the list and return its head.

__Example 1:__

![](https://assets.leetcode.com/uploads/2020/10/03/remove_ex1.jpg)

<pre>
<b>Input:</b> head = [1,2,3,4,5], n = 2
<b>Output:</b> [1,2,3,5]
</pre>

__Example 2:__
<pre>
<b>Input:</b> head = [1], n = 1
<b>Output:</b> []
</pre>

__Example 3:__
<pre>
<b>Input:</b> head = [1,2], n = 1
<b>Output:</b> [1]
</pre>

__Constraints:__

* The number of nodes in the list is sz.
* `1 <= sz <= 30`
* `0 <= Node.val <= 100`
* `1 <= n <= sz`
