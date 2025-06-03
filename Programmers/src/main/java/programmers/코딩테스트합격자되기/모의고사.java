package programmers.코딩테스트합격자되기;

import java.util.*;
import java.util.stream.Collectors;

public class 모의고사 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(solution(new int[]{1, 3, 2, 4, 2})));
    }

    static int[] solution(int[] answers) {
        int[] answer = {};

        int[] one = new int[]{1, 2, 3, 4, 5};
        int[] two = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == one[i % one.length]) {
                map.put(1, map.getOrDefault(1, 0) + 1);
            }

            if (answers[i] == two[i % two.length]) {
                map.put(2, map.getOrDefault(2, 0) + 1);
            }

            if (answers[i] == three[i % three.length]) {
                map.put(3, map.getOrDefault(3, 0) + 1);
            }
        }

        Integer max = map.entrySet().stream().mapToInt(x -> x.getValue()).max().getAsInt();


        answer = map.entrySet().stream()
                .filter(e -> Objects.equals(e.getValue(), max))
                .sorted(Map.Entry.<Integer, Integer>comparingByKey())
                .mapToInt(Map.Entry::getKey).toArray();

        return answer;
    }
}
