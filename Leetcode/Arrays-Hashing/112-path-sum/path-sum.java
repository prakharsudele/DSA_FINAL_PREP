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
    boolean flag = false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        dfs(root , targetSum , 0);
        return flag;
    }

    private void dfs(TreeNode root, int targetSum , int currsum){
        if(root == null) return;
        currsum += root.val;

        if(root.left == null && root.right == null && currsum == targetSum){
            flag = true;
            return;
        }


        dfs(root.left , targetSum , currsum);
        dfs(root.right , targetSum , currsum);
    }
}