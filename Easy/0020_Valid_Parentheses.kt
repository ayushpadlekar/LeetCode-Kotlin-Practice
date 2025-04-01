// Valid Parentheses or Balanced Brackets.

// Mutable List and Map approach - Kotlin
class Solution {
    fun isValid(s: String): Boolean {
    
    val stack = mutableListOf<Char>()
    val map = mapOf(')' to '(', '}' to '{', ']' to '[')

    for (char in s) {
        if (map.containsKey(char)) {
            val topElement = if (stack.isNotEmpty()) stack.removeLast() else '#'
            if (map[char] != topElement) {
                return false
            }
        } else {
            stack.add(char)
        }
    }
    return stack.isEmpty()
    }
}

// Stack<Char>, push, pop - Approach - Kotlin
class Solution {
    fun isValid(s: String): Boolean {
        val stack = Stack<Char>()

        for (char in s) {
            if (stack.isNotEmpty() && char == ')' && stack.peek() == '(') {
                stack.pop()
                continue
            }
            if (stack.isNotEmpty() && char == ']' && stack.peek() == '[') {
                stack.pop()
                continue
            }
            if (stack.isNotEmpty() && char == '}' && stack.peek() == '{') {
                stack.pop()
                continue
            }
            stack.push(char)
        }
        return stack.isEmpty()
    }
}
