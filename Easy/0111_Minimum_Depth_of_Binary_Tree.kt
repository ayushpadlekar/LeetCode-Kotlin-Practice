// 111. Minimum Depth of Binary Tree
// Given a binary tree, find its minimum depth.
// The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
// Note: A leaf is a node with no children.

// Example 1:
// Input: root = [3,9,20,null,null,15,7]
// Output: 2

// Example 2:
// Input: root = [2,null,3,null,4,null,5,null,6]
// Output: 5

// recursion + when + minOf Approach
class Solution {
    fun minDepth(root: TreeNode?): Int {
    // recursion + minOf Approach
    if(root == null) return 0
    var leftH = minDepth(root.left)
    var rightH = minDepth(root.right)

    when {
        leftH == 0 -> return 1 + rightH
        rightH == 0 -> return 1 + leftH
    }
    // Or...
    // if(leftH == 0) return 1 + rightH
    // if(rightH == 0) return 1 + leftH

    return 1 + minOf(leftH,rightH) // or: if(leftH > rightH) rightH else leftH
    }
}
