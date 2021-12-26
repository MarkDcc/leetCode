package alro4.graph;

/**
 * @author dongchen
 * @Data 2021/3/6
 * @Time 12:12
 */
public class DirectedEdge {
    private final int v;
    private final int w;
    private final double weight;

    public DirectedEdge(int v, int w, double weight) {
        this.v = v;
        this.w = w;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public int from() {
        return v;
    }

    public int to() {
        return w;
    }
}
