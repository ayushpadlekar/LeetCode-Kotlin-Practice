// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// You can return the answer in any order.

// Example 1:
// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

// 1st way - for loops
class Solution {

    fun twoSum(nums: IntArray, target: Int): IntArray {
        for (i in 0 until nums.size) {
            for (j in i+1 until nums.size) {
                if (nums[i] + nums[j] == target) {
                    return intArrayOf(i, j)
                }
            }
        }
    return intArrayOf()
    }
}

// 2nd way - sorting - 2 pointer
nums = nums.sorted()
println(nums)
var i = 0
var j = nums.size-1
while(i < j) {
    if(nums[i] + nums[j] == target) {
        println("$i $j")
        return
    } else if(nums[i] + nums[j] > target) {
        j--
    } else if(nums[i] + nums[j] < target) {
        i++
    }
}


// 3rd way - map
var map = mutableMapOf<Int, Int>()
for(i in nums.indices) {
    val complement = target - nums[i]
    if(map.contains(complement)) {
        println("${map.getValue(complement)}, $i")
        return
    }
    map.put(nums[i], i)
}
println("No results")
