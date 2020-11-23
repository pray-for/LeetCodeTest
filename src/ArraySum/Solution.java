package ArraySum;

import java.util.ArrayList;

/**
 * 求一维数组动态和
 */
public class Solution {
    public int[] runningSum(int[] nums){
//        int[] running = new int[nums.length];
//        for (int i = 0; i < nums.length; i++){
//            int numsSum = 0;
//             for (int j = 0; j <= i; j++){
//                 numsSum = numsSum + nums[j];
//             }
//             running[i] = numsSum;
//        }
//        return running;

        //改进算法
        for( int i = 1 ; i < nums.length ; i++ ){
            nums[i] += nums[i-1];
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4};
        Solution s = new Solution();
        int[] fanhui = s.runningSum(a);
        for (int i = 0; i < fanhui.length; i++){
            System.out.println(fanhui[i]);
        }
    }
}
