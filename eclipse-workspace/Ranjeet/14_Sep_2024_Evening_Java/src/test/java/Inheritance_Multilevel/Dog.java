package Inheritance_Multilevel;

class Dog extends Animal{
int np =2357;

    //o/p = 17

	
	private Dog(){
		
	}
	
	public int i =10;
	
	public void M1() {
		
		System.out.println("This is M1 method");
	}
	
	 static void main(String[] args) {
		
		Dog D1 = new Dog();
		D1.M1();
//		D1.walk();
		D1.eat();
		
		return;
	}
}
