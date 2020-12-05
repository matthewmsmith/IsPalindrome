package com.smithmatthew;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String userInput;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a word");
        userInput = scn.nextLine();
        isPalindrome(userInput);
    }


    public static boolean isPalindrome(String userInput) {

        for (int i = 0; i < userInput.length() / 2; i++) {
            if (userInput.charAt(i) != userInput.charAt(userInput.length() - i - 1)) {
                System.out.println("Not a palindrome");
                return false;
            }
        }
        System.out.println("This is a palindrome");
        return true;

      }
    }

