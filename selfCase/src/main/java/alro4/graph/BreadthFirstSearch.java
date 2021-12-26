package alro4.graph;

import alro4.list.Queue;

/**
 * @author dongchen
 * @Data 2021/2/12
 * @Time 12:28
 */
public class BreadthFirstSearch {
    private boolean marked[];
    private int count;
    private Queue<Integer> waitSearch;

    public BreadthFirstSearch(Graph G, int v) {
        this.marked = new boolean[G.V()];
        this.count = 0;
        this.waitSearch = new Queue<Integer>();
        bfs(G,v);
    }

    private void bfs(Graph G, int v) {
        marked[v] = true;
        waitSearch.enqueue(v);
        while (!waitSearch.isEmpty()){
           Integer wait = waitSearch.dequeue();
            for (Integer w : G.adj(wait)) {
                if(!marked(w)){
                    bfs(G,w);
                }
            }
        }
        count++;
    }

    public boolean marked(int w) {
        return marked[w];
    }

    public int count() {
        return count;
    }


}
