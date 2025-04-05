// 169. Majority Element
// Given an array nums of size n, return the majority element.
// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

// Example 1:
// Input: nums = [3,2,3]
// Output: 3

// Example 2:
// Input: nums = [2,2,1,1,1,2,2]
// Output: 2


// 11ms - Sort, get Middle element
class Solution {
    fun majorityElement(nums: IntArray): Int {
        
        // Sort, get Middle element
        nums.sort()
        return nums[nums.size/2]
    }
}

// 2ms - Moore's Voting Alogorithm -
// for loop, nested if else.
class Solution {
    fun majorityElement(nums: IntArray): Int {
        
        // Moore's Voting Alogorithm
        var cand = 0
        var point = 0
        for(i in 0 until nums.size) {
            if(point == 0) {
                cand = nums[i]
            }
            if(cand == nums[i]) {
                point++
            } else {
                point--
            }
        }
        return cand
    }
}
