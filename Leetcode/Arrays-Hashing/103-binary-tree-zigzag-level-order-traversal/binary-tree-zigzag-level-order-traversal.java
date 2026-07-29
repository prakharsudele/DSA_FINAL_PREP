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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Deque<TreeNode> q = new LinkedList<>();
        trav(ans, q, root);
        return ans;
    }

    private void trav(List<List<Integer>> ans, Deque<TreeNode> q, TreeNode root) {
        if (root == null) return;
        boolean flag = true;
        q.offer(root);
        while (!q.isEmpty()) {
            List<Integer> row = new ArrayList<>();
            int n = q.size();
            for (int i = 0; i < n; i++) {
                if (flag) {
                    TreeNode curr = q.pollFirst();
                    row.add(curr.val);
                    if (curr.left != null)q.addLast(curr.left);
                    if (curr.right != null)q.addLast(curr.right);
                } else {
                    TreeNode curr = q.pollLast();
                    row.add(curr.val);
                    if (curr.right != null)q.addFirst(curr.right);
                    if (curr.left != null)q.addFirst(curr.left);
                }
            }
            ans.add(row);
            flag = !flag;
        }
    }
}