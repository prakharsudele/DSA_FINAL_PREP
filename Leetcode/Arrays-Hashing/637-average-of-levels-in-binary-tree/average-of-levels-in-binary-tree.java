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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        trav(ans , q , root);
        return ans;
    }

    private void trav(List<Double> ans , Queue<TreeNode> q , TreeNode root){
        if(root == null) return;
        q.offer(root);
        while(!q.isEmpty()){
            long sum = 0;
            int n = q.size();
            for(int i=0;i<n;i++){
                TreeNode curr = q.poll();
                sum+=curr.val;
                if(curr.left!=null) q.offer(curr.left);
                if(curr.right!=null)q.offer(curr.right);
            }
            ans.add(((double)sum/(double)n));
        }
    }
}