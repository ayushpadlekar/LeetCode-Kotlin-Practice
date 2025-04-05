// 144. Binary Tree Preorder Traversal
// Given the root of a binary tree, return the preorder traversal of its nodes' values.

// Example 1:
// Input: root = [1,null,2,3]
// Output: [1,2,3]

// Example 2:
// Input: root = [1,2,3,4,5,null,8,null,null,6,7,9]
// Output: [1,2,4,5,6,7,3,8,9]

// Example 3:
// Input: root = []
// Output: []

// 0ms - helper function + 2 recursions
class Solution {
    fun preorderTraversal(root: TreeNode?): List<Int> {
        
        return helper(root, mutableListOf())
    }

    fun helper(root: TreeNode?, list: MutableList<Int>): List<Int> {
        if (root == null) return list

        list.add(root.`val`) // root
        helper(root.left, list) // left
        helper(root.right, list) // right

        return list
    }
}
