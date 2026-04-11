/*
Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node == null) return null;
        
        Map<Node, Node> visit = new HashMap<>();
        Deque<Node> queue = new ArrayDeque<>();

        Node cloned = new Node(node.val);
        visit.put(node, cloned);
        queue.add(node);

        while(!queue.isEmpty()){
            Node currNode = queue.poll();

            for(Node edgeNode : currNode.neighbors ){
                if(!visit.containsKey(edgeNode)){
                   visit.put(edgeNode, new Node(edgeNode.val));
                   queue.add(edgeNode);
                }

                visit.get(currNode).neighbors.add(visit.get(edgeNode));
            }
        }
        return cloned;
    }
}