package alro4.sort;

/**
 * @author dongchen
 * @Data 2020/12/26
 * @Time 21:14
 */
public class ShellSort {
    public int[] shellSort(int[] arr){
        //ȷ������
        int h = 1;
        while (h < arr.length/2){
            h = 2 * h +1;
        }

        while (h>=1){
            //�ҵ���Ҫ�Ƚϵ�Ԫ��
            for (int i = h; i < arr.length; i++) {
                //������Ԫ��
                for (int j = i; j >= h  ; j = j - h) {
                    //�����һλ��ǰһλ��ͽ���λ��
                    if(arr[j-h] > arr[j]){
                        int tmp = arr[j];
                        arr[j] = arr[j-h];
                        arr[j - h] = tmp;
                    }else {
                        //�����һλ��ǰһλС���˳�
                        break;
                    }
                }
            }
            h= h/2;
        }

        return arr;
    }
}
