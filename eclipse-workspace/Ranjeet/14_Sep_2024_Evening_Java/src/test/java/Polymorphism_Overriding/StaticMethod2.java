package Polymorphism_Overriding;

public class StaticMethod2 extends StaticMethods1 {

	public static void main(String[] args) {

		StaticMethod2 S2 = new StaticMethod2();

		S2.Demo3();

		StaticMethods1 S3 = new StaticMethods1();
		S3.Demo3();

		StaticMethods1 S4 = new StaticMethod2();
		
		S4.Demo3();
		S4.Demo2();
		S4.Demo1();

	}

	@Override
	public void Demo3() {

		System.out.println("Child Demo3 Method");
	}

	public static void Demo2() {

		System.out.println("Child Demo2 Method");
	}

	public static void Demo1() {

		System.out.println("Child Demo2 Method");
	}

}
