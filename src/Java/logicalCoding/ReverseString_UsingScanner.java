package Java.logicalCoding;

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
    }
}
