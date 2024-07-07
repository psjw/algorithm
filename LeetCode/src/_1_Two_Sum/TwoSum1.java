package _1_Two_Sum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum1 {
    public static void main(String[] args) {
        ArrayPrintln(new TwoSum1().twoSum(new int[]{2, 6, 11, 15}, 8));
        ArrayPrintln(new TwoSum1().twoSum(new int[]{2, 7, 11, 15}, 9));
        ArrayPrintln(new TwoSum1().twoSum(new int[]{3,2,4}, 6));
        ArrayPrintln(new TwoSum1().twoSum(new int[]{3,3}, 6));
    }

    private static void ArrayPrintln(int[] twoSum) {
        Arrays.stream(twoSum).forEach(System.out::print);
        System.out.println();
    }


    private int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> resultMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if(resultMap.containsKey(temp)){
                return new int[]{resultMap.get(temp), i};
            }
            resultMap.put(nums[i], i);
        }
        throw new UnsupportedOperationException();
    }
}
