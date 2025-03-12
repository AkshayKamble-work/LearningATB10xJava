package Operators;

public class LogicalOperators {

	public static void main(String[] args) {

//		int a = 20;
//		int b= 40;\
//		
		
		boolean A  = true;
		boolean B =  true;
		
		System.out.println(A&&B);   //True
		System.out.println(A||B);   //TRUE
		
		
		boolean A1  = true;
		boolean B1 =  false;
		
		System.out.println(A1&&B1);  //false
		System.out.println(A1||B1);   //true
		
		
		boolean A2  = false;
		boolean B2 =  true;
		
		System.out.println(A2&&B2);  //false
		System.out.println(A2||B2);   //true
		
		boolean A3  = false;
		boolean B3 =  false;
		
		System.out.println(A3&&B3);  //false
		System.out.println(A3||B3);   //false
		
	}

}
