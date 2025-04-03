// 70. Climbing Stairs
// You are climbing a staircase. It takes n steps to reach the top.
// Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

// Example 1:
// Input: n = 2
// Output: 2
// Explanation: There are two ways to climb to the top.
// 1. 1 step + 1 step
// 2. 2 steps

// Example 2:
// Input: n = 3
// Output: 3
// Explanation: There are three ways to climb to the top.
// 1. 1 step + 1 step + 1 step
// 2. 1 step + 2 steps
// 3. 2 steps + 1 step

// array to store, ways = n-1ways + n-2ways
class Solution {
    fun climbStairs(n: Int): Int {
        // ways = n-1ways + n-2ways
        if(n == 1) {
            return 1
        }
        var array = IntArray(n+1)
        array[1] = 1
        array[2] = 2

        for(i in 3..n) {
            array[i] = array[i-1] + array[i-2]
        }

        return array[n]
    }
}
