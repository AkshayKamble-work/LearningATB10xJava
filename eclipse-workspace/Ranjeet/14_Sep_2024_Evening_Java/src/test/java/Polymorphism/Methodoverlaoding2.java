package Polymorphism;

public class Methodoverlaoding2 {

	public static void main(String[] args) {
	
		Methodoverlaoding2 M2 = new Methodoverlaoding2();
		
		M2.addition(10, 20);
		Methodoverlaoding2.addition(10, "Test");
		Methodoverlaoding2.addition(10, 20, "Java");
	}
	
	
	public void addition(int i,int j) {
		
		int add = i+j;  
		System.out.println("Additon of two int numbers -->"+add);
	}
	
	public static void addition(int i,String k) {
		
		System.out.println(i+k);   //10Test
		System.out.println("Two input para method");

	}
	
	public static void addition(int i,int j,String k) {
		
		System.out.println(i+j+k);   //30Java  10+20  ==30+Test  30Test
		System.out.println(k+i+j);   //Java30  java1020
		System.out.println("Three input para method");   //Tree

	}

}
