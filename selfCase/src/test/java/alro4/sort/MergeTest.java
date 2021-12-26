package alro4.sort;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author dongchen
 * @Data 2020/12/27
 * @Time 13:33
 */
public class MergeTest {
    @Test
    public void testMerge(){

        Comparable[] arr = {1,3,5,9,4,3,8,6};
        MergeSort.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
