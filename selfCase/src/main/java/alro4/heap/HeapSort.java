package alro4.heap;

import java.util.Arrays;

/**
 * @author dongchen
 * @Data 2021/1/13
 * @Time 20:36
 */
public class HeapSort {
    public static void sort(Comparable[] source) {
        Comparable[] heap = new Comparable[source.length +1];
        createHeap(source,heap);
        int maxIndex = heap.length -1;
        while (maxIndex > 1){
            exch(heap,1,maxIndex);
            maxIndex--;
            sink(heap,1,maxIndex);
        }
        System.arraycopy(heap,1,source,0,source.length);

    }

    private static void createHeap(Comparable[] source, Comparable[] heap) {
       System.arraycopy(source,0,heap,1,source.length);
        for (int i = heap.length/2; i >0 ; i--) {
            sink(heap,i,heap.length -1);
        }
    }

    private static boolean less(Comparable[] heap, int i, int j) {
        return heap[i].compareTo(heap[j])<0;
    }

    private static void exch(Comparable[] heap, int i, int j) {
        Comparable tmp = heap[i];
        heap[i] = heap[j];
        heap[j] = tmp;
    }

    private static void sink(Comparable[] heap, int target, int range) {
        int maxIndex;
        while (2*target<= range){
            if(2*target +1 < range){
                if(less(heap,2*target,2*target+1)){
                    maxIndex = 2*target+1;
                }else {
                    maxIndex = 2*target;
                }
            }else {
                maxIndex = 2*target;
            }
            if(less(heap,target,maxIndex)){
                exch(heap,target,maxIndex);
            }

            target = maxIndex;
        }
    }
}
