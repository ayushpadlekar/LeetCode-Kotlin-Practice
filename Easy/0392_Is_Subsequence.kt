// 392. Is Subsequence
// Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
// A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

// Example 1:
// Input: s = "abc", t = "ahbgdc"
// Output: true

// Example 2:
// Input: s = "axc", t = "ahbgdc"
// Output: false


// 1ms - two pointers, while loop, if else, pointers++
class Solution {
    fun isSubsequence(s: String, t: String): Boolean {

        if(s.length == 0) return true
        
        var i = 0
        var j = 0
        while(i<s.length && j<t.length) {
            if(s[i] == t[j]) {
                i++
                j++
            } else {
                j++
            }
        }
        if(i == s.length) return true

        return false
    }
}
