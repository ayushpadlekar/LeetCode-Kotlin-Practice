// 219. Contains Duplicate II
// Given an integer array nums and an integer k,
// return true if there are two distinct indices i and j in the array
// such that nums[i] == nums[j] and abs(i - j) <= k.

// Example 1:
// Input: nums = [1,2,3,1], k = 3
// Output: true

// Example 2:
// Input: nums = [1,0,1,1], k = 1
// Output: true

// Example 3:
// Input: nums = [1,2,3,1,2,3], k = 2
// Output: false


// 35ms - Mutable Map, contains, put, Math.abs Approach
class Solution {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        
        val map: MutableMap<Int, Int> = mutableMapOf()

        for(i in 0 until nums.size) {
            if(map.contains(nums[i])) {
                if(Math.abs(map.getValue(nums[i]) - i) <= k) {
                    return true
                } else {
                    map.put(nums[i], i)
                }
            } else {
                map.put(nums[i], i)
            }
        }
        return false
    }
}
