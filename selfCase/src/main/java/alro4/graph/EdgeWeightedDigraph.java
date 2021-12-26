package alro4.graph;

import alro4.list.Queue;

/**
 * @author dongchen
 * @Data 2021/3/6
 * @Time 12:14
 */
public class EdgeWeightedDigraph {
    private final int V;
    private int E;
    private Queue<DirectedEdge>[] adj;

    public EdgeWeightedDigraph(int v) {

        this.V = v;
        this.E = 0;
        this.adj = new Queue[v];
        for (int i = 0; i < adj.length; i++) {
            adj[i] = new Queue<DirectedEdge>();
        }
    }

    public int V() {
        return V;
    }

    public int E() {
        return E;
    }

    public void addEdge(DirectedEdge edge) {
        adj[edge.from()].enqueue(edge);
        E++;
    }

    public Queue<DirectedEdge> adj(int v) {
        return adj[v];
    }

    public Queue<DirectedEdge> edges() {
        Queue<DirectedEdge> edges = new Queue<>();
        for (int i = 0; i < V; i++) {
            for (DirectedEdge e : adj(i)) {
                edges.enqueue(e);
            }
        }
        return edges;
    }
}
