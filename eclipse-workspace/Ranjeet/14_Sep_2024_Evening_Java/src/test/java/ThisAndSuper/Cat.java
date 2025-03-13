package ThisAndSuper;

public class Cat extends Animal {

	
	@Override
	public void sound() {
		super.sound();    //parent 
		System.out.println("Cat class method");
	}
	
	public static void main(String[] args) {
		

		Cat C1 = new Cat();
		
		C1.sound();
	}
	
//	public void sound() {
//		System.out.println("M1 method");
//	}
	

}
