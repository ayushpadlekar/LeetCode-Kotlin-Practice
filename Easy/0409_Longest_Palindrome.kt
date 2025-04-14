// 409. Longest Palindrome
// Given a string s which consists of lowercase or uppercase letters,
// return the length of the longest palindrome that can be built with those letters.
// Letters are case sensitive, for example, "Aa" is not considered a palindrome.

// Example 1:
// Input: s = "abccccdd"
// Output: 7
// Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.

// Example 2:
// Input: s = "a"
// Output: 1
// Explanation: The longest palindrome that can be built is "a", whose length is 1.


// 
class Solution {
    fun longestPalindrome(s: String): Int {
    var res = 0
    var set = mutableSetOf<Char>();
        for (i in s.indices) {
            //even case
            if (set.contains(s[i])) {
                set.remove(s[i])
                res += 2
            } else {
                set.add(s[i])
            }
        }
        //odd case to add in middle
        if (set.isNotEmpty()) {
            res += 1
        }

        return res
    }
}
