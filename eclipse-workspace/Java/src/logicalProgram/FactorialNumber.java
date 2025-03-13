package logicalProgram;

import java.util.Scanner;

public class FactorialNumber {
	
	public static void main(String[] args) 
	{
		// Example --> 5*4*3*2*1 = 120
		int number=5;
		int fact=1;
		for(int i=1;i<=number;i++)
		{
			fact=fact*i;
			
		}
		
		System.out.println("Factorial of "+number+" is :: "+fact);
		
		// using Scanner class
		System.out.println("Please enter Number");
		int No;
		int fac = 1;
		Scanner sc=new Scanner(System.in);
		No=sc.nextInt();
		for(int i=1;i<=No;i++)
		{
			fac=fac*i;
		}
		System.out.println("Factorial of "+No+" is "+fac);
		
		
	}

}
