// 342. Power of Four
// Given an integer n, return true if it is a power of four. Otherwise, return false.
// An integer n is a power of four, if there exists an integer x such that n == 4x.

// Example 1:
// Input: n = 16
// Output: true

// Example 2:
// Input: n = 5
// Output: false

// Example 3:
// Input: n = 1
// Output: true


// 1ms - var n, n<=0, n!=1, n%4==0, n/=4, n==1 conditions with while loop, if else - Approach
class Solution {
    fun isPowerOfFour(n: Int): Boolean {
        var n = n
        
        if(n <= 0) return false

        while(n != 1) {
            if(n%4 == 0) {
                n /= 4
            } else {
                break
            }
        }

        return n == 1
    }
}
