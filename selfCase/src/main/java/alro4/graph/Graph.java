package alro4.graph;


import alro4.list.Queue;

/**
 * @author dongchen
 * @Data 2021/2/12
 * @Time 11:37
 */
public class Graph {
    //顶点的数量
    private final int V;
    //边的数量
    private int E;
    //邻接表
    private Queue[] adj;

    public Graph(int v) {
        this.V = v;
        this.E = 0;
        this.adj = new Queue[V];

        for (int i = 0; i < v; i++) {
            adj[i] = new Queue<Integer>();
        }
    }

    public int V() {
        return V;
    }


    public int E() {
        return E;
    }


    public void addEdge(int v, int w) {
        adj[v].enqueue(w);
        adj[w].enqueue(v);
        E++;
    }


    public Queue<Integer> adj(int v) {
        return adj[v];
    }


}
