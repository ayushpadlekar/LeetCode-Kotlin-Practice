// 367. Valid Perfect Square
// Given a positive integer num, return true if num is a perfect square or false otherwise.
// A perfect square is an integer that is the square of an integer. In other words, it is the product of some integer with itself.
// You must not use any built-in library function, such as sqrt.

// Example 1:
// Input: num = 16
// Output: true
// Explanation: We return true because 4 * 4 = 16 and 4 is an integer.

// Example 2:
// Input: num = 14
// Output: false
// Explanation: We return false because 3.742 * 3.742 = 14 and 3.742 is not an integer.


// 2ms - for loop, toLong(), i*i, if-conditions Approach - O(sqrt(num)), O(1)
class Solution {
    fun isPerfectSquare(num: Int): Boolean {
        if (num < 0) return false
        if (num == 0) return true

        for (i in 1..num) {
            val square: Long = i.toLong() * i.toLong()
            if (square == num.toLong()) {
                return true
            }
            if (square > num) { // If the square exceeds num, no need to continue
                return false
            }
        }
        return false
    }
}

// 0ms - Binary Search algorithm Approach - O(log n), O(1)
class Solution {
    fun isPerfectSquare(num: Int): Boolean {
        
        if (num < 0) return false
        if (num == 0 || num == 1) return true

        val num = num.toLong()
        var left = 1L
        var right = num

        while(left <= right) {
            val mid: Long = left + (right - left) / 2
            val square: Long = mid * mid
            if(square == num) {
                return true
                break
            } else if(square > num) {
                right = mid - 1
            } else {
                left = mid + 1
            }
        }
        return false
    }
}
