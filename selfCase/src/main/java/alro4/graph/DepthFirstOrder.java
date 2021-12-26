package alro4.graph;

import alro4.list.Stack;

/**
 * @author dongchen
 * @Data 2021/2/28
 * @Time 12:49
 */
public class DepthFirstOrder {
    private boolean[] marked;
    private Stack<Integer> reversePost;

    private void dfs(Digraph G, int v) {
        marked[v] = true;
        for (Integer w : G.adj(v)) {
            if(!marked[w]){
                dfs(G,w);
            }
        }
        reversePost.push(v);
    }

    public Stack<Integer> reversePost() {
        return reversePost;
    }

    public DepthFirstOrder(Digraph G) {
        this.marked = new boolean[G.V()];
        this.reversePost = new Stack<Integer>();
        for (int i = 0; i < G.V(); i++) {
            if (!marked[i]) {
                dfs(G, i);
            }
        }
    }
}
