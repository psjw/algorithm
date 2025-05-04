package pccp.ch02.exlist;

import java.util.Arrays;

public class Ex2Main {
    public static void main(String[] args) {
        //순열검사
        System.out.println(solution(new int[]{4, 1, 3, 2}));
        System.out.println(solution(new int[]{4, 1, 3}));
    }

    public static boolean solution(int[] arr) {
        boolean answer = true;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if ((i + 1) != arr[i]) {
                answer = false;
                break;
            }
        }
        return answer;
    }
}
