package LogicalPrograms;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		
	
		
		int OrignialNumber, Sum , Rem;
		
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num  = Sc.nextInt();
		
		//123
		
		OrignialNumber = num;
		//123
		            //123>0  - True  
		
		             //12>0  - True
		              //1>0  - true
		            // 0>0  - false
		for(Sum = 0;num > 0 ; num=num/10 ) {
			
			Rem = num%10;  //123%10 = 3 2  1
			
			Sum  = Sum*10 + Rem;
		    //3   = 3*10+2  ///32
			//32  = 32*10 +1  //321
		}
		
		if(Sum == OrignialNumber) {
			
			System.out.println("Palindrome number");
		}
		else {
			
			System.out.println("Not palindrome number");
		}
		
		
	}

}
