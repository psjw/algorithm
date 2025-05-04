package pccp.ch02.exlist;

import java.util.Arrays;

public class Ex3Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(12345)));
    }

    public static int[] solution(long n) {
        int[] answer = {};
        String str = String.valueOf(n);
        answer = new int[str.length()];
        int idx = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            int temp = Character.getNumericValue(str.charAt(i));
            answer[idx++] = temp;
        }
        return answer;
    }
}
