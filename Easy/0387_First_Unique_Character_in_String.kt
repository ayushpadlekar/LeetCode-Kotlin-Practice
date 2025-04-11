// 387. First Unique Character in a String
// Given a string s, find the first non-repeating character in it and return its index.
// If it does not exist, return -1.

// Example 1:
// Input: s = "leetcode"
// Output: 0
// Explanation:
// The character 'l' at index 0 is the first character that does not occur at any other index.

// Example 2:
// Input: s = "loveleetcode"
// Output: 2

// Example 3:
// Input: s = "aabb"
// Output: -1


// 60ms - Map, contains(), frequency, 2 for loops - Approach
class Solution {
    fun firstUniqChar(s: String): Int {
        
        var map: MutableMap<Char, Int> = mutableMapOf()
        for(c in s) {
            if(map.contains(c)) {
                var newVal = map.getValue(c)
                newVal++
                map.put(c, newVal)
            } else {
                map.put(c, 1)
            }
        }
        for(i in 0 until s.length) {
            var freq = map.getValue(s[i])
            if(freq == 1) {
                return i
            }
        }
        return -1
    }
}
