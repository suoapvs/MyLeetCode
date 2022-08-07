package com.leetcode.my.myCalendarI;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

abstract class BaseSolutionTest {

    /**
     * <Input:
     * ["MyCalendar", "book", "book", "book"]
     * [[], [10, 20], [15, 25], [20, 30]]
     * Output:
     * [null, true, false, true]
     */
    @Test
    public void myCalendarI_test1() {
        val myCalendar = createCalendar();
        assertTrue(myCalendar.book(10, 20));
        assertFalse(myCalendar.book(15, 25));
        assertTrue(myCalendar.book(20, 30));
    }

    abstract MyCalendar createCalendar();
}
