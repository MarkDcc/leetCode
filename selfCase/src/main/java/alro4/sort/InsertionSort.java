package alro4.sort;

/**
 * @author dongchen
 * @Data 2020/12/22
 * @Time 22:20
 */
public class InsertionSort {
    /**
     * 首先我们将数组中的数据分为两个区间，已排序区间和未排序区间。
     * 初始已排序区间只有一个元素，就是数组的第一个元素，然后在未排序区间中依次取出元素并插入到已排序区间的合适位置，并保证已排序区间一直是有序。
     * 重复这个步骤直到未排序区间元素为空，算法结束。
     * @param arr
     * @return
     */
    public int[] insertionSort(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j >0 ; j--) {
                if(arr[j]< arr[j-1]){
                    int tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                }else {
                    //当前面的序列已经排完序，就不需要再比较了
                    break;
                }
            }
        }

        return arr;
    }
}
