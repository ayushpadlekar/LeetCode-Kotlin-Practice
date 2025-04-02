// 14. Longest Common Prefix
// Write a function to find the longest common prefix string amongst an array of strings.
// If there is no common prefix, return an empty string "". 

// Example 1:
// Input: strs = ["flower","flow","flight"]
// Output: "fl"

// Example 2:
// Input: strs = ["dog","racecar","car"]
// Output: ""
// Explanation: There is no common prefix among the input strings.

class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {

    // result variable to store string
    var result = ""

    // sort the array
    strs.sort()

    // Get the first & last String from the array
    // & convert it to charArray
    var first = strs[0].toCharArray()
    var last = strs[strs.size-1].toCharArray()

    // Get the minimum length of first & last  // To avoid index Out of bounds.
    val minLength = minOf(first.size, last.size)

    // Start comparing each char in both
    for(i in 0 until minLength) {
        if(first[i] == last[i]) {
            result += first[i] // add each char in result if it is equal in both.
        } else {
            break // if it is not equal, immediately break the loop,
            // otherwise it will add next common char in the result.
        }
    }

    // Return the result
    return result

    }
}
