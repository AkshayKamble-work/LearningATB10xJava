package Java.logicalCoding;

import javax.swing.text.Utilities;
import java.sql.SQLOutput;
import java.util.*;
public class ReverseWords
{
            public static void main(String[] args) {
                // Create a scanner for user input
                Scanner scanner = new Scanner(System.in);

                // Prompt the user to enter a sentence
                System.out.println("Enter a sentence: ");
                String input = scanner.nextLine();

                // Split the input string into words
                String[] words = input.split(" ");

                // Reverse the order of words
                StringBuilder reversedSentence = new StringBuilder();
                for (int i = words.length - 1; i >= 0; i--) {
                    System.out.print(words[i]+" ");

                }

                // Print the reversed sentence
              //  System.out.println("Reversed Sentence: " + reversedSentence);

                // Close the scanner
                scanner.close();
            }
        }




