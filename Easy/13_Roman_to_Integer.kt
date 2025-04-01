class Solution {
    fun romanToInt(s: String): Int {
        
        val map = mapOf(
            'I' to 1,
            'V' to 5,
            'X' to 10,
            'L' to 50,
            'C' to 100,
            'D' to 500,
            'M' to 1000
        )
        var result = 0
        var i = 0

        while(i < s.length) {
            val currentValue = map[s[i]] ?: 0
            val nextValue = if(i+1 < s.length) map[s[i + 1]] ?: 0 else 0

            if(currentValue >= nextValue) {
                result += currentValue
                i++    
            } else {
                result += nextValue - currentValue
                i += 2
            }
        }
        return result
    }
}
