// 448. Find All Numbers Disappeared in an Array
// Given an array nums of n integers where nums[i] is in the range [1, n],
// return an array of all the integers in the range [1, n] that do not appear in nums.

// Example 1:
// Input: nums = [4,3,2,7,8,2,3,1]
// Output: [5,6]

// Example 2:
// Input: nums = [1,1]
// Output: [2]


// 2907 ms - Simplest Approach
class Solution {
    fun findDisappearedNumbers(nums: IntArray): List<Int> {
        
        var list = mutableListOf<Int>()
        for(i in 1..nums.size) {
            if(i !in nums) {
                list.add(i)
            }
        }
        return list
    }
}

// 41 ms - Simplest Approach with to Set.
class Solution {
    fun findDisappearedNumbers(nums: IntArray): List<Int> {
        
        var list = mutableListOf<Int>()
        val set = nums.toSet()
        for(i in 1..nums.size) {
            if(i !in set) {
                list.add(i)
            }
        }
        return list
    }
}

// Copy Array, Negative Marking with Index Approach
class Solution {
    fun findDisappearedNumbers(nums: IntArray): List<Int> {

        var nums2 = nums.copyOf()
        var list = mutableListOf<Int>()

        for (i in 0 until nums.size) {
            val index = nums[i] - 1
            if (nums2[index] > 0) {
                nums2[index] = nums2[index] * -1
            }
        }

        for(j in nums2.indices) {
            if(nums2[j]>=0) {
                list.add(j+1)
            }
        }

        return list
    }
}
