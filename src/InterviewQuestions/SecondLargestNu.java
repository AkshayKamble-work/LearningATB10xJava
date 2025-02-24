package InterviewQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestNu
{
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the size of array..");
        int input=Sc.nextInt();
        int arr[]=new int[input];
        for(int i=0;i<input;i++)
        {
            arr[i]=Sc.nextInt();
        }
        Arrays.sort(arr);
        int secondLarge=arr[arr.length-2];
        System.out.println("Second Largest number is --> "+secondLarge);
    }

}
