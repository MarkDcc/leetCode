package alro4.sort;

import java.util.Comparator;
import java.util.concurrent.CompletableFuture;

/**
 * @author dongchen
 * @Data 2020/12/27
 * @Time 12:10
 */
public class QuickSort {

    //找到小的值
    public static boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }

    //交换数组中的元素位置
    public static void  exch(Comparable[] arr, int i, int j) {
        Comparable tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    //sort

    public static void  sort(Comparable[] arr) {
        int lo = 0;
        int hi = arr.length - 1;
        sort(arr, lo, hi);
    }
    public static void sort(Comparable[] arr, int lo, int hi) {
        if (lo >= hi) {
            return;
        }
        int key = partition(arr,lo,hi);
        //左子组
        sort(arr,lo,key-1);
        //右子组
        sort(arr,key+1,hi);
        //将数组arr中的从lo-->mid的元素和mid+1--->hi的元素归并到一个大数组中

    }

    public static int partition(Comparable[] arr, int lo,int hi){
        int left = lo;
        int right = hi +1;
        Comparable key = arr[lo];
        while (true){

            while (less(key,arr[--right])){
                if(right == lo){
                    break;
                }
            }


            while (less(arr[++left],key)){
                if(left == hi){
                    break;
                }
            }
            if(left >= right){
                break;
            }else {
               exch(arr,left,right);
            }
        }
        exch(arr,lo,right);
        return right;
    }

    //

}
