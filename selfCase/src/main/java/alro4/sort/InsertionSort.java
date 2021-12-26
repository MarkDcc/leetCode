package alro4.sort;

/**
 * @author dongchen
 * @Data 2020/12/22
 * @Time 22:20
 */
public class InsertionSort {
    /**
     * �������ǽ������е����ݷ�Ϊ�������䣬�����������δ�������䡣
     * ��ʼ����������ֻ��һ��Ԫ�أ���������ĵ�һ��Ԫ�أ�Ȼ����δ��������������ȡ��Ԫ�ز����뵽����������ĺ���λ�ã�����֤����������һֱ������
     * �ظ��������ֱ��δ��������Ԫ��Ϊ�գ��㷨������
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
                    //��ǰ��������Ѿ������򣬾Ͳ���Ҫ�ٱȽ���
                    break;
                }
            }
        }

        return arr;
    }
}
