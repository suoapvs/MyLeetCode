<a href="https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/">
    <img src="/leetcode-logo.png" style="width:200px" alt="LeetCode"/>
</a>

### 378. Kth Smallest Element in a Sorted Matrix

:orange_circle: Medium

Given an `n x n` `matrix` where each of the rows and columns is sorted 
in ascending order, return _the <code>k<sup>th</sup></code> smallest element 
in the matrix_.

Note that it is the <code>k<sup>th</sup></code> smallest element
__in the sorted order__, 
not the <code>k<sup>th</sup></code>__distinct__ element.

You must find a solution with a memory complexity better 
than <code>O(n<sup>2</sup>)</code>.


__Example 1:__
<pre>
<b>Input:</b> matrix = [[1,5,9],[10,11,13],[12,13,15]], k = 8
<b>Output:</b> 13
<b>Explanation:</b> The elements in the matrix are [1,5,9,10,11,12,13,__13__,15], 
and the <code>8<sup>th</sup></code> smallest number is 13
</pre>

__Example 2:__
<pre>
<b>Input:</b> matrix = [[-5]], k = 1
<b>Output:</b> -5
</pre>


__Constraints:__

* `n == matrix.length == matrix[i].length`
* <code>-10<sup>9</sup> <= matrix[i][j] <= 10<sup>9</sup></code>
* All the rows and columns of `matrix` are __guaranteed__ to be sorted 
  in __non-decreasing order__.
* <code>1 <= k <= n<sup>2</sup></code>
