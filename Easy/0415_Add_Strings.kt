// 415. Add Strings
// Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.
// You must solve the problem without using any built-in library for handling large integers (such as BigInteger).
// You must also not convert the inputs to integers directly.

// Example 1:
// Input: num1 = "11", num2 = "123"
// Output: "134"

// Example 2:
// Input: num1 = "456", num2 = "77"
// Output: "533"

// Example 3:
// Input: num1 = "0", num2 = "0"
// Output: "0"


// 19ms - while loop, char to digit, sum carry Approach.
class Solution {
    fun addStrings(num1: String, num2: String): String {
        
        // Doesn't work for very large numbers :(-----------------
        // var n1 = 0L
        // var n2 = 0L
        // for(i in num1) {
        //     n1 = n1*10 + i.digitToInt()
        // }
        // for(j in num2) {
        //     n2 = n2*10 + j.digitToInt()
        // }
        // var n3 = n1+n2
        // return n3.toString()

        var n1Li = num1.length-1
        var n2Li = num2.length-1
        var carry = 0
        var res = ""

        while(n1Li >= 0 || n2Li >= 0 || carry > 0) {

            var digit1 = if(n1Li >= 0) num1[n1Li].digitToInt() else 0
            var digit2 = if(n2Li >= 0) num2[n2Li].digitToInt() else 0
            var sum = digit1 + digit2 + carry
            carry = sum/10
            res += (sum%10).toString()
            n1Li--
            n2Li--
        }
        return res.reversed()
    }
}
