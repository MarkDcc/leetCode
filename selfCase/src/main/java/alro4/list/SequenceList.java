package alro4.list;


import java.util.Iterator;

/**
 * @author dongchen
 * @Data 2020/12/29
 * @Time 17:59
 */
public class SequenceList<T> implements Iterable<T> {
    private T[] sequenceList;
    private int N;


    public void clear() {
        N = 0;
    }

    //判断是否为空
    public boolean isEmpty() {
        return N == 0;
    }

    public SequenceList(int capacity) {
        N = 0;
        sequenceList = (T[]) new Object[capacity];
    }

    public int length() {
        return N;
    }

    public T get(int i) {
        return sequenceList[i];
    }

    public void insert(int i, T t) {
        if(N==sequenceList.length){
            resize(sequenceList.length*2);
        }
        for (int j = N; j > i ;) {
            sequenceList[j] = sequenceList[--j];
        }
        sequenceList[i] = t;
        N++;
    }

    private void resize(int i) {
        T[] newTemp = (T[]) new Object[i];
        for (int j = 0; j < N; j++) {
            newTemp[j]=sequenceList[j];
        }

        sequenceList = newTemp;
    }

    public void insert(T t) {
        if(N==sequenceList.length){
            resize(sequenceList.length*2);
        }
        sequenceList[N++] = t;//注意这种写法
    }

    public T remove(int i) {
        T result = sequenceList[i];
        for (int j = i; j < N;) {
            sequenceList[j] = sequenceList[++j];
        }
        N--;
        if(N < sequenceList.length/4){
            resize(sequenceList.length/2);
        }
        return result;
    }

    public int indexOf(T t) {
        for (int i = 0; i < N; i++) {
            if(sequenceList[i].equals(t)){
                return i;
            }
        }
        return -1;
    }



    @Override
    public Iterator iterator() {
        return new SIterator();
    }

    public class SIterator implements Iterator {
        private int cur;

        public SIterator() {
            this.cur = 0;
        }
        @Override
        public boolean hasNext() {

            return N>cur;
        }

        @Override
        public T next() {
            return sequenceList[cur++];
        }


    }
}
