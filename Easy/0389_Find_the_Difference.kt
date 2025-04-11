// 389. Find the Difference
// You are given two strings s and t.
// String t is generated by random shuffling string s and then add one more letter at a random position.
// Return the letter that was added to t.

// Example 1:
// Input: s = "abcd", t = "abcde"
// Output: "e"
// Explanation: 'e' is the letter that was added.

// Example 2:
// Input: s = "", t = "y"
// Output: "y"


// 3ms - ASCII values frequency, 3 for loops - Approach
class Solution {
    fun findTheDifference(s: String, t: String): Char {
        
        val arr = IntArray(26)
        s.toCharArray()
        t.toCharArray()

        for(ch in s) {
            arr[ch - 'a']++
        }
        for(ch in t) {
            arr[ch - 'a']--
        }
        for((i, j) in arr.withIndex()) {
            if(j != 0) {
                return ('a' + i).toChar()
            }
        }
        return ' '
    }
}
