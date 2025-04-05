// 145. Binary Tree Postorder Traversal
// Given the root of a binary tree, return the postorder traversal of its nodes' values.

// Example 1:
// Input: root = [1,null,2,3]
// Output: [3,2,1]

// Example 2:
// Input: root = [1,2,3,4,5,null,8,null,null,6,7,9]
// Output: [4,6,7,5,2,9,8,3,1]

// Example 3:
// Input: root = []
// Output: []

// 0ms - helper function + 2 recursions
class Solution {
    fun postorderTraversal(root: TreeNode?): List<Int> {
        
        return helper(root, mutableListOf())
    }
    fun helper(root: TreeNode?, list: MutableList<Int>): List<Int> {

        if(root == null) return list

        helper(root.left, list) // left
        helper(root.right, list) // right
        list.add(root.`val`) // root

        return list
    }
}
