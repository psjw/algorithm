package _238_Product_of_Array_Except_Self;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        ArrayPrintln(new ProductOfArrayExceptSelf().productExceptSelf(new int[]{1,3,5,7}));
        ArrayPrintln(new ProductOfArrayExceptSelf().productExceptSelf(new int[]{1,2,3,4}));
        ArrayPrintln(new ProductOfArrayExceptSelf().productExceptSelf(new int[]{-1,1,0,-3,3}));
    }

    private int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int temp = 1;
        for (int i = 0; i < nums.length; i++) {
            result[i] = temp;
            temp *= nums[i];
        }
        temp = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] *= temp;
            temp *= nums[i];
        }
        return result;
    }

    private static void ArrayPrintln(int[] twoSum) {
        Arrays.stream(twoSum).forEach(System.out::println);
        System.out.println();
    }
}
