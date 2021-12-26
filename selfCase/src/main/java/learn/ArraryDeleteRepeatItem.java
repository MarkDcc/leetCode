package learn;

import java.util.Arrays;

/**
 * @author dongchen
 * @Data 2020/12/17
 * @Time 11:43
 */
public class ArraryDeleteRepeatItem {
    public static void main(String[] args) {
        int[] nums = {1,1,3,4};
        ArraryDeleteRepeatItem item = new ArraryDeleteRepeatItem();
        System.out.println(item.removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }

    public int removeDuplicates(int[] nums) {
        if (nums.length == 1) {
            System.out.println(nums);
            return 1;
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                  i++;
                  nums[i] = nums[j];
            }
        }
        return i+1;

    }
}
