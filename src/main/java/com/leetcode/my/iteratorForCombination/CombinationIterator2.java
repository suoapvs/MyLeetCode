package com.leetcode.my.iteratorForCombination;

import java.util.*;

/**
 * Your CombinationIterator object will be instantiated and called as such:
 * CombinationIterator obj = new CombinationIterator(characters, combinationLength);
 * String param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
class CombinationIterator2 implements Iterator<String> {

    private final List<String> combinations = new ArrayList<>();
    private int index = 0;

    public CombinationIterator2(
            final String characters,
            final int combinationLength
    ) {
        generateComb(characters, combinationLength);
    }

    public String next() {
        return this.combinations.get(this.index++);
    }

    public boolean hasNext() {
        return this.index < this.combinations.size();
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
        // if the combination is done
        if (combinationLength == 0) {
            this.combinations.add(sb.toString());
            return;
        }
        final int endIndex = characters.length - combinationLength + 1;
        for (int i = startIndex; i < endIndex; i++) {
            // add i into the current combination
            sb.append(characters[i]);
            // use next integers to complete the combination
            generateComb(characters, combinationLength - 1, i + 1, sb);
            // backtrack
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
