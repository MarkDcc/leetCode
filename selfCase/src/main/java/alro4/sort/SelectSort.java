package alro4.sort;

/**
 * @author dongchen
 * @Data 2020/12/22
 * @Time 22:05
 */
public class SelectSort {
    /**
     * ѡ�����򣺼ٶ���һ��λ�õ�Ԫ����С�����ν������Ԫ������С��Ԫ�رȽϣ�����ȵ�һ��Ԫ��С���򽻻�λ��
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
