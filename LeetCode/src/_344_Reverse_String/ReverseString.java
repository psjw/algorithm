package _344_Reverse_String;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ReverseString {
    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        reverseString.reverseString(new char[]{'h','e','l','l','o'});
        reverseString.reverseString(new char[]{'H','a','n','n','a','h'});
    }

    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;
        while (start <  end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }

}
