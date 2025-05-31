package pccp.ch04.examset;


import java.util.HashSet;
import java.util.Set;

public class Ex2SetSol {

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"tank", "kick", "know", "wheel", "land", "dream"}));
        System.out.println(solution(new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"}));
    }

    public static boolean solution(String[] words) {
        boolean answer = true;
        Set<String> set = new HashSet<>();

        set.add(words[0]);
        char last = words[0].charAt(words[0].length() - 1);
        for (int i = 1; i < words.length; i++) {
            String w = words[i];
            char first = w.charAt(0);
            if(last != first) {
                return false;
            }
            if(!set.add(words[i])){
                return false;
            }

            last = w.charAt(w.length() - 1);
        }
        return answer;
    }
}
