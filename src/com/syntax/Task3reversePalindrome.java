package com.syntax;



public class Task3reversePalindrome {
    void printIsPalindrome(String str) {
        StringBuilder stringBuilder = new StringBuilder(str); //StringBuilder class can be used when
        // you want to modify a string without creating a new object
        stringBuilder.reverse();
        String reversedStr = stringBuilder.toString();
        if (str.equals(reversedStr)) {
            System.out.println("string is palindrome");
        } else {
            System.out.println("string is not palindrome");
        }
    }

            public static void main(String[] args) {

            Task3reversePalindrome task3 = new Task3reversePalindrome();
            task3.printIsPalindrome("dad");
            task3.printIsPalindrome("aladin");
        }
    }

