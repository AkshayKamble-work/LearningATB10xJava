package Java.logicalCoding;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int factorial = 1;
        int number;

        // Prompt the user for input
        System.out.println("Please Enter a Number ...");
        number = sc.nextInt();

        // Calculate the factorial
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }

        // Print the result
        System.out.println("The factorial of " + number + " is: " + factorial);


    }
}
