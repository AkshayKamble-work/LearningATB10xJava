package JavaLoops;

import java.util.Scanner;

public class factorialNumber {

	public static void main(String[] args) {

		// 5 = 5*4*3*2*1 = 120
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int fac = 1;
		for (int i = 1; i <= num; i++) {
			// 1<=3 - true
			// 2<=3 - true
			// 3<=3 - true
			// 4<=3 - false
			fac = fac * i;
			// 1 = 1*1;= 1
			// 1 = 1*2 = 2
			// 2 = 2*3 = 6
		}
		System.out.println("Fac of " + num + " is  --" + fac);

	}

}
