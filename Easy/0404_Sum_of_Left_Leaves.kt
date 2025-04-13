// 404. Sum of Left Leaves
// Given the root of a binary tree, return the sum of all left leaves.
// A leaf is a node with no children. A left leaf is a leaf that is the left child of another node.

// Example 1:
// Input: root = [3,9,20,null,null,15,7]
// Output: 24
// Explanation: There are two left leaves in the binary tree, with values 9 and 15 respectively.

// Example 2:
// Input: root = [1]
// Output: 0


// 0ms - global sum, helper function, Recursion Approach
class Solution {
    var sum: Int = 0
    fun sumOfLeftLeaves(root: TreeNode?): Int {
        
        helper(root)
        return sum
    }
    fun helper(node: TreeNode?) {

        if(node?.left != null) {
            var child = node?.left
            if(child?.left == null && child?.right == null) {
                sum += child!!.`val`
            }
            helper(node?.left)
        }
        if(node?.right != null) {
            helper(node?.right)
        }
    }
}
