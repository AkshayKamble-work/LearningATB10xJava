package Methods;

import DataTypes.AdditionofTwoNumbers;

public class Method4 {

	public static void main(String[] args) {

		System.out.println("Statrtign point");   //1
		//Static regular method call from different/another class
	    //Direct calling by method name();  -- not applicable	
		//Demo1();
		
		//Calling by classname.methoodname();
		
		Method5.Demo1();  //Line of code
		Method5.Demo2();  //
		Method5.Additon();
		
		
		System.out.println("Completed");
	}
	
	public static void Test12() {
		
		
		System.out.println("Static method calling from same class - Test12");
	}

}
