package InterviewQuestions.logicalCoding;

import java.util.Scanner;
public class SeparateStringComponents {
/*
input: String s1 = "a1456b2cdefab3a@";
output:
Letters: abcdefaba
Numbers: 145623
Special Characters: @
 */
public static void main(String[] args)
{
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String s1 = scanner.nextLine(); // Read input string
    // Variables for storing letters, numbers, and special characters
    String letters = "";
    String numbers = "";
    String specialCharacters = "";
    // Use a single loop to separate components
    for (int i = 0; i < s1.length(); i++)
    {
        char ch = s1.charAt(i); // Extract character
        if (Character.isLetter(ch)) {
            letters += ch; // Add to letters
        } else if (Character.isDigit(ch)) {
            numbers += ch; // Add to numbers
        } else {
            specialCharacters += ch; // Add to special characters
        }
    }
    // Display results
    System.out.println("Letters: " + letters);
    System.out.println("Numbers: " + numbers);
    System.out.println("Special Characters: " + specialCharacters);
}
}



