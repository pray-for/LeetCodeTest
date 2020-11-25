package maxSum;

public class Solution {
    public static int maxSubArray(int[] nums){
//        int pre = 0, maxAns = nums[0];
//        for (int x : nums) {
//            pre = Math.max(pre + x, x);
//            maxAns = Math.max(maxAns, pre);
//        }
//        return maxAns;
        int sum1 = 0;
        int max = 0;
        int[] sums = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            if (sum1 < 0){
                sum1 = 0;
            }
            sum1 = sum1 + nums[i];
            sums[i] = sum1;
//            System.out.println(sum1);
        }

        max = sums[0];
        for (int i = 0; i < nums.length; i++){
            if (max < sums[i]){
                max = sums[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int sum = maxSubArray(nums);
        System.out.println(sum);
    }
}
