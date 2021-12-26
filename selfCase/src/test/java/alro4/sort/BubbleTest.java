package alro4.sort;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author dongchen
 * @Data 2020/12/22
 * @Time 21:57
 */
public class BubbleTest {
    @Test
    public void testBubbleSort(){
        Bubble bubble = new Bubble();
        int[] arr = {1,3,5,9,4,3,8,6};
        int[] result = bubble.bubbleSort(arr);
        System.out.println(Arrays.toString(result));

    }
}
