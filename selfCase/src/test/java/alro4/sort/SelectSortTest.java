package alro4.sort;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author dongchen
 * @Data 2020/12/23
 * @Time 12:05
 */
public class SelectSortTest {
    @Test
    public void test(){
        SelectSort selectSort = new SelectSort();
        int[] arr = {1,3,5,9,4,3,8,6};
        int[] result = selectSort.selectSort(arr);
        System.out.println(Arrays.toString(result));
    }
}
