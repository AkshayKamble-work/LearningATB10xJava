package InterviewQuestions.logicalCoding;

import java.util.Scanner;

public class ReverseString_UsingScanner {

    public static void main(String[] args)
    {
        System.out.println("Enter input ...");
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        StringBuilder sb=new StringBuilder(input);
        String output=sb.reverse().toString();
        System.out.println(output);
        test();// calling test method
    }

    public static void test()
    {
        String input;
        System.out.println("Try input to get output");
        Scanner sc=new Scanner(System.in);
        input=sc.nextLine();

        StringBuilder sb=new StringBuilder (input);
        String output=sb.reverse().toString();

        System.out.println(output);
    }

}
