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
    public int[] findMode(TreeNode root) {
        HashMap<Integer , Integer> map = new HashMap<>();
        int[] maxcount = {0};
        List<Integer> mode = new ArrayList<>();
        inorder(root , map , maxcount , mode);

        int[] result = new int[mode.size()];
        for(int i=0;i<mode.size();i++){
            result[i] = mode.get(i);
        }

        return result;
    }

    private void inorder(TreeNode root , HashMap<Integer , Integer> map , int[] maxcount , List<Integer> mode){
        if(root == null) return;

        inorder(root.left , map , maxcount , mode);

        int count = map.getOrDefault(root.val , 0) + 1;
        map.put(root.val , count);

        if(count > maxcount[0]){
            maxcount[0] = count;
            mode.clear();
            mode.add(root.val);
        }else if (count == maxcount[0]){
            mode.add(root.val);
        }

        inorder(root.right , map , maxcount , mode);
    }
}