// Kotlin - String Approach
class Solution {
    fun isPalindrome(x: Int): Boolean {
        
        val num: String
        if(x >= 0) {
            num = x.toString()
        } else {
            return false
        }
        var start = 0
        var end = num.length-1

        while(start < end) {
            if(num[start] != num[end]) {
                return false
            }
            start++
            end--
        }
        return true
    }
}


// Kotlin 1-line - inbuilt functions:- toString(), reversed()
class Solution {
    fun isPalindrome(x: Int): Boolean {
        
        return x.toString() == x.toString().reversed()
    }
}


// Kotlin let-it toString(), reversed() approach.
class Solution {
    fun isPalindrome(x: Int): Boolean {
        
        return x.toString().let{ it == it.reversed() }
    }
}
