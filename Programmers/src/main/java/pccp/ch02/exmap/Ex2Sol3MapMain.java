package pccp.ch02.exmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Ex2Sol3MapMain {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"}));
        System.out.println(solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"},
                new String[]{"josipa", "filipa", "marina", "nikola"}));
        System.out.println(solution(new String[]{"mislav", "stanko", "mislav", "ana"}
                , new String[]{"stanko", "ana", "mislav"}));
    }


    //O(nlogn)
    public static String solution(String[] participant, String[] completion) {
        Arrays.sort(participant); // n O(nlogn)
        Arrays.sort(completion); // n-1 O(nlogn)

        //O(n)
        for (int i = 0; i < completion.length; i++) {
            if(!participant[i].equals(completion[i])) return participant[i];
        }

        return participant[participant.length - 1];
    }
}
