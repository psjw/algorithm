package programmers.코딩테스트합격자되기;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class 완주하지못한선수 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"}));
        System.out.println(solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"}, new String[]{"josipa", "filipa", "marina", "nikola"}));
        System.out.println(solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"}));
    }

    static String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();
        for (String s : completion) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        for (String s : participant) {
            if (map.containsKey(s)) {
                Integer value = map.get(s);
                value--;
                map.put(s, value);
            } else {
                answer = s;
            }
        }

        Optional<String> findAnswer = map.entrySet().stream().filter(x -> x.getValue() < 0)
                .map(Map.Entry::getKey).findFirst();
        return findAnswer.orElse(answer);
    }
}
