package programmers.코딩테스트합격자되기;

import java.util.HashSet;

public class 두개의수로특정값만들기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4, 8}, 6));
        System.out.println(solution(new int[]{2, 3, 5, 9}, 10));

    }


    static boolean solution(int[] arr, int target) {
        boolean answer = false;
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            int remainder = target - arr[i];
            if (set.contains(remainder)) {
                answer = true;
                break;
            }
            set.add(arr[i]);

        }

        return answer;
    }
}
