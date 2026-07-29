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
    boolean flag = true;
    public boolean isSymmetric(TreeNode root) {
        TreeNode node1 = root;
        TreeNode node2 = root;
        trav(node1 , node2);
        return flag;
    }

    private void trav(TreeNode node1 , TreeNode node2){
        if((node1!=null && node2==null) || (node1==null && node2!=null)){
            flag = false;
            return;
        }
        else if(node1 == null && node2 == null) return;
        else if(node1.val != node2.val) flag = false;

        trav(node1.left , node2.right);
        trav(node1.right , node2.left);
    }
}