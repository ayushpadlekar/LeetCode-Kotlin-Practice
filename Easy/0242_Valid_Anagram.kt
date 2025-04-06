// 242. Valid Anagram
// Given two strings s and t, return true if t is an anagram of s, and false otherwise.

// Example 1:
// Input: s = "anagram", t = "nagaram"
// Output: true

// Example 2:
// Input: s = "rat", t = "car"
// Output: false


// 12ms - toCharArray, sort, contentEquals
class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        
        val s = s.toCharArray()
        val t = t.toCharArray()

        s.sort()
        t.sort()

        return s.contentEquals(t)
    }
}

// 32ms - toCharArray, 2 maps, 2 for loops, if else, map contains put, default frequency, increment frequency, check 2 maps are equal.
class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        
        // if lengths aint equal -> false
        if(s.length != t.length) return false

        // String to Char Array (to loop through characters)
        val s = s.toCharArray()
        val t = t.toCharArray()

        // Maps to hold both char arrays with their frequency.
        val sMap: MutableMap<Char, Int> = mutableMapOf()
        val tMap: MutableMap<Char, Int> = mutableMapOf()

        var default = 1 // default frequency of characters

        // string 's' for loop
        for(i in s) {
            // check whether map already contains the char.
            if(sMap.contains(i)) {
                var sNew = sMap.getValue(i) // get frequency value of the char from the map
                sNew++  // increment
                sMap.put(i, sNew) // put that new value.
            } else {
                sMap.put(i, default) // put if it doesn't contain the char.
            }
        }
        
        // string 't' for loop
        for(j in t) {
            // check whether map already contains the char.
            if(tMap.contains(j)) {
                var tNew = tMap.getValue(j) // get frequency value of the char from the map
                tNew++  // increment
                tMap.put(j, tNew) // put that new value.
            } else {
                tMap.put(j, default) // put if it doesn't contain the char.
            }
        }

        // check whether both maps are equal -> return true
        if(sMap == tMap) return true

        return false // false if they aint equal.
    }
}
