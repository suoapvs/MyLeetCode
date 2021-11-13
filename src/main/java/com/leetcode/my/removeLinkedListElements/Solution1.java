package com.leetcode.my.removeLinkedListElements;

class Solution1 {

    public ListNode removeElements(
            final ListNode head,
            final int val
    ) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;
        while (current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return dummy.next;
    }
}
