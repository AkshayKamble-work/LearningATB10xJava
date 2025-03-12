package LogicalPrograms;

import java.util.Scanner;

public class Additionofdigits {

	public static void main(String[] args) {

	//	input = 1234
	//  output = 10
		
		int num,sum,rem;
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		num =sc.nextInt();
		
		for(sum=0 ; num>0 ; num=num/10) {  //12%10 == 
			
			rem = num%10;
			sum =sum+rem;
		}
		System.out.println("Sum of digits --->"+sum);
			
	}

}
