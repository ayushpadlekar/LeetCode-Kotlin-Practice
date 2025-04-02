// 28. Find the Index of the First Occurrence in a String
// Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

// Example 1:
// Input: haystack = "sadbutsad", needle = "sad"
// Output: 0
// Explanation: "sad" occurs at index 0 and 6.
// The first occurrence is at index 0, so we return 0.

// Example 2:
// Input: haystack = "leetcode", needle = "leeto"
// Output: -1
// Explanation: "leeto" did not occur in "leetcode", so we return -1.

// Sub-String Approach
class Solution {
    fun strStr(haystack: String, needle: String): Int {
        
        for(i in 0..haystack.length - needle.length){
            if(needle[0] == haystack[i]) {
                if(haystack.substring(i, (i + needle.length)) == needle){
                    return i
                }
            }
        }
        return -1
    }
}

// 1-liner solution - using indexOf() inbuilt kotlin function.
class Solution {
    fun strStr(haystack: String, needle: String): Int {
        
        return haystack.indexOf(needle)
    }
}
