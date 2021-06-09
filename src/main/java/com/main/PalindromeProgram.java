package com.main;
public class PalindromeProgram {
    public static void main(String[] args) {
        getNumberToCheckForPalindrome(36963);
        System.out.println();
        getNumberToCheckForPalindrome(1453);
    }
    private static void getNumberToCheckForPalindrome(int n) {
        int temp = 0;
        int rev = 0;
        temp = n;
        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n = n / 10;
        }
        if (temp == rev) {
            System.out.print("Given number\t"+temp+"\tis palindrome");
        }
        else {
            System.out.println("Given number\t"+temp+"\tis not palindrome");
        }
    }
}
