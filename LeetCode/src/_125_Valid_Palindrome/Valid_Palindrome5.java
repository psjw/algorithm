package _125_Valid_Palindrome;

import java.util.stream.Collectors;

public class Valid_Palindrome5 {
    public static void main(String[] args) {
        Valid_Palindrome5 validPalindrome = new Valid_Palindrome5();
        System.out.println(validPalindrome.isPalindrome("abcdcba"));;
        System.out.println(validPalindrome.isPalindrome("abcdcba"));;
        System.out.println(validPalindrome.isPalindrome("dog"));
        System.out.println(validPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
    }
    public boolean isPalindrome(String s) {
        String result = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        StringBuilder sb = new StringBuilder(result);
        return sb.toString().contentEquals(sb.reverse());
    }
}
