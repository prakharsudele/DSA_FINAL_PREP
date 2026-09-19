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
        if(root == null) return ans;
        q.offer(root);
        while(!q.isEmpty()){
            int n = q.size();
            double sum = 0.0;//define avg sum as 0.0
            for(int i=0;i<n;i++){
                TreeNode curr = q.poll();
                sum+=curr.val;//add every value of level in sum.
                if(i == n-1) ans.add(sum/(double)n);//when on last node add it's avg in our answer.

                if(curr.left != null) q.offer(curr.left);
                if(curr.right != null) q.offer(curr.right);
            }
        }
        return ans;
    }
}

//TC --> O(N)
//SC --> O(N)