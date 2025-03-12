package LogicalPrograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		System.out.println(12%2);
		
	   int OrignialNumber, Sum , Rem;
		
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num  = Sc.nextInt();
		int i;
		
		//12  
		        // 2<13  - tru
		for(i=2 ;i<num ;i++ )
			
			if(num%i == 0)		  //12%2 == 0		 
			break;  //0==0    - ue
			
			if(i==num) {//13==12
				System.out.println("Prime number ");
			    System.out.println("Prime number ");
			}
			else {
				System.out.println("Not prime number");		
			}
		}
		
}
