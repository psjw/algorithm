package programmers.코딩테스트합격자되기;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;
import java.util.stream.Collectors;

public class 표편집 {
    public static void main(String[] args) {

        System.out.println(solution(8, 2, new String[]{"D 2", "C", "U 3", "C", "D 4", "C", "U 2", "Z", "Z"}));
        System.out.println(solution(8, 2, new String[]{"D 2", "C", "U 3", "C", "D 4", "C", "U 2", "Z", "Z", "U 1", "C"}));
        System.out.println(solution(8, 0, new String[]{"C", "C"}));
        System.out.println(solution(8, 7, new String[]{"C"}));
        System.out.println(solution(4, 0, new String[]{"C", "D 2", "C"}));
    }

    static String solution(int n, int k, String[] cmd) {
        Node nodes[] = new Node[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = new Node();
        }

        for (int i = 1; i < n; i++) {
            nodes[i].prev = nodes[i - 1];
            nodes[i - 1].next = nodes[i];
        }
        Node curNode = nodes[k];
        Stack<Node> stack = new Stack<>();
        for (String c : cmd) {
            if (c.startsWith("U")) {
                int x = Integer.parseInt(c.split(" ")[1]);
                for(int i = 0 ; i < x ; i++){
                    curNode = curNode.prev;
                }
            } else if (c.startsWith("D")) {
                int x = Integer.parseInt(c.split(" ")[1]);
                for(int i = 0 ; i < x ; i++){
                    curNode = curNode.next;
                }
            } else if (c.startsWith("C")) {
                stack.push(curNode);
                Node prev = curNode.prev;
                Node next = curNode.next;
                curNode.isRemoved = true;
                if(prev != null){
                    prev.next = next;
                }
                if(next != null){
                    next.prev = prev;
                    curNode = next;
                }else {
                    curNode = prev;
                }

            } else if (c.startsWith("Z")) {
                Node restoreNode = stack.pop();
                restoreNode.isRemoved = false;
                Node prev = restoreNode.prev;
                Node next = restoreNode.next;
                if(prev != null){
                    prev.next = restoreNode;
                }
                if(next != null){
                    next.prev = restoreNode;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < n ; i++){
            if(nodes[i].isRemoved){
                sb.append("X");
            }else {
                sb.append("O");
            }
        }

        return sb.toString();
    }


    static class Node {
        Node prev;
        Node next;
        boolean isRemoved;
    }
}
