package programmers.코딩테스트합격자되기;

import java.util.Arrays;

public class n_2배열자르기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3, 2, 5)));
        System.out.println(Arrays.toString(solution(4, 7, 14)));
    }

    static int[] solution(int n, long left, long right) {
        int[] answer = {};

//        int[] result = new int[n * n];
        int lenth = (int) (right - left) + 1;
        answer = new int[lenth];
        int index = 0;
        for(long i=left; i<=right; i++) {
            long x = i / n;
            long y = i % n;
            long max = Math.max(x, y);
            answer[index++] = (int)max + 1;
        }

        System.out.println(Arrays.toString(answer));
        return answer;
    }
}

