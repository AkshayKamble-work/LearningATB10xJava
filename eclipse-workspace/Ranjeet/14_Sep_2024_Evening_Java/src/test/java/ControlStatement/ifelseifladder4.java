package ControlStatement;

public class ifelseifladder4 {

	public static void main(String[] args) {

		// a =10 ,b =50, c=30;

		int a = 680; // 60>50 - true 60>90 - Fslse
		int b = 50; // 50>90 - false && 50>60 - false - flse
		int c = 90;

		// false && false
		if (a > b && a > c) { // True && True - false
			System.out.println("a is greatest number");
		}
		// 50>30 - true && 50>10 - true
		else if (b > c && b > a) {

			System.out.println("b is greatest number");
		} else {
			System.out.println("c is greatest number");
		}

	}

}
