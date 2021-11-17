package com.leetcode.my.middleOfTheLinkedList;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

abstract class BaseSolutionTest {

    /**
     * Input: head = [1,2,3,4,5]
     * Output: [3,4,5]
     * Explanation:
     * The middle node of the list is node 3.
     */
    @Test
    public void middleOfTheLinkedList_test1() {
        val head = createListNode(1, 2, 3, 4, 5);
        val output = createListNode(3, 4, 5);
        val res = middleNode(head);
        assertEquals(output, res);
    }

    /**
     * Input: head = [1,2,3,4,5,6]
     * Output: [4,5,6]
     * Explanation:
     * Since the list has two middle nodes with values 3 and 4,
     * we return the second one.
     */
    @Test
    public void middleOfTheLinkedList_test2() {
        val head = createListNode(1, 2, 3, 4, 5, 6);
        val output = createListNode(4, 5, 6);
        val res = middleNode(head);
        assertEquals(output, res);
    }

    abstract ListNode middleNode(ListNode head);

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
