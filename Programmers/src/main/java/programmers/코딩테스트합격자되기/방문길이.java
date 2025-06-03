package programmers.코딩테스트합격자되기;

import java.util.*;

public class 방문길이 {
    public static void main(String[] args) {
//        System.out.println(solution("ULURRDLLU"));
        System.out.println(solution("LULLLLLLU"));
        System.out.println(solution("URULDD"));
        System.out.println(solution("LLLLLLUURRRDDLURL"));
    }

    static int solution(String dirs) {


        int answer = 0;
        Map<String, int[]> commandMap = new HashMap<>();
        commandMap.put("U", new int[]{0, 1});
        commandMap.put("L", new int[]{-1, 0});
        commandMap.put("R", new int[]{1, 0});
        commandMap.put("D", new int[]{0, -1});
        int currentX = 0, currentY = 0;

        Set<String> set = new HashSet<>();

        for(int i = 0; i < dirs.length(); i++) {
            String nowCommand = dirs.charAt(i) + "";
            int[] commandDirection = commandMap.get(nowCommand);
            int nextX = currentX + commandDirection[0];
            int nextY = currentY + commandDirection[1];

            if(nextX <-5 || nextY <-5 || nextX > 5 || nextY > 5) {
                continue;
            }
            String currentDirection = currentX + " " + currentY + " " + nextX + " " + nextY;
            String reverseDirection = nextX + " " + nextY + " " + currentX + " " + currentY;
            set.add(currentDirection);
            set.add(reverseDirection);
            currentX = nextX;
            currentY = nextY;
        }

        System.out.println(set);

        return set.size()/2;
    }

}
