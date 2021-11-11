package com.leetcode.my.addTwoNumbers;

class Solution2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null;
        ListNode first = null;
        int rest = 0;
        int sum;
        int tmp_sum;

        while (l1 != null || l2 != null) {
            tmp_sum = ((l1 != null) ? l1.val : 0) +
                    ((l2 != null) ? l2.val : 0);

            sum = (tmp_sum + rest) % 10;
            rest = (tmp_sum + rest) >= 10 ? 1 : 0;

            if (result == null) {
                first = new ListNode(sum);
                result = first;
            } else {
                result.next = new ListNode(sum);
                result = result.next;
            }

            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }
        if (rest > 0) {
            result.next = new ListNode(rest);
        }

        return first;
    }
}
