package _5_Longest_Palindromic_Substring;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        System.out.println(new LongestPalindromicSubstring().longestPalindrome("babad"));
        System.out.println(new LongestPalindromicSubstring().longestPalindrome("dcbabcdd"));
        System.out.println(new LongestPalindromicSubstring().longestPalindrome("cbbd"));
        System.out.println(new LongestPalindromicSubstring().longestPalindrome("ac"));
    }

    private  int maxLength = 1;
    private  int leftIdx = 0;

    private String longestPalindrome(String s) {

        if (s.length() < 2) {
            return s;
        }

        int length = s.length() - 1;

        for (int i = 0; i < length; i++) {
            extendsPalindrome(s, i, i + 1);
            extendsPalindrome(s, i, i + 2);
        }
        return s.substring(leftIdx, leftIdx + maxLength);
    }

    private void extendsPalindrome(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;

            if (maxLength < right - left - 1) {
                maxLength = right - left - 1;
                leftIdx = left + 1;
            }


        }
    }

}
