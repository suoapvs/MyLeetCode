package com.leetcode.my.myCalendarI;

import java.util.ArrayList;
import java.util.List;


class MyCalendarSolution1 implements MyCalendar {

    private static final class Node {

        final int start;
        final int end;

        Node(final int start, final int end) {
            this.start = start;
            this.end = end;
        }
    }

    private final List<Node> nodes;

    public MyCalendarSolution1() {
        this.nodes = new ArrayList<>();
    }

    public boolean book(final int start, final int end) {
        for (Node n: this.nodes) {
            if (n.start < end && start < n.end) {
                return false;
            }
        }
        this.nodes.add(new Node(start, end));
        return true;
    }
}
