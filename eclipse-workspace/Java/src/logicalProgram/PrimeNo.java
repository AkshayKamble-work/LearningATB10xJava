package logicalProgram;

import java.util.Scanner;

public class PrimeNo {

	
	public static void main(String[] args) {
		
		//Prime Number  - PN is number that greater then 1 and divided by 1 or itself only.
		
				//Example - 2,3,5,7,11,13,17......
					
					
					System.out.println("Enter a number");
					
					Scanner sc =new Scanner(System.in);
					
					int input = sc.nextInt();
					int no;
					for(no=2 ;no< input ;no++) 
						if(input%no==0)
							break;
					
					if(no==input)
						System.out.println(input+" :: Prime number ");
					else
						System.out.println(input+" :: Not prime number");
					
	}
}
