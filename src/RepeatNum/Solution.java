package RepeatNum;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static int findRepeatNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++){
            for (int j = i; j < nums.length; j++){
                if (nums[i] == nums[j]){
                    result =  nums[i];
                    break;
                }
            }
        }
        return result;
    }

    public static int findRepeatNumber1(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int result = -1;
        for (int num : nums){
            if (!set.add(num)){
                result = num;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = {2,3,1,0,2,5,3};
        int result = findRepeatNumber1(a);
        System.out.println(result);
    }
}
