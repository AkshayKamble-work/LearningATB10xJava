package Java.logicalCoding;


import java.util.Scanner;

public class MissingElements {


    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter N (Size including missing number):");

        int N=input.nextInt();
        int []arr=new int[N-1];
        System.out.println("Enter "+(N-1)+" numbers; ");
        int sumArr=0;
        for (int i = 0; i < N-1; i++)
        {
            arr[i]=input.nextInt();
            sumArr+=arr[i];
        }
        int expectedSum=N*(N+1)/2;
        int missingElement=expectedSum-sumArr;

        System.out.println("Missing Number ;"+missingElement);
    }
}
