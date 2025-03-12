package Polymorphism;

public class Methodoverloading5 {

	public static void main(String[] args) {

		
		Methodoverloading5 M5 = new Methodoverloading5();
		
		M5.Demo("Test");
		 
		String sb = "test";
		
		StringBuffer sb1 = new StringBuffer("Java");
		
		M5.Demo(sb1);
		
	  //M5.Demo(null);   // CTE - compile time error
/**		
 * Reason for Compile-Time Error: If you uncomment this line, you will get a compile-time error (CTE). 
 * This is because null can match either the String or the StringBuffer method, and Java cannot 
 * determine which one to call. Since both methods are equally valid for null (as both String 
 * and StringBuffer are reference types), the compiler faces ambiguity and cannot choose between the two.
 */
		
	}

	public void Demo(String str) {
		
		System.out.println("String method calling");
	}
	
	public void Demo(StringBuffer str) {
		
		System.out.println("StringBuffer method calling");
	}

}
