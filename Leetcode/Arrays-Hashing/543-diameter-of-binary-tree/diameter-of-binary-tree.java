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
    int ans = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        int temp = trav(root);
        return ans;
    }

    private int trav(TreeNode root){
        if(root == null) return 0;

        int left = trav(root.left);
        int right = trav(root.right);

        ans = Math.max(ans , left + right);
        return 1 + Math.max(left , right);
    }
}