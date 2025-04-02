// 125. Valid Palindrome (String)

// 14ms - filter - isLetterOrDigit() Approach
class Solution {
    fun isPalindrome(s: String): Boolean {
        
        var filtered = s.filter { it.isLetterOrDigit() }.lowercase()
        
        return filtered == filtered.reversed()
    }
}

// 36ms - replace Regex Approach
class Solution {
    fun isPalindrome(s: String): Boolean {
        
        var filtered = s.replace(Regex("[^A-Za-z0-9]"), "").lowercase()
        
        return filtered == filtered.reversed()
    }
}

// 177ms - char in range Approach
class Solution {
    fun isPalindrome(s: String): Boolean {
        
        var filtered = ""
        for (char in s.lowercase()) {
            if (char in 'a'..'z' || char in '0'..'9') {
                filtered += char
            }
        }
        
        return filtered == filtered.reversed()
    }
}
