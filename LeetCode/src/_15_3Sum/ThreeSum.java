package _15_3Sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        System.out.println(new ThreeSum().threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
        System.out.println(new ThreeSum().threeSum(new int[]{-1, 0, 1, 2, -1, -5}));
        System.out.println(new ThreeSum().threeSum(new int[]{0, 1, 1}));
        System.out.println(new ThreeSum().threeSum(new int[]{0, 0, 0}));

    }

    private List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        int[] sortedNums = Arrays.stream(nums).sorted().toArray();
        int sum = 0;

        for (int i = 0; i < sortedNums.length; i++) {
            if (i > 0 && sortedNums[i] == sortedNums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = sortedNums.length - 1;
            while (left < right) {
                sum = sortedNums[i] + sortedNums[left] + sortedNums[right];
                if(sum < 0){
                    left++;
                }else if(sum > 0){
                    right--;
                }else{
                    results.add(Arrays.asList(sortedNums[i], sortedNums[left], sortedNums[right]));

                    while ((left < right && sortedNums[left] == sortedNums[left + 1])) {
                        left++;
                    }

                    while (left < right && sortedNums[right] == sortedNums[right - 1]) {
                        right--;
                    }

                    left++;
                    right--;
                }
            }
        }


        return results;
    }
}
