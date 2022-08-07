<a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array/">
    <img src="/leetcode-logo.png" style="width:200px" alt="LeetCode"/>
</a>

### 26. Remove Duplicates from Sorted Array

:green_circle: Easy

Given an integer array `nums` sorted in __non-decreasing order__, 
remove the duplicates __in-place__ such that each unique element appears only 
__once__. The __relative order__ of the elements should be kept the __same__.

Since it is impossible to change the length of the array in some languages, 
you must instead have the result be placed in the __first part__ of 
the array `nums`. More formally, if there are `k` elements after removing 
the duplicates, then the first `k` elements of `nums` should hold 
the final result. It does not matter what you leave beyond the first `k` elements.

Return `k` _after placing the final result in the first_ `k` _slots of_ `nums`.

Do __not__ allocate extra space for another array. You must do this by 
__modifying the input array in-place__ with O(1) extra memory.

__Custom Judge:__

The judge will test your solution with the following code:

```
int[] nums = [...]; // Input array
int[] expectedNums = [...]; // The expected answer with correct length

int k = removeDuplicates(nums); // Calls your implementation

assert k == expectedNums.length;
for (int i = 0; i < k; i++) {
    assert nums[i] == expectedNums[i];
}
```

If all assertions pass, then your solution will be __accepted__.


__Example 1:__
<pre>
<b>Input:</b> nums = [1,1,2]
<b>Output:</b> 2, nums = [1,2,_]
<b>Explanation:</b> Your function should return k = 2, with the first two 
elements of nums being 1 and 2 respectively. It does not matter what you leave 
beyond the returned k (hence they are underscores).
</pre>

__Example 2:__
<pre>
<b>Input:</b> nums = [0,0,1,1,1,2,2,3,3,4]
<b>Output:</b> 5, nums = [0,1,2,3,4,_,_,_,_,_]
<b>Explanation:</b> Your function should return k = 5, with the first five 
elements of nums being 0, 1, 2, 3, and 4 respectively.It does not matter 
what you leave beyond the returned k (hence they are underscores).
</pre>

__Constraints:__

* <code>1 <= nums.length <= 3 * 10<sup>4</sup></code>
* `-100 <= nums[i] <= 100`
* `nums` is sorted in __non-decreasing__ order.
