package FindDisapperaed;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
//        List numList = new ArrayList();
//        for (int i = 0; i < nums.length; i++){
//            numList.add(nums[i]);
//        }
//        for (int i = 1; i <= nums.length; i++){
//            if (!numList.contains(i)){
//                numList.add(i);
//            }
//        }
//        for (int i = 0; i < nums.length; i++){
//            numList.remove(0);
//        }
//        return numList;

        List<Integer> res = new ArrayList<>();
        //遍历数组元素，给对应的索引位置的元素作标记
        for(int i = 0; i < nums.length; i++){
            int num = Math.abs(nums[i]);    //假定第 0 个元素为 4
            int index = num - 1;    //将元素4转换为下标，下标从0开始的话，它就是3
            if(nums[index] > 0){    //数组的第3个数大于0（从0开始数）
                nums[index] *= -1;  //将第3个数变为负数
            }
        }
        // 寻找没有标记的索引位置
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                int num = i + 1;  //将索引转化为对应的元素
                res.add(num);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{4,3,2,7,8,2,3,1};
        List result;
        result = findDisappearedNumbers(nums);
        System.out.println(result);
    }
}
