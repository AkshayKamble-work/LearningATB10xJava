package Polymorphism;

public class Methodoverloading9 {

	public static void main(String[] args) {

		
		Methodoverloading9 M9 = new Methodoverloading9();  //static binding/CTP
		
		M9.Test(10, 10.8f);   //int float method
		M9.Test(12.5f, 10);   //float int method
		
		//M9.Test(10,20);   //CTE
		//M9.Test(10.4f, 19.5f);  //CTE
/**
 * Reason for Compile-Time Error (CTE): Both 10 and 20 are int values. There is no method in
 *  the class Methodoverloading9 that accepts two int arguments, so the compiler cannot find a 
 *  suitable method to call. This results in a compile-time error.
 */
	}
	
	public void Test(int i,float j) {
		
		System.out.println("int float method");
	}
	
	public void Test(float j,int i) {
		
		System.out.println("flaot int method");
		
	}

}
