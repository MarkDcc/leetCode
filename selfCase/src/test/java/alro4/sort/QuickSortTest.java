package alro4.sort;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author dongchen
 * @Data 2020/12/27
 * @Time 14:27
 */
public class QuickSortTest {
    @Test
    public void testMerge(){

        Comparable[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 8};
        QuickSort.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
