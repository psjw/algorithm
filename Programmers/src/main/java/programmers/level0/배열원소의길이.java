package programmers.level0;

import java.util.Arrays;
import java.util.stream.IntStream;

public class 배열원소의길이 {
    public static void main(String[] args) {
        Arrays.stream(solution(new String[]{"We", "are", "the", "world!"})).forEach(System.out::println); //[2, 3, 3, 6]
        Arrays.stream(solution(new String[]{"I", "Love", "Programmers."})).forEach(System.out::println);  //[1, 4, 12]
    }

    private static int[] solution(String[] strlist) {
        int[] answer = {};
        answer = new int[strlist.length];
        for(int i = 0; i < strlist.length ; i++){
            answer[i] = strlist[i].length();
        }

        return answer;
    }
}
