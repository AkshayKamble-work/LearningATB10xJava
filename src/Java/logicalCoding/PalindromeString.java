package Java.logicalCoding;

import java.util.*;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        String reversed = "";
        // Input from user
        System.out.print("Enter a string: ");
        input = scanner.nextLine();

        // Reverse the string
        reversed = new StringBuilder(input).reverse().toString();

        // Check if the original and reversed strings are the same
        if (input.equalsIgnoreCase(reversed)) {
            System.out.println("The string \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is not a palindrome.");
        }

        scanner.close();
    }
}



