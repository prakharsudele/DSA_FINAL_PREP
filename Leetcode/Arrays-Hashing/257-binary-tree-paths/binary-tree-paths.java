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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        trav(root, ans, "");
        return ans;
    }

    private void trav(TreeNode root, List<String> ans, String temp) {
        if (root == null)
            return;
        if (root.right == null && root.left == null) {
            if (temp.isEmpty()) {
                temp += root.val;
            } else
                temp += "->" + root.val;
            ans.add(temp);
            return;
        }
        if (temp.isEmpty()) {
            temp += root.val;
        } else
            temp += "->" + root.val;

        trav(root.left, ans, temp);
        trav(root.right, ans, temp);
    }
}