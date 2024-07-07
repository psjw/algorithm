package _234_Palindrome_Linked_List;

public class PalindromeLinkedList {
    public static void main(String[] args) {
//        System.out.println(new PalindromeLinkedList().isPalindrome(new ListNode()));
    }

    public boolean isPalindrome(ListNode head) {
        return false;
    }
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
