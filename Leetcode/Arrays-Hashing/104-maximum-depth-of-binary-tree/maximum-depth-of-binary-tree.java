/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0; //return depth 0 if we have reached null.

        int left = maxDepth(root.left); //depth of left subtree.
        int right = maxDepth(root.right);//depth of right subtree.

        return 1 + Math.max(left , right);//take maximum + 1 for root.
    }
}

//TC --> O(Depth of tree)
//SC --> O(1)