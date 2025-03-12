package Polymorphism;

public class Methodoverloading8 {

	public static void main(String[] args) {

		/**
		 * Can we overload a final and private method - Ans --> Yes 
		 * 
		 */
		Methodoverloading8.M1();
		Methodoverloading8.M1('c');
		Methodoverloading8.M1(10,"Test");
	}

	public static void M1() {

		System.out.println("Zero i/p para method");
	}

	private static void M1(int i) {

		System.out.println("one i/p para method");
	}
	
	private static void M1(int i,String j) {

		System.out.println("two i/p para method");
	}
	

	public final static void M1(char c) {

		System.out.println("char i/p para method");
	}


	public final static void M1(char c,int i) {

		System.out.println("char and int i/p para method");
	}
	

}
