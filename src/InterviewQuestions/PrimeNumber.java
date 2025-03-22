package InterviewQuestions;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a number");
        int input=sc.nextInt();
        int number;
        for (number= 2; number<input; number++)
        {
            if (input%number==0)
            break;
        }
        if (input == number)
        {
            System.out.println(input+"  Given Number is Prime");
        }
        else
        {
            System.out.println(input+" Given number is not a Prime");

        }
    }
}
