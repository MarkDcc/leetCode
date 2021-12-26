package alro4.sort;

import java.util.Comparator;

/**
 * @author dongchen
 * @Data 2020/12/27
 * @Time 12:02
 */
//�鲢����
public class MergeSort {

    static Comparable[] assist;

    //�ҵ�С��ֵ
    public static boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }

    //���������е�Ԫ��λ��
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
        //������
        sort(arr,lo,mid);
        //������
        sort(arr,mid+1,hi);
        //������arr�еĴ�lo-->mid��Ԫ�غ�mid+1--->hi��Ԫ�ع鲢��һ����������
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
