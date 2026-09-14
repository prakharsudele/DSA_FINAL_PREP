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
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;

        TreeNode temp = root.left; //store in temp node.
        root.left = root.right;//exchange subtrees.
        root.right = temp;

        //exchange right and left subtree for every node.
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}

//TC --> O(M) no of nodes.
//SC --> O(H) height of tree 