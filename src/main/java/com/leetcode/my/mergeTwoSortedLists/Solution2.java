package com.leetcode.my.mergeTwoSortedLists;

class Solution2 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) {
            return l2;
        }
        if(l2 == null) {
            return l1;
        }
        ListNode dummy = new ListNode();
        ListNode prev = dummy;
        do {
            if(l1.val < l2.val) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        } while((l1 != null) && (l2 != null));
        prev.next = (l1 == null) ? l2 : l1;
        return dummy.next;
    }
}
