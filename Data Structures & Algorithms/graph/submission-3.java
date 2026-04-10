class Graph {

    private Map<Integer, List<Integer>> adjList ;

    public Graph() {
       this.adjList = new HashMap<>();
    }

    public void addEdge(int src, int dst) {
        this.adjList.putIfAbsent(src, new ArrayList<>());
        this.adjList.putIfAbsent(dst, new ArrayList<>());
        List<Integer> srcEdges = this.adjList.get(src);
        if(!srcEdges.contains(dst)){
            srcEdges.add(dst);
        }
    }

    public boolean removeEdge(int src, int dst) {
        if(!this.adjList.containsKey(src)){
            return false;
        }

        List<Integer> edges = this.adjList.get(src);
        return edges.remove(Integer.valueOf(dst));
    }

    public boolean hasPath(int src, int dst) {
        Set<Integer> visited = new HashSet<>();
        return dfs(src, dst, visited);
    }

    public boolean dfs(int src, int dst, Set<Integer> visited ){
        if(src == dst ){
            return true;
        }
        visited.add(src);

        List<Integer> edges = this.adjList.getOrDefault(src, new ArrayList<>());

        for(int e : edges ){
            if(!visited.contains(e)){
                if(dfs(e,dst, visited)){
                    return true;
                }
            }
        }

        return false;
    }

    public boolean bfs(int src, int dst, Set<Integer> visited){
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(src);

        while(!queue.isEmpty()){
            int cur = queue.poll();
            if(cur == dst ) return true;

            if(visited.contains(cur)) continue;
            visited.add(cur);

            for(int next : adjList.getOrDefault(cur,new ArrayList<>())){
                if(!visited.contains(next)){
                    queue.offer(next);
                }
            }
        }
        return false;
    }

}
