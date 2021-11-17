package com.leetcode.my.removeNthNodeFromEndOfList;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

abstract class BaseSolutionTest {

    /**
     * Input: head = [1,2,3,4,5], n = 2
     * Output: [1,2,3,5]
     */
    @Test
    public void removeNthNodeFromEndOfList_test1() {
        val head = createListNode(1, 2, 3, 4, 5);
        val n = 2;
        val output = createListNode(1, 2, 3, 5);
        val res = removeNthFromEnd(head, n);
        assertEquals(output, res);
    }

    /**
     * Input: head = [1], n = 1
     * Output: []
     */
    @Test
    public void removeNthNodeFromEndOfList_test2() {
        val head = createListNode(1);
        val n = 1;
        final ListNode output = null;
        val res = removeNthFromEnd(head, n);
        assertEquals(output, res);
    }

    /**
     * Input: head = [1,2], n = 1
     * Output: [1]
     */
    @Test
    public void removeNthNodeFromEndOfList_test3() {
        val head = createListNode(1, 2);
        val n = 1;
        val output = createListNode(1);
        val res = removeNthFromEnd(head, n);
        assertEquals(output, res);
    }

    abstract ListNode removeNthFromEnd(ListNode head, int n);

    private ListNode createListNode(final int... nums) {
        if (nums == null || nums.length == 0) {
            return new ListNode();
        }
        var node = new ListNode(nums[nums.length - 1]);
        for (var i = nums.length - 2; i >= 0; i--) {
            node = new ListNode(nums[i], node);
        }
        return node;
    }
}
