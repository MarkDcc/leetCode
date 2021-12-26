package alro4.priority;

import javax.swing.*;

/**
 * @author dongchen
 * @Data 2021/1/14
 * @Time 21:10
 */
public class IndexMinPriorityQueue<T extends Comparable<T>> {
    private T[] items;
    private int[] pq;
    private int[] qp;
    private int N;

    public IndexMinPriorityQueue(int capacity) {
        this.items = (T[]) new Comparable[capacity + 1];
        this.N = 0;
        this.pq = new int[capacity + 1];
        this.qp = new int[capacity + 1];
        for (int i = 0; i < qp.length; i++) {
            qp[i] = -1;
        }
    }

    private boolean less(int i, int j) {
        return items[pq[i]].compareTo(items[pq[j]]) < 0;
    }

    private void exch(int i, int j) {
        int tmp = pq[i];
        pq[i] = pq[j];
        pq[j] = tmp;

        qp[pq[i]] = i;
        qp[pq[j]] = j;

    }

    public int delMin() {
        int minIndex = pq[1];
        items[minIndex] = null;
        exch(1,N);
        qp[pq[N]] = -1;
        pq[N] = -1;
        N--;
        sink(1);

        return minIndex;
    }

    public void insert(int i, T t) {
        if(contains(i)){
            return;
        }
        N++;
        items[i] = t;
        pq[N] = i;
        qp[i] = N;
        swim(N);
    }

    private void swim(int k) {
        while (k > 1) {
            if (less(k, k / 2)) {
                exch(k, k / 2);
            }
            k = k / 2;
        }
    }

    private void sink(int k) {
        int minIndex;
        while (2*k <=N){
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

    public boolean contains(int k) {
      return qp[k] != -1;
    }

    public void changeItem(int i, T t) {
        if(!contains(i)){
            return;
        }
        items[i] = t;
        int k = pq[i];
        sink(k);
        swim(k);
    }

    public int minIndex() {
        return pq[1];
    }

    public void delete(int i) {
        if(!contains(i)){
            return;
        }
        items[i] = null;
        int k = pq[i];
        exch(k,N);
        qp[pq[k]] = -1;
        pq[N] = -1;
        N--;
        swim(k);
        sink(k);

    }

}
