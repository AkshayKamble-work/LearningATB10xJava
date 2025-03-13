package JavaLoops;

public class WhileLoop3 {

	public static void main(String[] args) {

		// WAP to print 20 to 15 numbers

//		starting number = 20
//	    ending number  =  15
//	    dec by 1

		int i = 20;

		while (i >= 15) { // 20<=15 - false

			System.out.println(i);
			i--;
		}

		System.out.println("Loop completed");
	}

}
