package AccessDiff;

import AccessModifiers.Default1;
import AccessModifiers.Private1;
import AccessModifiers.Protected1;
import AccessModifiers.Public1;


public class Test extends Protected1{

	//P1
	//name
	public static void main(String[] args) {

		Public1 P1 = new Public1();
		P1.M1();
		System.out.println(P1.number);
		
		
		Private1 P2 = new Private1();
//		P2.D1();
//		System.out.println(P2.No);
		
		
		Default1 D1  = new Default1();
//		D1.T1();
//		System.out.println(D1.Test);	
		
		Protected1 P4 = new Protected1();
	 
		
		Test T1  = new Test();
		T1.P1();
		System.out.println(T1.name);
		
		
	}

}
