package com.leetcode.my.removeLinkedListElements;

class Solution2 {

    public ListNode removeElements(
            ListNode head,
            int val
    ) {
        if (head == null) {
            return null;
        }
        ListNode current = head;
        // if cur starts with val to be deleted, then cur is moved to till it's not a value to be deleted
        while (current != null && current.val == val) {
            current = current.next;
        }
        // the head is now the first cur that's not a value to be deleted
        head = current;
        //check if cur.next is val, if so, cur.next to cur.next.next
        // if not, cur = cur.next;
        while ((current != null) && (current.next != null)) {
            if (current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
}
