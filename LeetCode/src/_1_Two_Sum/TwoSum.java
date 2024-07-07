package _1_Two_Sum;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        ArrayPrintln(new TwoSum().twoSum(new int[]{2, 6, 11, 15}, 8));
        ArrayPrintln(new TwoSum().twoSum(new int[]{2, 7, 11, 15}, 9));
        ArrayPrintln(new TwoSum().twoSum(new int[]{3,2,4}, 6));
        ArrayPrintln(new TwoSum().twoSum(new int[]{3,3}, 6));
    }

    private static void ArrayPrintln(int[] twoSum) {
        Arrays.stream(twoSum).forEach(System.out::print);
        System.out.println();
    }


    private int[] twoSum(int[] nums, int target) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if(temp + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
