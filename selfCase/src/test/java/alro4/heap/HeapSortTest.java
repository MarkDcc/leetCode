package alro4.heap;

import java.util.Arrays;

/**
 * @author dongchen
 * @Data 2021/1/13
 * @Time 21:26
 */
public class HeapSortTest {
    public static void main(String[] args) {
        //����������
        String[] arr = {"S","O","R","T","E","X","A","M","P","L","E"};
        //ͨ��HeapSort�������е�Ԫ�ؽ�������
        HeapSort.sort(arr);
        //��ӡ����������е�Ԫ��
        System.out.println(Arrays.toString(arr));
    }
}
