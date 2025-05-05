package pccp.ch02.exmap;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Ex2Sol2MapMain {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"}));
        System.out.println(solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"},
                new String[]{"josipa", "filipa", "marina", "nikola"}));
        System.out.println(solution(new String[]{"mislav", "stanko", "mislav", "ana"}
                , new String[]{"stanko", "ana", "mislav"}));
    }

    public static String solution(String[] participant, String[] completion) {
        Map<String, Integer> players = new HashMap<>();

        for (String player : participant) {
            players.put(player, players.getOrDefault(player, 0) + 1);
        }

        for (String player : completion) {
            int n = players.get(player) - 1;
            if (n == 0) players.remove(player);
            else players.put(player, n);
        }

        return players.keySet().iterator().next();
    }
}
