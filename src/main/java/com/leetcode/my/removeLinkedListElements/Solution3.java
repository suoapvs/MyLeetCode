package com.leetcode.my.removeLinkedListElements;

class Solution3 {

    public ListNode removeElements(
            final ListNode head,
            final int val
    ) {
        if (head == null) {
            return null;
        }
        head.next = removeElements(head.next, val);
        return (head.val == val) ? head.next : head;
    }
}
