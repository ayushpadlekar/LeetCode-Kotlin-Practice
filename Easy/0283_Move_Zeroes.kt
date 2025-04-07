// 283. Move Zeroes
// Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
// Note that you must do this in-place without making a copy of the array.

// Example 1:
// Input: nums = [0,1,0,3,12]
// Output: [1,3,12,0,0]

// Example 2:
// Input: nums = [0]
// Output: [0]


// 2ms - extra index, for loop, if, while loop
class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        
        var insertIndex = 0

        for(i in 0 until nums.size) {
            if(nums[i] != 0) {
                nums[insertIndex] = nums[i]
                insertIndex++
            }
        }
        while(insertIndex < nums.size) {
            nums[insertIndex] = 0
            insertIndex++
        }
    }
}

// 11ms - filter{ }, for loop, if else if - Approach
class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        
        var numsArray: IntArray = intArrayOf()
        var zerosArray: IntArray = intArrayOf()
        
        zerosArray = nums.filter { it == 0 }.toIntArray()
        numsArray = nums.filter { it != 0 }.toIntArray()

        for(i in 0 until nums.size) {
            if(i < numsArray.size) {
                nums[i] = numsArray[i]
            } else {
                val zerosIndex = i - numsArray.size
                if(zerosIndex < zerosArray.size) {
                    nums[i] = zerosArray[zerosIndex]
                }
            }
        }
    }
}
