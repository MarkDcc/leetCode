package alro4.graph;

import alro4.list.Queue;
import alro4.priority.MinPriorityQueue;
import alro4.uf.UF_Tree_Weighted;

/**
 * @author dongchen
 * @Data 2021/3/6
 * @Time 11:49
 */
public class KruskalMST {
    private Queue<Edge> mst;
    private UF_Tree_Weighted uf;
    private MinPriorityQueue<Edge> pq;

    public KruskalMST(EdgeWeightGraph G) {
        this.mst = new Queue<>();
        this.uf = new UF_Tree_Weighted(G.V());
        this.pq = new MinPriorityQueue<>(G.E() + 1);
        for (Edge edge : G.edges()) {
            pq.insert(edge);
        }
        while (!pq.isEmpty() && mst.size() < G.V() - 1) {
            Edge minEdge = pq.delMin();
            int v = minEdge.either();
            int w = minEdge.other(v);
            if (uf.connected(v, w)) {
                continue;
            }
            uf.union(v, w);
            mst.enqueue(minEdge);

        }
    }

    public Queue edges() {
        return mst;
    }
}
