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
    int pos = 1;
    int ans = -1;
    public int kthSmallest(TreeNode root, int k) {
        if(root == null) return -1;
        inorder(root , k);
        return ans;
    }

    private void inorder(TreeNode root , int k){
        if(root == null || ans != -1) return;

        inorder(root.left , k);
        if(ans != -1)return;
        if(pos == k){
            ans = root.val;
            return;
        }
        pos++;
        inorder(root.right , k);
    }
}