package Polymorphism;

public class Methodoverloading4 {

	public static void main(String[] args) {

		Methodoverloading4 M4 = new Methodoverloading4();   
		
		Object obj = new Object();
		M4.Demo(obj);    //Object method calling
		M4.Demo("Java"); //String method calling
		M4.Demo(null);   //String method calling
		
		/**	
		 * M4.Demo(null); output -String method calling
		 * When the method is called with null, Java tries to determine the most appropriate method
		 *  based on the available overloaded methods. Since String is more specific than Object 
		i.e., String is a subclass of Object), the Demo(String str) method is selected for null.
		 */		
	}
	
	public void Demo(Object obj) {
		
		System.out.println("Object method calling");
	}

	public void Demo(String str) {
		
		System.out.println("String method calling");
	}


}
