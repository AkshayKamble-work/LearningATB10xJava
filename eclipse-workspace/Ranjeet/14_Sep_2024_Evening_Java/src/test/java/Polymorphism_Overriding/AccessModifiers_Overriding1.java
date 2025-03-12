package Polymorphism_Overriding;

public class AccessModifiers_Overriding1 {

	
	
	/**Rule 1 While performing the overriding  we can't reduce the scope of the am 
      	but we can increase the scope of the am
      	
      	private to protected>default >public
	*/
	
	
	public void Test1() {
		
		System.out.println("Public method test 1");
	}
	
	private void Test2() {
		
		System.out.println("private method test 2");

	}
	
	protected void Test3() {
		
		System.out.println(" protected method test 3");

	}
}

