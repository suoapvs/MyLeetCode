<a href="https://leetcode.com/problems/my-calendar-i/">
    <img src="/leetcode-logo.png" style="width:200px" alt="LeetCode"/>
</a>

### 729. My Calendar I

:orange_circle: Medium

You are implementing a program to use as your calendar. 
We can add a new event if adding the event will not cause a __double booking__.

A __double booking__ happens when two events have some non-empty intersection 
(i.e., some moment is common to both events.).

The event can be represented as a pair of integers `start` and `end` that 
represents a booking on the half-open interval `[start, end)`, 
the range of real numbers `x` such that `start <= x < end`.

Implement the MyCalendar class:

* `MyCalendar()` Initializes the calendar object.
* `boolean book(int start, int end)` Returns `true` if the event can be 
  added to the calendar successfully without causing a __double booking__. 
  Otherwise, return `false` and do not add the event to the calendar.


__Example 1:__
<pre>
<b>Input:</b>
["MyCalendar", "book", "book", "book"]
[[], [10, 20], [15, 25], [20, 30]]
<b>Output:</b>
[null, true, false, true]
<b>Explanation</b>
MyCalendar myCalendar = new MyCalendar();
myCalendar.book(10, 20); // return True
myCalendar.book(15, 25); // return False, It can not be booked because time 15 
is already booked by another event.
myCalendar.book(20, 30); // return True, The event can be booked, 
as the first event takes every time less than 20, but not including 20.
</pre>

__Constraints:__

* <code>0 <= start < end <= 10<sup>9</sup></code>
* At most `1000` calls will be made to `book`.
