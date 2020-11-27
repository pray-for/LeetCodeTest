package BestSellStock;

public class Solution {
    public static int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 0; i < prices.length; i++){
            for (int j = i; j < prices.length; j++){
                if (prices[i] < prices[j]){
                    int temp = prices[j] - prices[i];
                    if (temp > max){
                        max = temp;
                    }
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{7,1,5,3,6,4};
        int result = maxProfit(nums);
        System.out.println(result);
    }
}
