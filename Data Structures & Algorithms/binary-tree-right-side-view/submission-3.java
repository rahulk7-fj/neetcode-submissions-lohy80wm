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
        Deque<TreeNode> q = new LinkedList<TreeNode>();
        List<Integer> list = new ArrayList<Integer>();
        q.offer(root);
        
        while(!q.isEmpty()){
            TreeNode rightSide = null;
            int qlen = q.size();
            for(int i=0; i<qlen; i++){
                TreeNode curr = q.poll();
                if(curr != null){
                    rightSide = curr;
                    q.offer(curr.left);
                    q.offer(curr.right);
                }  
            }
            if(rightSide != null){
                list.add(rightSide.val);
            }
        }
        return list;
    }
}
