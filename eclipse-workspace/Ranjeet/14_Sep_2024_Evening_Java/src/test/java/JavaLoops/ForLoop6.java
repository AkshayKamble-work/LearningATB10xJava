package JavaLoops;

public class ForLoop6 {

	public static void main(String[] args) {

		// WAP additon of first 5 number 1+2+3+4+5 =15

		// strating number = 1
		// last m=number =5
		// inc by 1

		int additon = 0;

		for (int i = 1; i <= 1000; i++) {

			// 1<=5 = true
			// 2<=5 = true
			additon = additon + i;
			// 1 =0+1;
			// 1= 1+2
			// 15=10+5
		}

		System.out.println("Addition of first 5 numbers is -->" + additon);
	}

}
