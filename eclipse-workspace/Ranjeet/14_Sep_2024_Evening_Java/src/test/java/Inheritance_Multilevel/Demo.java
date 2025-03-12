package Inheritance_Multilevel;

public class Demo extends Animal{

	public void walk() {
		System.out.println("This in walk method");
	}
	
	public static void main(String[] args) {
		Demo D1 = new Demo();
		D1.eat();
		
	}
}
