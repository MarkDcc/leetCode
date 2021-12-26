package alro4.sort;

/**
 * @author dongchen
 * @Data 2020/12/22
 * @Time 21:45
 */
public class Bubble {
    /**
     * 冒泡排序，比较相邻位置的元素。把较大的放到右边
     * @param arr
     * @return
     */
    public int[] bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j-1]>arr[j]){
                    int tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                }
            }
        }
        return arr;
    }
}
