package logicalProgram;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		//Prime Number  - PN is number that greater then 1 and divided by 1 or itself only.
		
		//Example - 2,3,5,7,11,13,17......
			
			
			System.out.println("Enter a number");
			
			Scanner sc =new Scanner(System.in);
			
			int num = sc.nextInt();
			int i;
			for(i=2 ;i< num ;i++) 
				if(num%i==0)
					break;
			
			if(i==num)
				System.out.println("Prime number");
			else
				System.out.println("Not prime number");
			
	}
		
		
	
}
