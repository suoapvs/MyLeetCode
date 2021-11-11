package com.leetcode.my.addTwoNumbers;

class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    // --------------

    @Override
    public String toString() {
        return this.val + (this.next != null ? " -> " + this.next.toString() : "");
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListNode)) {
            return false;
        }
        final ListNode that = (ListNode) o;
        return (this.val == that.val) &&
                (this.next != null) ?
                this.next.equals(that.next) :
                (that.next == null);
    }

    @Override
    public int hashCode() {
        int result = 381;
        result = 31 * result + this.val;
        result = 31 * result + (this.next != null ? this.next.hashCode() : 0);
        return result;
    }
}
