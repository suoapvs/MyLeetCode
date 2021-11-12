package com.leetcode.my.mergeTwoSortedLists;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

abstract class BaseSolutionTest {

    /**
     * Input: l1 = [1,2,4], l2 = [1,3,4]
     * Output: [1,1,2,3,4,4]
     */
    @Test
    public void mergeTwoSortedLists_test1() {
        val l1 = createListNode(1, 2, 4);
        val l2 = createListNode(1, 3, 4);
        val output = createListNode(1, 1, 2, 3, 4, 4);
        val res = mergeTwoLists(l1, l2);
        assertEquals(output, res);
    }

    /**
     * Input: l1 = [], l2 = []
     * Output: []
     */
    @Test
    public void mergeTwoSortedLists_test2() {
        final ListNode l1 = null;
        final ListNode l2 = null;
        final ListNode output = null;
        val res = mergeTwoLists(l1, l2);
        assertEquals(output, res);
    }

    /**
     * Input: l1 = [1,2,4], l2 = [1,3,4]
     * Output: [1,1,2,3,4,4]
     */
    @Test
    public void mergeTwoSortedLists_test3() {
        final ListNode l1 = null;
        val l2 = createListNode(0);
        //noinspection UnnecessaryLocalVariable
        val output = l2;
        val res = mergeTwoLists(l1, l2);
        assertEquals(output, res);
    }

    abstract ListNode mergeTwoLists(ListNode l1, ListNode l2);

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
