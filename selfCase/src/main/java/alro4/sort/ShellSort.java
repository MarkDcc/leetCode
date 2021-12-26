package alro4.sort;

/**
 * @author dongchen
 * @Data 2020/12/26
 * @Time 21:14
 */
public class ShellSort {
    public int[] shellSort(int[] arr){
        //确定增量
        int h = 1;
        while (h < arr.length/2){
            h = 2 * h +1;
        }

        while (h>=1){
            //找到需要比较的元素
            for (int i = h; i < arr.length; i++) {
                //，插入元素
                for (int j = i; j >= h  ; j = j - h) {
                    //如果后一位比前一位大就交换位置
                    if(arr[j-h] > arr[j]){
                        int tmp = arr[j];
                        arr[j] = arr[j-h];
                        arr[j - h] = tmp;
                    }else {
                        //如果后一位比前一位小就退出
                        break;
                    }
                }
            }
            h= h/2;
        }

        return arr;
    }
}
