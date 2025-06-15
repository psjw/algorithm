package programmers.코딩테스트합격자되기;

import java.util.HashMap;
import java.util.Map;

public class 할인행사 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"banana", "apple", "rice", "pork", "pot"}, new int[]{3, 2, 2, 2, 1}
                , new String[]{"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork",
                        "rice", "pot", "banana", "apple", "banana"}));

        System.out.println(solution(new String[]{"apple"}, new int[]{10}
                , new String[]{"banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana"}));


        System.out.println(solution(new String[]{"a", "b"}, new int[]{1, 9}
                , new String[]{"b", "b", "b", "b", "b", "b", "b", "b", "b", "b", "a"}));
    }

    static int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String, Integer> wantMap = new HashMap<>();

        for (int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }
        for (int i = 0; i < discount.length - 9; i++) {
            Map<String, Integer> discountMap = new HashMap<>();
            for (int j = i; j < i + 10; j++) {
                discountMap.put(discount[j], discountMap.getOrDefault(discount[j], 0) + 1);
            }
            if (discountMap.equals(wantMap)) {
                answer++;
            }
        }
        return answer;
    }
}
