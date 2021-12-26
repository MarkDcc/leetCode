package alro4.sort;

/**
 * @author dongchen
 * @Data 2020/12/22
 * @Time 22:05
 */
public class SelectSort {
    /**
     * 选择排序：假定第一个位置的元素最小，依次将后面的元素与最小的元素比较，如果比第一个元素小。则交换位置
     * @param arr
     * @return
     */
    public int[] selectSort(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i; j < arr.length; j++) {
                if(arr[j]<arr[min]){
                    int tmp = arr[j];
                    arr[j] = arr[min];
                    arr[min] = tmp;
                }
            }
        }

        return arr;
    }
}
