package alro4.priority;

import dailyLearn.test.Test;

/**
 * @author dongchen
 * @Data 2021/1/13
 * @Time 21:40
 */
public class MaxPriorityQueue<T extends Comparable<T>> {
    private T[] items;
    private int N;

    public MaxPriorityQueue(int capacity) {
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

    public T delMax() {
        T max = items[1];
        exch(1,N);
        items[N] = null;
        N--;
        sink(1);
        return max;
    }

    public void insert(T t) {
        items[++N] = t;
        swim(N);
    }

    private void swim(int k) {
        while (k>1){
            if(less(k/2,k)){
                exch(k/2,k);
            }
            k = k/2;
        }
    }

    private void sink(int k) {
        if(isEmpty()){
            return;
        }
        int maxIndex;
        while (2*k<=N){
            if(2*k+1<=N){
                if(less(2*k,2*k+1)){
                    maxIndex = 2*k+1;
                }else {
                    maxIndex = 2*k;
                }
            }else {
                maxIndex = 2*k;
            }
            if(less(maxIndex,k)){
                exch(maxIndex,k);
            }
            k = maxIndex;
        }
    }

    public int size() {
        return N;
    }

    public boolean isEmpty() {
        return N == 0;
    }
}
