package OddEvenNumber;

public class Solution {

    public static int[] exchange(int[] nums) {

        int[] result = new int[nums.length];
        int first = 0;
        int last = nums.length-1;
        for (int i = nums.length-1; i >= 0; i--){
            if (nums[i]%2 == 0){
                result[last] = nums[i];
                last--;
            }else {
                result[first] = nums[i];
                first++;
            }
        }
        return result;
    }

    public static int[] exchange1(int[] nums) {

        int left = 0;
        int right = nums.length-1;
        int temp;
        while (left < right){
            if (nums[left]%2 != 0){
                left++;
                continue;
            }
            if (nums[right]%2 == 0){
                right--;
                continue;
            }
            temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] result = exchange1(nums);
        for (int num : result){
            System.out.println(num);
        }
    }
}
