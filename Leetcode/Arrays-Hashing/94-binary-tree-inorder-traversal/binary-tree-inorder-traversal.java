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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        inorder(root , ans , st);
        return ans;
    }

    private void inorder(TreeNode root , List<Integer> ans ,  Stack<Integer> st){
        if(root == null) return;

        st.add(root.val);

        inorder(root.left , ans , st);
        ans.add(st.peek());
        st.pop();
        inorder(root.right , ans , st);

    }
}