package pccp.ch03.exmap;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex2MapMain {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"}));
        System.out.println(solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"},
                new String[]{"josipa", "filipa", "marina", "nikola"}));
        System.out.println(solution(new String[]{"mislav", "stanko", "mislav", "ana"}
                , new String[]{"stanko", "ana", "mislav"}));
    }

    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Long> participantMap = Arrays.stream(participant)
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        for (String com : completion) {
            participantMap.computeIfPresent(com, (k, v) -> v - 1);
        }
        answer = participantMap.entrySet().stream().filter(x -> x.getValue() > 0)
                .map(x -> x.getKey()).findFirst().get();

        return answer;
    }
}
