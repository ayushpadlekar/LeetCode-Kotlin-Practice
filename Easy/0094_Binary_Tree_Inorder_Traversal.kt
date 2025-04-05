// 94. Binary Tree Inorder Traversal
// Given the root of a binary tree, return the inorder traversal of its nodes' values.

// Example 1:
// Input: root = [1,null,2,3]
// Output: [1,3,2]

// Example 2:
// Input: root = [1,2,3,4,5,null,8,null,null,6,7,9]
// Output: [4,2,6,5,7,1,3,9,8]

// Example 3:
// Input: root = []
// Output: []


// 0ms - helper function + 2 recursions
class Solution {
    fun inorderTraversal(root: TreeNode?): List<Int> {
        
        return helper(root, mutableListOf())
    }
    fun helper(root: TreeNode?, list: MutableList<Int>): List<Int> {
        if(root == null) return list

        helper(root.left, list) // left
        list.add(root.`val`) // root
        helper(root.right, list) // right

        return list
    }
}
