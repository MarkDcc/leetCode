package learn.DP;

/**
 * @author dongchen
 * @Data 2020/12/21
 * @Time 20:54
 */
public class CoinChange {

    public static void main(String[] args) {
        CoinChange coinChange = new CoinChange();
        int[] coins = {1,2,5};
        System.out.println(coinChange.coinChange(coins,11));

    }

    public int coinChange(int[] coins, int amount){
        int[] dp = new int[amount+1];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = amount+1;
        }
        dp[0] = 0;
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < coins.length; j++) {
                if((i-coins[j]) < 0){
                   continue;
                }
                dp[i] = Math.min(dp[i-coins[j]]+1,dp[i]);
            }
        }
        return dp[amount] == amount+1 ? -1 : dp[amount];
    }


}
