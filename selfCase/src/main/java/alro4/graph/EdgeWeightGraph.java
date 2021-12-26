package alro4.graph;

import alro4.list.Queue;

/**
 * @author dongchen
 * @Data 2021/2/28
 * @Time 17:04
 */
public class EdgeWeightGraph {
    private final int V;
    private int E;
    private Queue<Edge>[] adj;

    public EdgeWeightGraph(int V) {
        this.V = V;
        this.E = 0;
        this.adj = new Queue[V];
        for (int i = 0; i < adj.length; i++) {
            this.adj[i] = new Queue<Edge>();
        }
    }

    public int V() {
        return V;
    }

    public int E() {
        return E;
    }

    public void addEdge(Edge e) {
        int v = e.either();
        int w = e.other(v);
        adj(v).enqueue(e);
        adj(w).enqueue(e);
        E++;
    }

    public Queue<Edge> adj(int v) {
        return adj[v];
    }

    public Queue<Edge> edges() {
        Queue<Edge> allEdge = new Queue<>();
        for (int i = 0; i < V; i++) {
            for (Edge e : adj(i)) {
                if(e.other(i)<i){
                    allEdge.enqueue(e);
                }
            }
        }
        return allEdge;
    }

}
