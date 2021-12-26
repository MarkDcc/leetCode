package learn;

/**
 * @author dongchen
 * @Data 2020/12/20
 * @Time 22:20
 */
public class MaxProfit {
    public static void main(String[] args) {

        int[] profits = {1,2,3,4,5};
        MaxProfit maxProfit = new MaxProfit();
        int profit = maxProfit.maxProfit(profits);
        System.out.println(profit);
    }

    public int maxProfit(int[] profits){
        int sum = 0;
        for (int i = 0; i < profits.length; i++) {
            if(i< profits.length-1 && profits[i+1] - profits[i] > 0){
                sum = sum + (profits[i+1] - profits[i]);
            }
        }
        return sum;
    }
}
