package Polymorphism;

public class Methodoverlaoding1 {

	public static void main(String[] args) {

		//Method overloading
		
		Methodoverlaoding1 MO  = new  Methodoverlaoding1();
		
		MO.m1(55, "Java");     //
		MO.m1("Automation");
		MO.m1("Java",12); 
	}

	public void m1() {

		System.out.println("Zero i/p para method");
	}

	public void m1(int j) { // 1 input para

		System.out.println("one input param method");
	}

	public void m1(String i) { // one i/p

		System.out.println("One input string para method");
	}

	public void m1(String k, int i) { // 2 i/p method

		System.out.println("Two input para method");
	}
	
	public void m1(int i, String k) { // 2 i/p method

		System.out.println(i);
		System.out.println(k);
		System.out.println("Two input para method int and String");
	}

	
	
}
