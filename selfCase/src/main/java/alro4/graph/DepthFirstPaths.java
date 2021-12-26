package alro4.graph;

import alro4.list.Stack;

/**
 * @author dongchen
 * @Data 2021/2/12
 * @Time 17:25
 */
public class DepthFirstPaths {
    private boolean[] marked;
    private int s;
    private int[] edgeTo;

    public DepthFirstPaths(Graph G, int s) {
        this.marked = new boolean[G.V()];
        this.s = s;
        this.edgeTo = new int[G.V()];

        dfs(G, s);
    }

    private void dfs(Graph G, int s) {
        marked[s] = true;
        for (Integer w : G.adj(s)) {

            if (!marked[w]) {
                edgeTo[w] = s;
                dfs(G, w);
            }
        }
    }

    public boolean hasPathTo(int v) {
        return marked[v];
    }

    public Stack<Integer> pathTo(int v) {
        if(!hasPathTo(v)){
            return null;
        }
        Stack<Integer> path = new Stack<>();
        while (v != s){
            path.push(v);
            v = edgeTo[v];
        }

        path.push(s);
        return path;

    }
}
