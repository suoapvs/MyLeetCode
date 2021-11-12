package com.leetcode.my.removeLinkedListElements;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

abstract class BaseSolutionTest {

    /**
     * Input: head = [1,2,6,3,4,5,6], val = 6
     * Output: [1,2,3,4,5]
     */
    @Test
    public void removeLinkedListElements_test1() {
        val head = createListNode(1,2,6,3,4,5,6);
        val val = 6;
        val output = createListNode(1,2,3,4,5);
        val res = removeElements(head, val);
        assertEquals(output, res);
    }

    /**
     * Input: head = [], val = 1
     * Output: []
     */
    @Test
    public void removeLinkedListElements_test2() {
        val head = createListNode();
        val val = 1;
        val output = createListNode();
        val res = removeElements(head, val);
        assertEquals(output, res);
    }

    /**
     * Input: head = [7,7,7,7], val = 7
     * Output: []
     */
    @Test
    public void removeLinkedListElements_test3() {
        val head = createListNode(7,7,7,7);
        val val = 7;
        final ListNode output = null;
        val res = removeElements(head, val);
        assertEquals(output, res);
    }

    abstract ListNode removeElements(ListNode head, int val);

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
