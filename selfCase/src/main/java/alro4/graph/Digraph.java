package alro4.graph;

import alro4.list.Queue;

/**
 * @author dongchen
 * @Data 2021/2/21
 * @Time 12:27
 */
public class Digraph {
    private final int V;
    private int E;
    private Queue[] adj;

    public int V() {
        return V;
    }

    public int E() {
        return E;
    }

    public Digraph(int V) {
        this.V = V;
        this.E = 0;
        this.adj = new Queue[V];
        for (int i = 0; i < V; i++) {
            this.adj[i] = new Queue<Integer>();
        }
    }

    public void addEdge(int v, int w) {
        adj[v].enqueue(w);
        E++;
    }

    public Queue<Integer> adj(int v) {
        return adj[v];
    }

    private Digraph reverse() {
        Digraph r = new Digraph(V);
        for (int i = 0; i < V; i++) {
            for (Integer w: adj(i)) {
                r.addEdge(w,i);
            }
        }
        return r;
    }
}
