package Interface;

public class Test1{

	public static void main(String[] args) {

		
		Test1 T1 = new Test1();  //static binding
		
		T1.M1();
		T1.M2();
		T1.M3();
		T1.M4();
		
		 Test1 T2  = new Test1();
		 
			T2.M1();
			T2.M2();
			T2.M3();
		//	T2.M4();
		

	}

	public void M1() {
		
		System.out.println("M1 Method");
	}

	public void M2() {
		System.out.println("M3 Method");
	}

	public void M3() {
		System.out.println("M3 Method");
	}
	
	public void M4() {
		System.out.println("M4 Method");
	}

}
