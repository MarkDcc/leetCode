package alro4.graph;

import alro4.list.Stack;

/**
 * @author dongchen
 * @Data 2021/2/28
 * @Time 12:57
 */
public class TopoLogical {
    private Stack order;

    public boolean isCycle() {
        return order == null;
    }

    public Stack order() {
        return order;
    }

    public TopoLogical(Digraph G) {
        DirectedCycle directedCycle = new DirectedCycle(G);
        if (!directedCycle.hasCycle()) {
            DepthFirstOrder depthFirstOrder = new DepthFirstOrder(G);
            order = depthFirstOrder.reversePost();
        }
    }
}
