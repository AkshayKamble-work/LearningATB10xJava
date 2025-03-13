package Methods;

public class Method1 {  //Method1 --Class Name

	
	 // User define method
	 // 1. Static regular method
	      //1.Static regular method call from same class.	
   public static void main(String[] args) {
	   System.out.println("Main method started");


	   //1. Direct calling by method name
	   //Syntax - MethodName();   
	   Test1();
	   Test2();
	   
	   //2. Calling by classname.methodname();
	    
	   Method1.Test1();
	   Method1.Test2();
		  
	   
	   System.out.println("Main method ended");
	   
	}

	
   //syntax 
//   access_modifier static returntype methodname() {
//	   
//	   //body
//   }
   
   //test();
   //javaAutomation();
   
   //static method
   public static void Test1() {
	 
	   System.out.println("Static regular method started --> Test1");
	   
   }
	
   public static void Test2() {
	   
	   System.out.println("Static regular method started --> Test2");

   }
	
	
	
}


