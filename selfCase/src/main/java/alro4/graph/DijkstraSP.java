package alro4.graph;

import alro4.list.Queue;
import alro4.priority.IndexMinPriorityQueue;

/**
 * @author dongchen
 * @Data 2021/3/6
 * @Time 21:34
 */
public class DijkstraSP {
    private DirectedEdge[] edgeTo;
    private double[] distTo;
    private IndexMinPriorityQueue<Double> pq;

    public DijkstraSP(EdgeWeightedDigraph G,int s) {
        this.edgeTo = new DirectedEdge[G.V()];
        this.distTo = new double[G.V()];
        for (int i = 0; i < distTo.length; i++) {
            distTo[i] = Double.POSITIVE_INFINITY;
        }
        pq = new IndexMinPriorityQueue<>(G.V());
        distTo[s] = 0.0;
        pq.insert(s,0.0);
        while (!pq.isEmpty()){
            relax(G,pq.delMin());
        }

    }

    private void relax(EdgeWeightedDigraph G, int v) {
        for (DirectedEdge edge : G.adj(v)) {
            int w = edge.to();
            if(distTo[w]>distTo(v)+edge.getWeight()){
                distTo[w] = distTo(v)+edge.getWeight();
                edgeTo[w] = edge;
                if (pq.contains(w)){
                    pq.changeItem(w,distTo[w]);
                }else {
                    pq.insert(w,distTo[w]);
                }
            }
        }
    }

    public double distTo(int v) {
        return distTo[v];
    }

    public boolean hasPathTo(int v) {
        return distTo[v] < Double.POSITIVE_INFINITY;
    }

    public Queue<DirectedEdge> pathTo(int v) {
        if(!hasPathTo(v)){
           return null;
        }
        Queue<DirectedEdge> edges = new Queue<>();
        DirectedEdge e = null;
        while (true){
            e = edgeTo[v];
            if(e == null){
                break;
            }
            edges.enqueue(e);
            v = e.from();
        }
        
        return edges;
    
    }

}
