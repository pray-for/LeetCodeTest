package MoreHalf;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static int majorityElement(int[] nums) {
        int result = 0;
        int count = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++){
            if (!map.containsKey(nums[i])){
                map.put(nums[i], 1);
            }else {
                count = (int) map.get(nums[i]);
                count++;
                map.put(nums[i], count);
            }
        }
        for (Integer key : map.keySet()){
            if (map.get(key) > nums.length/2){
                result = key;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int[] nums = {1,2,3,2,2,2,5,4,2};
        int result = majorityElement(nums);
        System.out.println(result);

    }
}
