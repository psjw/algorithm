package programmers.level0;

import java.util.Arrays;

public class 배열의유사도 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"a", "b", "c"}, new String[]{"com", "b", "d", "p", "c"})); //2
        System.out.println(solution(new String[]{"n", "omg"}, new String[]{"m", "dot"})); //0
    }

    private static int solution(String[] s1, String[] s2) {
        int answer = 0;
        answer = (int) Arrays.stream(s1).flatMap(x -> Arrays.stream(s2).filter(k -> k.equals(x))).count();
        return answer;
    }
}
