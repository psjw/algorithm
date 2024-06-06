package _124_Valid_Palindrome;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Valid_Palindrome {
    public static void main(String[] args) {
        Valid_Palindrome validPalindrome = new Valid_Palindrome();
        System.out.println(validPalindrome.isPalindrome("abcdcba"));;
        System.out.println(validPalindrome.isPalindrome2("abcdcba"));;
        System.out.println(validPalindrome.isPalindrome2("dog"));;
        System.out.println((int) 'a');
        System.out.println((int) 'z');
    }

    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length()-1;

        while (start < end) {
            char startChar = s.charAt(start);
            char endChar = s.charAt(end);
            if (!Character.isLetterOrDigit(startChar)) {
                start++;
                continue;
            }
            if (!Character.isLetterOrDigit(endChar)) {
                end--;
                continue;
            }
            if (Character.toLowerCase(startChar) != Character.toLowerCase(endChar)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }


    public boolean isPalindrome2(String s) {
        String result = s.chars()
                    .map(Character::toLowerCase)
                    .filter(Character::isLetterOrDigit)
                    .mapToObj(x -> Character.toString((char)x))
                    .collect(Collectors.joining());

        StringBuilder sb = new StringBuilder(result);
        return sb.toString().contentEquals(sb.reverse());
    }


}
