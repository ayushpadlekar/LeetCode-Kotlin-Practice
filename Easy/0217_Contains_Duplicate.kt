// 217. Contains Duplicate
// Given an integer array nums, return true if any value appears at least twice in the array,
// and return false if every element is distinct.

// Example 1:
// Input: nums = [1,2,3,1]
// Output: true
// Explanation:
// The element 1 occurs at the indices 0 and 3.

// Example 2:
// Input: nums = [1,2,3,4]
// Output: false
// Explanation:
// All elements are distinct.

// Example 3:
// Input: nums = [1,1,1,3,3,4,3,2,4,2]
// Output: true


// 3825ms - Mutable List, contains, add - Approach
class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        
        var list: MutableList<Int> = mutableListOf()
        
        for(i in 0 until nums.size) {
            if(list.contains(nums[i])) {
                return true
            } else {
                list.add(nums[i])
            }
        }
        return false
    }
}

// 21ms - Mutable Set, contains, add - Approach
class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        
        var list: MutableSet<Int> = mutableSetOf()

        for(i in 0 until nums.size) {
            if(list.contains(nums[i])) {
                return true
            } else {
                list.add(nums[i])
            }
        }
        return false
    }
}
