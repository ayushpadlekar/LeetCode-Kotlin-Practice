// 344. Reverse String array
// Write a function that reverses a string. The input string is given as an array of characters s.
// You must do this by modifying the input array in-place with O(1) extra memory.

// Example 1:
// Input: s = ["h","e","l","l","o"]
// Output: ["o","l","l","e","h"]

// Example 2:
// Input: s = ["H","a","n","n","a","h"]
// Output: ["h","a","n","n","a","H"]


// 0ms - 2 pointers (start, end), While loop, temp, start++, end--
class Solution {
    fun reverseString(s: CharArray): Unit {
        
        var i = 0
        var j = s.size-1
        while(i <= j) {
            val temp = s[i]
            s[i] = s[j]
            s[j] = temp
            i++
            j--
        }
    }
}
