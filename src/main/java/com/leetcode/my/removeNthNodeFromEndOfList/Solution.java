package com.leetcode.my.removeNthNodeFromEndOfList;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    /**
     * A one pass solution can be done using pointers.
     * Move one pointer fast --> n+1 places forward,
     * to maintain a gap of n between the two pointers
     * and then move both at the same speed.
     * Finally, when the fast pointer reaches the end,
     * the slow pointer will be n+1 places behind -
     * just the right spot for it to be able to skip the next node.
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode startPointer = new ListNode(0);
        ListNode slowPointer = startPointer;
        ListNode fastPointer = startPointer;
        slowPointer.next = head;

        // Move fast in front so that the gap
        // between slow and fast becomes n
        for (int i = 1; i <= n + 1; i++) {
            fastPointer = fastPointer.next;
        }
        // Move fast to the end, maintaining the gap
        while (fastPointer != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next;
        }
        // Skip the desired node
        slowPointer.next = slowPointer.next.next;
        return startPointer.next;
    }
}
