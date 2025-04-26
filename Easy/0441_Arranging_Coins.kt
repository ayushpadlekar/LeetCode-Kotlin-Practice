// 441. Arranging Coins
// You have n coins and you want to build a staircase with these coins.
// The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase may be incomplete.
// Given the integer n, return the number of complete rows of the staircase you will build.

// Example 1:
// Input: n = 5
// Output: 2
// Explanation: Because the 3rd row is incomplete, we return 2.

// Example 2:
// Input: n = 8
// Output: 3
// Explanation: Because the 4th row is incomplete, we return 3.


class Solution {
    fun arrangeCoins(n: Int): Int {
        var n = n.toLong()
        var start = 1.toLong()
        var end = n
      
        
        while(start <= end){
            var mid = start+ (end - start) / 2
            var sum = mid*(mid+1)/2

            if(sum == n) return mid.toInt()
            else if(sum > n) end = mid - 1
            else start = mid + 1

        }
        return end.toInt()
    }
}
