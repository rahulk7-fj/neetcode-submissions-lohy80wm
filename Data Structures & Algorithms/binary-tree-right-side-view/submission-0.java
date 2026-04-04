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
    public List<Integer> rightSideView(TreeNode root) {
        Deque<TreeNode> q = new ArrayDeque<TreeNode>();
        List<Integer> list = new ArrayList<Integer>();
        if(root != null){
            q.add(root);
        }
        while(!q.isEmpty()){
            int qlen = q.size();
            for(int i=0; i<qlen; i++){
                TreeNode curr = q.removeFirst();
                list.add(curr.val);
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
        }
        return list;
    }
}
