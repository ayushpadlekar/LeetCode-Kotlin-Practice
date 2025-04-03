// 58. Length of Last Word
// Given a string s consisting of words and spaces, return the length of the last word in the string.
// A word is a maximal substring consisting of non-space characters only.

// Example 1:
// Input: s = "Hello World"
// Output: 5
// Explanation: The last word is "World" with length 5.

// Example 2:
// Input: s = "   fly me   to   the moon  "
// Output: 4
// Explanation: The last word is "moon" with length 4.

// Example 3:
// Input: s = "luffy is still joyboy"
// Output: 6
// Explanation: The last word is "joyboy" with length 6.

// 0ms - counter++
class Solution {
    fun lengthOfLastWord(s: String): Int {
        // Beginner Logic - counter++
        var counter = 0
        for(i in s.length-1 downTo 0) {
            if(s[i] != ' ') {
                counter ++
            } else if(counter != 0) {
                break
            }
        }
        return counter
    }
}

// trim(), counter++
class Solution {
    fun lengthOfLastWord(s: String): Int {
        var counter = 0
        var sTrim = s.trim()
        for(i in sTrim.length-1 downTo 0) {
            if(sTrim[i] != ' ') {
                counter ++
            } else {
                break
            }
        }
        return counter
    }
}
