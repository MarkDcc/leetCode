package alro4.sort;

/**
 * @author dongchen
 * @Data 2020/12/22
 * @Time 21:45
 */
public class Bubble {
    /**
     * ð�����򣬱Ƚ�����λ�õ�Ԫ�ء��ѽϴ�ķŵ��ұ�
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
