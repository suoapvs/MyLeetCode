package com.leetcode.my.iteratorForCombination;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Your CombinationIterator object will be instantiated and called as such:
 * CombinationIterator obj = new CombinationIterator(characters, combinationLength);
 * String param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
class CombinationIterator1 implements Iterator<String> {

    /**
     * An unbounded priority queue based on a priority heap.
     * The elements of the priority queue are ordered according
     * to their natural ordering, or by a Comparator provided
     * at queue construction time, depending on which constructor is used.
     */
    private final Queue<String> combinations = new PriorityQueue<>();

    public CombinationIterator1(
            final String characters,
            final int combinationLength
    ) {
        generateComb(characters, combinationLength);
    }

    public String next() {
        return this.combinations.poll();
    }

    public boolean hasNext() {
        return !this.combinations.isEmpty();
    }

    private void generateComb(
            final String characters,
            final int combinationLength
    ) {
        generateComb(
                characters.toCharArray(), combinationLength,
                0, new StringBuilder()
        );
    }

    private void generateComb(
            final char[] characters,
            final int combinationLength,
            final int startIndex,
            final StringBuilder sb
    ) {
        if (combinationLength == 0) {
            this.combinations.add(sb.toString());
            return;
        }
        for (int i = startIndex; i <= characters.length - combinationLength; i++) {
            sb.append(characters[i]);
            generateComb(characters, combinationLength - 1, i + 1, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
