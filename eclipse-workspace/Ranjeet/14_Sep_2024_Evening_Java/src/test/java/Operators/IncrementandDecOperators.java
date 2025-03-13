package Operators;

public class IncrementandDecOperators {

	public static void main(String[] args) {

		int a =  20;
		int b =  40;
		int c;
		
		c=a;
		System.out.println(c);
		System.out.println(a);  //20  21
		
		//Increment by 1
		a++;   //
		System.out.println(a);   //21
		
		a= a+1;
		System.out.println(a);   //22
		
		//increment by 2
		a = a+2;   //24
		System.out.println(a);
		
		//increment by 5
		a = a+500;
		System.out.println(a);
		a=a+1;
		System.out.println(a);
		
		a+=1;
		System.out.println(a);
		
		//Decrement operator
		
		b--;  //dec by 1
		
		System.out.println(b);
		
		b=b-1;  //dec by 1
		System.out.println(b);
		
		b-=1;
		System.out.println(b);
		
		b=b-17;
		System.out.println(b);
		
		b-=5;
		System.out.println(b);
		
		System.out.println(b=b-5);
		
		c=a;
		System.out.println(c);
	} 

}
