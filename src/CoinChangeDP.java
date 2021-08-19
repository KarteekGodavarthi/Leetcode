import java.util.Arrays;

public class CoinChangeDP {
    public static void main(String[] args) throws Exception {
        int[] num = {1,2,3,4};
        coinChange(num, 5);
    }

    public static int coinChange(int[] coins, int amount) {
        if(amount == 0)
            return 0;
        
        int[] result = new int[amount+1];
        Arrays.fill(result, Integer.MAX_VALUE - 1);
        result[0] = 0;
        
        for(int coin : coins){
            for(int i = coin; i <= amount; i++){
                result[i] = Math.min(result[i - coin] + 1, result[i]);
            }
        }
        if(result[amount] == Integer.MAX_VALUE - 1)
            return -1;
        
        return result[amount];
    }
}