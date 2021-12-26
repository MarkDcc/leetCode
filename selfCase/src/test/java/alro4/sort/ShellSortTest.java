package alro4.sort;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author dongchen
 * @Data 2020/12/26
 * @Time 21:31
 */
public class ShellSortTest {
    @Test
    public void testShellSort(){
        int[] arr = {1,3,5,9,4,3,8,6};
        ShellSort shellSort = new ShellSort();
        int[]  result = shellSort.shellSort(arr);
        System.out.println(Arrays.toString(result));

    }
}
