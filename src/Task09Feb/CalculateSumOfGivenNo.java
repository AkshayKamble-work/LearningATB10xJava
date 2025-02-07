package Task09Feb;

import java.util.Scanner;

public class CalculateSumOfGivenNo
{
    public static void main(String[] args)
    {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num");
        int Result = sc.nextInt();
        for (int i = 1; i <= Result; i++) {
            sum += i;
        }

        System.out.println("Sum of given is " + sum);
// Object Creattion and method call to Sum method via Object
        CalculateSumOfGivenNo no=new CalculateSumOfGivenNo();
        no.Sum();
}
// Second Way
    public void Sum ()
    {

        int sum = 0;

        // Loop to calculate sum
        for (int i = 1; i <= 100; i++)
        {
            sum += i;
        }

        // Print the result
        System.out.println("Sum of numbers from 1 to 100: " + sum);
    }

}
