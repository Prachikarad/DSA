/**
 * LeetCode Problem: 9. Palindrome Number
 * Difficulty: Easy
 * Approach: Reverse the number
 * Time Complexity: O(log10 n)
 * Space Complexity: O(1)
 */

public class PalindromeNumber {

    public static boolean isPalindrome(int x) {

        // Negative numbers are not palindrome
        if (x < 0) {
            return false;
        }

        int original = x;
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x = x / 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {

        int num1 = 121;
        int num2 = -121;
        int num3 = 10;

        System.out.println(num1 + " -> " + isPalindrome(num1));
        System.out.println(num2 + " -> " + isPalindrome(num2));
        System.out.println(num3 + " -> " + isPalindrome(num3));
    }
}