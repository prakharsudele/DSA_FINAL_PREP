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
    int ans = 0;//global answer to update.
    public int averageOfSubtree(TreeNode root) {
        dfs(root);
        return ans;
    }

    //traverse in a tree and figure out it's sum from there to leaf and count of it's nodes then take avg and check if it is equal to the root.val.
    private void dfs(TreeNode root){
        if(root == null) return;

        dfs(root.left);
        int avg = subTreeSum(root) / countNode(root);
        if(avg == root.val) ans++;

        dfs(root.right);
    }

    private int subTreeSum(TreeNode root){ //function to calculate sum
        if(root == null) return 0;
        return root.val + subTreeSum(root.left) + subTreeSum(root.right);
    }

    private int countNode(TreeNode root){ //function to count node
        if(root == null) return 0;
        return 1 + countNode(root.left) + countNode(root.right);
    }
}

//TC --> O(N^2)
//SC --> O(1)