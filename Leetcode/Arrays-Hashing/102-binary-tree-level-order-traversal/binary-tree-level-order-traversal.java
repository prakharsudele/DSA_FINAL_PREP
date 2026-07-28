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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        trav(root , q , ans);
        return ans;
    }

    private void trav(TreeNode root, Queue<TreeNode> q, List<List<Integer>> ans) {
        q.offer(root);
        while (!q.isEmpty()) {
            List<Integer> row = new ArrayList<>();
            int n = q.size();
            for (int i = 0; i < n; i++) {
                TreeNode curr = q.poll();
                row.add(curr.val);
                if (curr.left != null)q.offer(curr.left);
                if (curr.right != null) q.offer(curr.right);
            }
            ans.add(row);
        }
    }
}