package com.leetcode.my.iteratorForCombination;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/**
 * Your CombinationIterator object will be instantiated and called as such:
 * CombinationIterator obj = new CombinationIterator(characters, combinationLength);
 * String param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
class CombinationIterator3 implements Iterator<String> {

    private final Deque<String> combinations = new ArrayDeque<>();
    private final String characters;
    private final int combinationLength;
    private final int charactersLength;

    public CombinationIterator3(
            final String characters,
            final int combinationLength
    ) {
        this.characters = characters;
        this.combinationLength = combinationLength;
        this.charactersLength = characters.length();
        generateComb();
    }

    public String next() {
        return this.combinations.removeLast();
    }

    public boolean hasNext() {
        return !this.combinations.isEmpty();
    }

    private void generateComb() {
        generateComb(0, new StringBuilder());
    }

    private void generateComb(
            final int startIndex,
            final StringBuilder sb
    ) {
        // if the combination is done
        if (sb.length() == this.combinationLength) {
            this.combinations.push(sb.toString());
            return;
        }
        final int endIndex = this.charactersLength -
                (this.combinationLength - sb.length()) + 1;
        for (int i = startIndex; i < endIndex; i++) {
            // add i into the current combination
            sb.append(this.characters.charAt(i));
            // use next integers to complete the combination
            generateComb(i + 1, sb);
            // backtrack
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
