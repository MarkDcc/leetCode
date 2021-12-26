package alro4.sort;

import java.util.Comparator;

/**
 * @author dongchen
 * @Data 2020/12/27
 * @Time 12:02
 */
//归并排序
public class MergeSort {

    static Comparable[] assist;

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

    //
    public static void  sort(Comparable[] arr) {
        assist = new Comparable[arr.length];
        int lo = 0;
        int hi = arr.length - 1;
        sort(arr, lo, hi);
    }

    public static void sort(Comparable[] arr, int lo, int hi) {
        if (lo >= hi) {
            return;
        }
        int mid = lo + (hi - lo)/2;
        //左子组
        sort(arr,lo,mid);
        //右子组
        sort(arr,mid+1,hi);
        //将数组arr中的从lo-->mid的元素和mid+1--->hi的元素归并到一个大数组中
        merge(arr,lo,mid,hi);
    }

    public static void merge(Comparable[] arr,int lo,int mid,int hi) {
        int Passit = lo;
        int left = lo;
        int right = mid+1;
        while (left<=mid && right<=hi){
            if(less(arr[right],arr[left])){
                assist[Passit] = arr[right];
                Passit++;
                right++;
            }else{
                assist[Passit] = arr[left];
                Passit++;
                left++;
            }
        }

        while (right<=hi){
            assist[Passit] = arr[right];
            Passit++;
            right++;
        }
        while (left<=mid){
            assist[Passit] = arr[left];
            Passit++;
            left++;
        }

        for (int i = lo; i <=hi ; i++) {
            arr[i] = assist[i];
        }
    }

}
