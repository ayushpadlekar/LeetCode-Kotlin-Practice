// 100. Same Tree
// Given the roots of two binary trees p and q, write a function to check if they are the same or not.
// Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.

// Example 1:
// Input: p = [1,2,3], q = [1,2,3]
// Output: true

// Example 2:
// Input: p = [1,2], q = [1,null,2]
// Output: false

// 0ms - Recursive Approach - 2 lines
class Solution {
    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
        // Recursive Approach
        if(p==null || q==null) return p==q

        return p.`val`== q.`val` && isSameTree(p.left, q.left) && isSameTree(p.right, q.right)
    }
}
