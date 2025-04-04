// 101. Symmetric Tree
// Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).

// Example 1:
// Input: root = [1,2,2,3,4,4,3]
// Output: true

// Example 2:
// Input: root = [1,2,2,null,3,null,3]
// Output: false

// 0ms - extra function + recursive approach
class Solution {

    fun isSymmetric(root: TreeNode?): Boolean {
        return root == null || isSymmetricHelp(root.left, root.right)
    }
    
    // extra function + recursive approach
    fun isSymmetricHelp(left: TreeNode?, right: TreeNode?): Boolean {

        if(left==null || right==null) return left==right
        if(left.`val`!= right.`val`) return false

        return isSymmetricHelp(left.left, right.right) && isSymmetricHelp(left.right, right.left)
    }
}
