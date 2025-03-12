package Polymorphism;

public class Methodoverloading7 {

	public static void main(String[] args) {

		/**
          Can we overload a method by changing only the return type? - Ans --> No 
		 * 
		 */
		
		Methodoverloading7 M7 = new Methodoverloading7();
		
		int i=M7.M1();
		System.out.println(i);
		
		String str = M7.M1("10");
		System.out.println(str);
		
	}
	
	public int M1() {
		
		return 10;
	}
	
	public String M1(String i) {
		
		String S1  = i;
		
		return S1;
	}
	
	
	public int M2() {
		
		return 20;
	}

}
