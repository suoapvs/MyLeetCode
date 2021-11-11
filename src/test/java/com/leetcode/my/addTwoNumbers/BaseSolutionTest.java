package com.leetcode.my.addTwoNumbers;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

abstract class BaseSolutionTest {

    /**
     * Input: l1 = [2,4,3], l2 = [5,6,4]
     * Output: [7,0,8]
     * Explanation: 342 + 465 = 807.
     */
    @Test
    public void addTwoNumbers_test1() {
        val l1 = createListNode(2, 4, 3);
        val l2 = createListNode(5, 6, 4);
        val output = createListNode(7, 0, 8);
        val res = addTwoNumbers(l1, l2);
        assertEquals(output, res);
    }

    /**
     * Input: l1 = [0], l2 = [0]
     * Output: [0]
     */
    @Test
    public void addTwoNumbers_test2() {
        val l1 = createListNode(0);
        val l2 = createListNode(0);
        val output = createListNode(0);
        val res = addTwoNumbers(l1, l2);
        assertEquals(output, res);
    }

    /**
     * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
     * Output: [8,9,9,9,0,0,0,1]
     */
    @Test
    public void addTwoNumbers_test3() {
        val l1 = createListNode(9, 9, 9, 9, 9, 9, 9);
        val l2 = createListNode(9, 9, 9, 9);
        val output = createListNode(8, 9, 9, 9, 0, 0, 0, 1);
        val res = addTwoNumbers(l1, l2);
        assertEquals(output, res);
    }

    abstract ListNode addTwoNumbers(ListNode l1, ListNode l2);

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
