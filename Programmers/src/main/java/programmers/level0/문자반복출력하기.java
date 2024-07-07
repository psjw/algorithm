package programmers.level0;

import java.util.stream.IntStream;

public class 문자반복출력하기 {
    public static void main(String[] args) {
        System.out.println(solution("hello",3)); //'hhheeellllllooo'
    }

    public static String solution(String my_string, int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        my_string.chars().mapToObj(Character::toString).forEach(myChar -> {
            IntStream.range(0, n).forEach(i ->{
                sb.append(myChar);
            });
        });
        answer = sb.toString();
        return answer;
    }
}
