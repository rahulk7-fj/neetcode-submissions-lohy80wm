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
    ArrayList<Integer> aList = new ArrayList<Integer>();
    public int kthSmallest(TreeNode root, int k) {
        dfs(root);
        return aList.get(k-1);
    }

    public void dfs(TreeNode root){
       if(root == null){
        return;
       }
       dfs(root.left);
       aList.add(root.val);
       dfs(root.right);
    }
}
