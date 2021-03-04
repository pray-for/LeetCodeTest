package FromOne;


public class Solution {

    public static int[] printNumbers(int n) {
        int max = 0;
        max = (int) Math.pow(10, n);
        int[] nums = new int[max-1];
        for (int i = 1; i < max; i++){
            nums[i-1] = i;
        }
        return nums;
    }

    public static void main(String[] args) {
        int n = 2;
        int[] nums = printNumbers(n);
        for (int num : nums) {
            System.out.println(num);
        }
    }

}
