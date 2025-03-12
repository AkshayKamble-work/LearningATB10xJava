package Operators;

public class Test5 {

	public static void main(String[] args) {

		int a = 10;
		int b = 5;

		System.out.println(a < b); // false
		System.out.println(a > b); // 10>5 true

		int a1 = 20;
		int b1 = 21;
		System.out.println(a1 < b1); // 20<20 -false
		System.out.println(a1 <= b1); // 20<=20 true

		System.out.println(a1 > b1); // false
		System.out.println(a1 >= b1); // true

		System.out.println(a1 == b1); // true
		System.out.println(a1 != b1); // false
		

	}

}
