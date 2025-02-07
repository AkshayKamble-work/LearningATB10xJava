package Task09Feb;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a number ...");
        int input=sc.nextInt();
        int no;
        for (no=2;no<input;no++)
        {
            if (input%no==0)
            {
                break;
            }
        }
        if (input ==no)
        {
            System.out.println(input+" This is Prime Number ..");
        }else {
            System.out.println(input+" This is not an Prime Number ..");
        }
    }
}
