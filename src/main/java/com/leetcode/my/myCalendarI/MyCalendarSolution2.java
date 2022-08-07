package com.leetcode.my.myCalendarI;

class MyCalendarSolution2 implements MyCalendar {

    private static final class TreeNode {

        final int start;
        final int end;

        TreeNode left;
        TreeNode right;

        TreeNode(final int start, final int end) {
            this.start = start;
            this.end = end;
        }
    }

    private TreeNode root;

    public MyCalendarSolution2() {
    }

    public boolean book(int start, int end) {
        if (this.root == null) {
            this.root = new TreeNode(start, end);
            return true;
        }
        return insert(this.root, start, end);
    }

    private boolean insert(TreeNode root, int start, int end) {
        if (end <= root.start) {
            if (root.left == null) {
                root.left = new TreeNode(start, end);
                return true;
            }
            return insert(root.left, start, end);
        }
        if (start >= root.end) {
            if (root.right == null) {
                root.right = new TreeNode(start, end);
                return true;
            }
            return insert(root.right, start, end);
        }
        return false;
    }
}
