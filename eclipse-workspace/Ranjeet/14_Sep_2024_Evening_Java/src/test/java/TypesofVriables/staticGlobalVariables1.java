package TypesofVriables;

public class staticGlobalVariables1 {

	
	
	static int number  = 300;   //Static globaal varibale
	
	static String Name = "Automtion Testing";
	
	
	//Creating a variable outside the method/function is known as global varibale
	
	public static void main(String[] args) {
		
		System.out.println(number);   //300
		
		System.out.println(Name);
		
		staticGlobalVariables1.Demo1();   //400
		
	
		
		staticGlobalVariables1 sv = new staticGlobalVariables1();
		
		sv.Test();
	}
	
	
	public static void Demo1() {
		
		int number1 = 55;
		
		number = 400;
		
		Name ="Java";
		System.out.println(number);
		System.out.println(Name);
		
	}
	
	public void Test() {
		
		number = 600;
		
		System.out.println(number);
	}

}
