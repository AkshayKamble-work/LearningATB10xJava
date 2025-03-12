package TypesofVriables;

public class staticGlobalVariable2 {

	
	static int  no =44;
	
	static String  name1 = "Welcome";
	
	
	public static void main(String[] args) {

		//static variable calling from same class
		System.out.println(no);
		System.out.println(name1);
		
		//static variable calling from diff class
		
		System.out.println(differentClass.name);
		System.out.println(differentClass.test);
	
//		System.out.println(name);
//		System.out.println(test);
		
		Demo();
	}

	
	public static void Demo() {
		
		 int  no1 =44;
		
		 String  name2 = "Welcome";
	}
}
