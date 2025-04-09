// 350. Intersection of Two Arrays II
// Given two integer arrays nums1 and nums2, return an array of their intersection.
// Each element in the result must appear as many times as it shows in both arrays
// and you may return the result in any order.

// Example 1:
// Input: nums1 = [1,2,2,1], nums2 = [2,2]
// Output: [2,2]

// Example 2:
// Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
// Output: [4,9]
// Explanation: [9,4] is also accepted.


// 14ms - Map, 2 for loops, if else.
class Solution {
    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        var result: IntArray = intArrayOf()
        var map: MutableMap<Int, Int> = mutableMapOf()

        for(i in nums1) {
            if(map.contains(i)) {
                var newVal = map.getValue(i)
                newVal++
                map.put(i, newVal)
            } else {
                map.put(i, 1)
            }
        }
        for(j in nums2) {
            if(map.contains(j)) {
                var freq = map.getValue(j)
                if(freq > 0) {
                    result += j
                    freq--
                    map.put(j, freq)
                }
            }
        }

        return result
    }
}
