package programmers.level0;

import java.util.stream.Collectors;

public class 외계행성의나이 {
    public static void main(String[] args) {
        System.out.println(solution(23)); //cd
        System.out.println(solution(51)); //fb
        System.out.println(solution(100)); //baa
    }

    public static String solution(int age) {
        String answer = "";
        answer = String.valueOf(age)
                .chars()
                .map(x -> x + 49)
                .mapToObj(Character::toString)
                .collect(Collectors.joining());
        return answer;
    }
}
