package NumberSum;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int[] twoSum(int[] nums, int target) {
//        int[] result = new int[2];
//        for (int i = 0; i < nums.length; i++){
//            for (int j = i+1; j < nums.length; j++){
//                if (target == nums[i] + nums[j]){
//                    result[0] = i;
//                    result[1] = j;
//                }
//            }
//        }
//        return result;
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; ++i) {
            if (hashtable.containsKey(target - nums[i])) {
//                System.out.println(target - nums[i]);
                return new int[]{hashtable.get(target - nums[i]), i};
            }
//            System.out.println(nums[i]);
            hashtable.put(nums[i], i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] result;
        result = twoSum(nums, target);
        System.out.println("第一个：" + result[0]);
        System.out.println("第二个：" + result[1]);
    }

}
