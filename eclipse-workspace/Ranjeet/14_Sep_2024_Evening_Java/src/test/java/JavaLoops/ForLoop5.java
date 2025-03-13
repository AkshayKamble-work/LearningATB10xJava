package JavaLoops;

public class ForLoop5 {

	public static void main(String[] args) {

		// WAP to print even number till 2 - 20

		// 2 4 6 8 10 12 14 16 18 20
		// Starting number = 2
		// last number = 20
		// inc by 2

		for (int no = 2; no <= 20; no = no + 2) { // no+=2 4=2+2

			// no=2 2<=20 true
			// no=4 4<=20 true

			// no=20 20<=20 true
			// no=22 22<=20 false
			System.out.print(no + " "); // 2 to 20
		}
		System.out.println();

		// increment by 3

		for (int test = 3; test <= 30; test += 3) { // test = test+3

			System.out.print(test + " ");
		}

		System.out.println();

		for (int test = 5; test <= 50; test = test + 5) { // test = test+3

			System.out.print(test + " ");
		}

	}

}
