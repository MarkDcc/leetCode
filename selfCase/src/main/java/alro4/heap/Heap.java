package alro4.heap;

/**
 * @author dongchen
 * @Data 2021/1/13
 * @Time 20:02
 */
public class Heap<T extends Comparable<T>> {
    private T[] items;
    private int N;

    public Heap(int capacity) {
        this.items = (T[]) new Comparable[capacity + 1];
        this.N = 0;
    }

    private boolean less(int i, int j) {
        return items[i].compareTo(items[j]) < 0;
    }

    private void exch(int i, int j) {
        T tmp = items[i];
        items[i] = items[j];
        items[j] = tmp;
    }

    public void insert(T t) {
        //插入到最后，然后上浮
        items[++N] = t;
        swim(N);

    }

    public T delMax() {
        if (N == 0) {
            return null;
        }
        T max = items[1];
        //将根节点与最后一个节点交换
        exch(1, N);
        //删除最后一个节点
        items[N] = null;
        N--;
        //下沉
        sink(1);
        return max;
    }

    private void swim(int k) {
        while (k > 1) {
            if (less(k / 2, k)) {
                exch(k / 2, k);
            }
            k = k / 2;
        }
    }

    private void sink(int k) {
        int maxIndex;
        //如果是最底层就退出
        while (2* k <= N) {
            if(2*k+1<=N){
                if (less(2 * k, 2 * k + 1)) {
                    maxIndex = 2 * k + 1;
                } else {
                    maxIndex = 2 * k;
                }
            }else {
                maxIndex = 2*k;
            }

            if(less(k,maxIndex)){
                exch(k,maxIndex);
            }
            k = maxIndex;
        }
    }
}
