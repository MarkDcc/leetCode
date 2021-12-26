package twoSum;

/**
 * @author dongchen
 * @Data 2020/8/26
 * @Time 13:46
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = new int[]{2,7,11,15};
        TwoSum twoSum = new TwoSum();

        System.out.println(

                twoSum.twoSum(nums,13));
    }

    public int[] twoSum(int[] nums, int target) {
        for (int i=0; i< nums.length; i++){
            for (int j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("No sum ");
    }
}
