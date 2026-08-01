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
    int curr = 0;
    public int kthSmallest(TreeNode root, int k) {
        int[] arr = {0};
        inorder(root , k , arr);
        return arr[0];
    }

    private void inorder(TreeNode root, int k , int[] arr){
        if(root == null) return;

        inorder(root.left , k  , arr);
        curr++;
        if(curr == k){
            arr[0] = root.val;
            return;
        }
        inorder(root.right , k , arr);
    }
}