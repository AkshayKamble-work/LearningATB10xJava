package TypesofVriables;

public class localVariables1 {

	//static int rollNumber  = 20;
	
	public static void main(String[] args) {

		//1.A variable declared inside the body of the method/function is called as local variable

		localVariables1.Test1();
		localVariables1.Test2();
		
		
	}
	
	public static void Test1() {
		
		//static int rollNumber  = 20;  //40    static not allowed

		int rollNumber  = 20;  //40    //Local& Nonstatic variables
		
		String Name = "Akash";   //Non static local variable

		System.out.println(rollNumber);  //20
		 
		System.out.println(Name);    //Akash
		
		
		System.out.println(rollNumber);   //20
		
		rollNumber = 40;     
		
		System.out.println(rollNumber);  //40

	}
	
	public static void Test2() {
		
		int rollNumber  = 50;
		 
		System.out.println(rollNumber);
		
		String name ="Demo";
		
		System.out.println(name);
	}

}
