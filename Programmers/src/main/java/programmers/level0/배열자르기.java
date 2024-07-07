package programmers.level0;

import java.util.Stack;
import java.util.stream.IntStream;

public class 배열자르기 {
    public static void main(String[] args) {
        System.out.println(solution("jaron")); //noraj
        System.out.println(solution("bread")); //daerb
    }

    private static String solution(String my_string) {
        String answer = "";
        Stack<String> stack = new Stack<>();
        my_string.chars().mapToObj(Character::toString).forEach(x -> {
            stack.push(x);
        });
        StringBuilder sb = new StringBuilder();
        IntStream.range(0, my_string.length())
                        .forEach(index -> sb.append(stack.pop()));
        answer = sb.toString();
        return answer;
    }
}
