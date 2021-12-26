package alro4.priority;

/**
 * @author dongchen
 * @Data 2021/1/13
 * @Time 22:02
 */
public class MinPriorityQueue<T extends Comparable<T>> {
    private T[] items;
    private int N;

    public MinPriorityQueue(int capacity) {
        items = (T[]) new Comparable[capacity + 1];
        N = 0;
    }

    private boolean less(int i, int j) {
        return items[i].compareTo(items[j])<0;
    }

    private void exch(int i, int j) {
        T tmp = items[j];
        items[j] = items[i];
        items[i] = tmp;
    }

    public T delMin() {
        T min = items[1];
        exch(1,N);
        items[N] = null;
        N--;
        sink(1);
        return min;
    }

    public void insert(T t) {
        items[++N] = t;
        swim(N);
    }

    private void swim(int k) {
        while (k>1){
            if(less(k,k/2)){
                exch(k,k/2);
            }
            k = k/2;
        }
    }

    private void sink(int k) {
        if(isEmpty()){
            return;
        }
        int minIndex;
        while (2*k<=N){
            if(2*k+1<=N){
                if(less(2*k,2*k+1)){
                    minIndex = 2*k;
                }else {
                    minIndex = 2*k+1;
                }
            }else {
                minIndex = 2*k;
            }
            if(less(minIndex,k)){
                exch(minIndex,k);
            }
            k = minIndex;
        }
    }

    public int size() {
        return N;
    }

    public boolean isEmpty() {
        return N == 0;
    }
}
