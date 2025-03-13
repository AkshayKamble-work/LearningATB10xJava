package JavaLoops;

import java.util.Scanner;

public class ForLoop9 {

	
	public ForLoop9(int i) {
		
		
	}
	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in); //Predefien class

		System.out.println("Enter a number");

		int num = sc.nextInt();

		for (int i = 1; i <= 10; i++) {

			System.out.println(num + " * " + i + " = " + num * i);

		}

	}

}
