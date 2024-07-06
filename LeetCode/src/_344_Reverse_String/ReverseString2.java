package _344_Reverse_String;

import java.util.Arrays;
import java.util.Stack;

public class ReverseString2 {
    public static void main(String[] args) {
        reverseString(new char[]{'h','e','l','l','o'});
        reverseString(new char[]{'H','a','n','n','a','h'});
    }

    private static void reverseString(char[] s) {
        Stack<Character> stack = new Stack<>();
        for (Character c : s) {
            stack.add(c);
        }

        for(int i =0 ; i< s.length;i++){
            s[i] = stack.pop();
        }
    }
}


