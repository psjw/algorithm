package programmers.코딩테스트합격자되기;

import java.util.Arrays;
import java.util.Stack;

public class 크레인인형뽑기게임 {
    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}},
                new int[]{1, 5, 3, 5, 1, 2, 1, 4}));
    }

    static int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < moves.length; i++) {
            int move = moves[i] - 1;
            for (int j = 0; j < board.length; j++) {
                if (board[j][move] > 0) {
                    if (stack.isEmpty()) {
                        stack.push(board[j][move]);
                        board[j][move] = 0;
                        break;
                    } else if (stack.peek() == board[j][move]) {
                        stack.pop();
                        board[j][move] = 0;
                        answer++;
                        break;
                    } else {
                        stack.push(board[j][move]);
                        board[j][move] = 0;
                        break;
                    }

                }
            }
        }
//        for(int i =0 ; i < board.length; i++){
//            System.out.println(Arrays.toString(board[i]));
//        }
//        System.out.println(stack);
        return answer * 2;
    }
}
