package abstraction;

public class Abstraction2 extends Abstraction1 {

	@Override
	public void M2() {

		System.out.println("Child class M2 method");
	}

	public void M4() {
		System.out.println("Child class M4 method");

	}

	public static void main(String[] args) {

		Abstraction1 AB1 = new Abstraction2(); // dynamic binding

		AB1.M1(); //
		AB1.M2();
		AB1.M3();
		AB1.M4();
		// AB1.Demo();

		Abstraction2 Ab2 = new Abstraction2();
		// Ab2.Demo();

		Ab2.M1();

	}

	@Override
	public void M3() {
		// TODO Auto-generated method stub

	}
}
