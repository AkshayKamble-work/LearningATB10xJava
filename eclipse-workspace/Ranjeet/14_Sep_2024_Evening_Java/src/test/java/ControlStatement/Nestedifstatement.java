package ControlStatement;

public class Nestedifstatement {

	public static void main(String[] args) {

		int a = 500;
		int b = 700;
		int c = 900;

		if (a > b) {
			if (a > c) {
				System.out.println("a is greater");
			}	
		}
		else if (b > c && b > a) {

			System.out.println("B is greater");
		}
		else {

			System.out.println("C is greatest");
		}

	}
}