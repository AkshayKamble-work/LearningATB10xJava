package Java.basic.casting;

import java.util.Scanner;
class DaysConvertedIntoYears  {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a days: ");
        int num = sc.nextInt(); // Input number of days

        int years = num / 365;  // Calculate years
        int remainingDays = num % 365;

        int months = remainingDays / 30; // Calculate months
        int days = remainingDays % 30;   // Remaining days

        // Display the result
        System.out.println("Years = " + years);
        System.out.println("Months = " + months);
        System.out.println("Days = " + days);

    }
}
