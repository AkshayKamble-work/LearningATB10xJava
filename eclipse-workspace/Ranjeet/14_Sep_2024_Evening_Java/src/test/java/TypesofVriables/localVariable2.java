package TypesofVriables;

public class localVariable2 {

	public static void main(String[] args) {

		 
		localVariable2 obj = new localVariable2();   //object createtion
		
		obj.Demo1();
		obj.Demo2();
		
		localVariable2.Demo2();
	
	}
	
	public void Demo1() {   //Non static method
		
		
		//local var - nonnstatic lV
		
		int num = 55;  
		
		double d1 = 44.44;
		
		float  f1 = 44.44f;
		
		String name = "Java";
		
		System.out.println(num);
		System.out.println(d1);
		System.out.println(f1);
		System.out.println(name);
	}
	
	public static void Demo2() {
		
		int test = 33;    
		 
		String Test1 = "Automation";
		
		System.out.println(test);
		System.out.println(Test1);
	}

}
