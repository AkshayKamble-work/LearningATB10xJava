package Polymorphism_Overriding;

public class AccessModifiers_Overriding2 extends AccessModifiers_Overriding1 {

	public static void main(String[] args) {

		AccessModifiers_Overriding2 AM1 = new AccessModifiers_Overriding2();
		AM1.Test1();

		AccessModifiers_Overriding1 AM2 = new AccessModifiers_Overriding1();
		AM2.Test1();
		
		AccessModifiers_Overriding2 ABS	=(AccessModifiers_Overriding2) new AccessModifiers_Overriding1();
		
		//java.lang.ClassCastException
	}
	
	

//	@Override
//	protected void Test1() {
//		
//		System.out.println("child class method test 1");
//	}

	
//	public void Test3() {
//
//		System.out.println("protected method test 3");
//
//	}
	
	
//	private void Test3() {  //Cannot reduce the visibility of the inherited method 
//		from AccessModifiers_Overriding1
//		
//		System.out.println(" protected method test 3");
//
//	}

	
	public int m1() {
		
		return 10;
	}
	
	public String m1(int i) {
		
		String S1 = "Tets";
		return S1;
	}
}
