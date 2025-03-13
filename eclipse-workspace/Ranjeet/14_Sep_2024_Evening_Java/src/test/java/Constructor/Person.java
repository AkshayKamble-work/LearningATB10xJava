package Constructor;

public class Person {

	static String name;   // virat
	static int age;   //36
	
	public static void main(String[] args) {

		
		Person P1 = new Person("Virat",36);
		P1.display();
		
	}
	
	public Person(String name,int age) {

		this.name = name;
		this.age = age;
		
	}
	
	public void display() {
		
		System.out.println("Name --"+name +" "+"Age -->"+age);
	}

}
