package com.leetcode.my.removeDuplicatesFromSortedList;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

abstract class BaseSolutionTest {

    /**
     * Input: nums = [1,1,2]
     * Output: [1,2]
     */
    @Test
    public void deleteDuplicates_test1() {
        val head = createListNode(1, 1, 2);
        val output = createListNode(1, 2);
        val res = deleteDuplicates(head);
        assertEquals(output, res);
    }

    /**
     * Input: nums = [1,1,2,3,3]
     * Output: [1,2,3]
     */
    @Test
    public void deleteDuplicates_test2() {
        val head = createListNode(1, 1, 2, 3, 3);
        val output = createListNode(1, 2, 3);
        val res = deleteDuplicates(head);
        assertEquals(output, res);
    }

    /**
     * Input: nums = [1,1,2,3,3,3,3,3,3,5,6,7,7,7,7,7,10,10,10,10,10,10]
     * Output: [1,2,3,5,6,7,10]
     */
    @Test
    public void deleteDuplicates_test3() {
        val head = createListNode(1, 1, 2, 3, 3, 3, 3, 3, 3, 5, 6, 7, 7, 7, 7, 7, 10, 10, 10, 10, 10, 10);
        val output = createListNode(1, 2, 3, 5, 6, 7, 10);
        val res = deleteDuplicates(head);
        assertEquals(output, res);
    }

    abstract ListNode deleteDuplicates(ListNode head);

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
