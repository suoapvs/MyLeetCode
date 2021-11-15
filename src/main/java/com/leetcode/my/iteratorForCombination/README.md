<a href="https://leetcode.com/problems/iterator-for-combination/">
    <img src="/leetcode-logo.png" style="width:200px" alt="LeetCode"/>
</a>

### 1286. Iterator for Combination

:orange_circle: Medium

Design the `CombinationIterator` class:

* `CombinationIterator(string characters, int combinationLength)` Initializes
  the object with a string `characters` of __sorted distinct__ lowercase English
  letters and a number `combinationLength` as arguments.
* `next()` Returns the next combination of length `combinationLength` in
  __lexicographical order__.
* `hasNext()` Returns `true` if and only if there exists a next combination.

__Example 1:__
<pre>
<b>Input:</b>
["CombinationIterator", "next", "hasNext", "next", "hasNext", "next", "hasNext"]
[["abc", 2], [], [], [], [], [], []]
<b>Output:</b>
[null, "ab", true, "ac", true, "bc", false]

<b>Explanation:</b>
CombinationIterator itr = new CombinationIterator("abc", 2);
itr.next();    // return "ab"
itr.hasNext(); // return True
itr.next();    // return "ac"
itr.hasNext(); // return True
itr.next();    // return "bc"
itr.hasNext(); // return False
</pre>

__Constraints:__

* `1 <= combinationLength <= characters.length <= 15`
* All the characters of `characters` are __unique__.
* At most <code>10<sup>4</sup></code> calls will be made to next and hasNext.
* It's guaranteed that all calls of the function `next` are valid.
