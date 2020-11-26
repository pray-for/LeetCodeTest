package MajorityElement;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution {
    public static int majorityElement(int[] nums) {
        Set set = new HashSet();
        int num;
        int count = 0;
        int result = 0;
        for (int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        Iterator it = set.iterator();
        while (it.hasNext()){
            count = 0;
            num = (int) it.next();
            for (int i = 0; i < nums.length; i++){
                if (num == nums[i]){
                    count++;
                }
                if (count > Math.floor(nums.length/2)){
                    result = num;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,3,4};
        int num = majorityElement(nums);
        System.out.println(num);
    }
}
