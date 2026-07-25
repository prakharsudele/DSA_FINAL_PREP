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
    public boolean isBalanced(TreeNode root) {
        int ans = trav(root);
        if(ans == -1) return false;
        return true;
    }

    private int trav(TreeNode root){
        if(root == null) return 0;

        int left = trav(root.left);
        int right = trav(root.right);

        if(left == -1 || right == -1) return -1;

        if(Math.abs(left - right) > 1) return -1;

        return Math.max(left , right) + 1;
    }

}