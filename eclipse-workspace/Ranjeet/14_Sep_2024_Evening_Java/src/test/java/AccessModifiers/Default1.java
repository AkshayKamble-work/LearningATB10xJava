package AccessModifiers;

public class Default1 {

	String Test = "Java";
	
	public static void main(String[] args) {

		
		Default1 D1 = new Default1();
		
		System.out.println(D1.Test);
		D1.T1();
	}
	
	
	 void T1() {
		
		System.out.println("Default method");
		
	}

}
