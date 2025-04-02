// 27. Remove Element

class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        
        var counter = 0
        for(i in 0 until nums.size) {
            if(`val` != nums[i]) {
                nums[counter] = nums[i]
                counter++
            }
        }
        return counter
    }
}
