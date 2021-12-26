package alro4.graph;

import ch.qos.logback.classic.pattern.RelativeTimeConverter;

/**
 * @author dongchen
 * @Data 2021/2/28
 * @Time 16:49
 */
public class Edge implements Comparable<Edge> {
    private final int v;
    private final int w;
    private final double weight;

    public Edge(int v,int w,double weight) {
        this.v = v;
        this.w = w;
        this.weight = weight;
    }

    public double weight() {
        return weight;
    }

    public int either() {
        return v;
    }

    public int other(int v) {
        if(v == this.v){
            return w;
        }else {
            return v;
        }
    }

    @Override
    public int compareTo(Edge that) {
        int cmp;
        if(this.weight > that.weight){
            cmp = 1;
        }else if(this.weight == that.weight){
            cmp = 0;
        }else {
            cmp = -1;
        }
        return cmp;
    }
}
