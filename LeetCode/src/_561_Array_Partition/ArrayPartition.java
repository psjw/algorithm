package _561_Array_Partition;

import java.util.Arrays;

public class ArrayPartition {
    public static void main(String[] args) {
        System.out.println(new ArrayPartition().arrayPairSum(new int[]{1,3,4,2}));
        System.out.println(new ArrayPartition().arrayPairSum(new int[]{1,4,3,2}));
        System.out.println(new ArrayPartition().arrayPairSum(new int[]{6,2,6,5,1,2}));
    }

    public int arrayPairSum(int[] nums) {
        int result = 0;
        int[] sortedNums = Arrays.stream(nums).sorted().toArray();
        for (int i = 0; i < sortedNums.length; i+=2) {
            result+=Math.min(sortedNums[i], sortedNums[i + 1]);
        }
        return result;
    }
}
