package pccp.ch02.ex;

import java.util.Arrays;

public class Ex2Sol1Main {
    public static void main(String[] args) {
        //순열검사
        System.out.println(solution(new int[]{4, 1, 3, 2}));
        System.out.println(solution(new int[]{4, 1, 3}));
    }

    public static boolean solution(int[] arr) {
        //O(2*N + NLogN) = O(NlogN)
        int[] answer = new int[arr.length];
        for (int i = 0; i < arr.length; i++) { //O(N)
            answer[i] = i + 1;
        }
        Arrays.sort(arr); //O(NlogN)
        return Arrays.equals(answer, arr); //O(N)
    }
}
