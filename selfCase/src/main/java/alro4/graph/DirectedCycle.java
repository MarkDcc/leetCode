package alro4.graph;

/**
 * @author dongchen
 * @Data 2021/2/28
 * @Time 12:29
 */
public class DirectedCycle {
    private boolean[] marked;
    private boolean hasCycle;
    private boolean[] onStack;

    public DirectedCycle(Digraph G) {
        this.hasCycle = false;
        this.marked = new boolean[G.V()];
        this.onStack = new boolean[G.V()];
        for (int i = 0; i < G.V(); i++) {
            if(!marked[i]){
                dfs(G,i);
            }
        }
    }

    private void dfs(Digraph G, int v) {
        onStack[v] = true;
        marked[v] = true;
        for (Integer w : G.adj(v)) {
            if(!marked[w]){
                dfs(G,w);
            }
            if(onStack[w]){
                hasCycle = true;
                return;
            }
        }
        onStack[v] = false;
    }

    public boolean hasCycle() {
        return hasCycle;
    }
}
