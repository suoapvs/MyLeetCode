<a href="https://leetcode.com/problems/remove-element/">
    <img src="/leetcode-logo.png" style="width:200px" alt="LeetCode"/>
</a>

### 27. Remove Element

:green_circle: Easy

Given an integer array `nums` and an integer `val`, remove all occurrences of 
`val` in `nums` __in-place__. The relative order of the elements may be changed.

Since it is impossible to change the length of the array in some languages, 
you must instead have the result be placed in the __first part__ of 
the array `nums`. More formally, if there are `k` elements after removing 
the duplicates, then the first `k` elements of `nums` should hold 
the final result. It does not matter what you leave beyond 
the first `k` elements.

Return `k` _after placing the final result in the first_ `k` _slots of_ `nums`.

Do __not__ allocate extra space for another array. You must do this by 
__modifying the input array in-place__ with O(1) extra memory.

__Custom Judge:__

The judge will test your solution with the following code:

```
int[] nums = [...]; // Input array
int val = ...; // Value to remove
int[] expectedNums = [...]; // The expected answer with correct length.
                            // It is sorted with no values equaling val.

int k = removeElement(nums, val); // Calls your implementation

assert k == expectedNums.length;
sort(nums, 0, k); // Sort the first k elements of nums
for (int i = 0; i < actualLength; i++) {
    assert nums[i] == expectedNums[i];
}
```

If all assertions pass, then your solution will be __accepted__.


__Example 1:__
<pre>
<b>Input:</b> nums = [3,2,2,3], val = 3
<b>Output:</b> 2, nums = [2,2,_,_]
<b>Explanation:</b> Your function should return k = 2, with the first 
two elements of nums being 2. 
It does not matter what you leave beyond 
the returned k (hence they are underscores).
</pre>

__Example 2:__
<pre>
<b>Input:</b> nums = [0,1,2,2,3,0,4,2], val = 2
<b>Output:</b> 5, nums = [0,1,4,0,3,_,_,_]
<b>Explanation:</b> Your function should return k = 5, with the first five 
elements of nums containing 0, 0, 1, 3, and 4.
Note that the five elements can be returned in any order.
It does not matter what you leave beyond the returned k 
(hence they are underscores).
</pre>

__Constraints:__

* `0 <= nums.length <= 100`
* `-100 <= nums[i] <= 100`
* `0 <= val <= 100`
