package pccp.ch02.exmap;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex2Sol1MapMain {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"}));
        System.out.println(solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"},
                new String[]{"josipa", "filipa", "marina", "nikola"}));
        System.out.println(solution(new String[]{"mislav", "stanko", "mislav", "ana"}
                , new String[]{"stanko", "ana", "mislav"}));
    }

    public static String solution(String[] participant, String[] completion) {
        List<String> players = new LinkedList<>();

        for(String p : participant) {
            players.add(p);
        }
        for(String c : completion) {
            players.remove(c); // 병목 구간 -> 타임아웃 발생
        }

        return players.get(0);
    }
}
