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
        Deque<TreeNode> q = new ArrayDeque<TreeNode>();
        List<List<Integer>> llist = new ArrayList<List<Integer>>();
        if(root != null){
            q.add(root);
        }

        while(!q.isEmpty()){
            int levelLength = q.size();
            List<Integer> list = new ArrayList<Integer>(levelLength);
            for(int i=0; i<levelLength; i++){
                TreeNode curr = q.removeFirst();
                list.add(curr.val);
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
            llist.add(list);
        }

        return llist;
    }
}
