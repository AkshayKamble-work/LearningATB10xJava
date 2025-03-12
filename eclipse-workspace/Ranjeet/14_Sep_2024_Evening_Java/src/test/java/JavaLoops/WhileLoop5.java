package JavaLoops;

public class WhileLoop5 {

	public static void main(String[] args) {

//		System.out.println("By using for loop");
//		
//		int num = 15;
//
//		for (int i = 1; i <= 10; i++) {
//
//			System.out.println(num + " * " + i + " = " + num * i);
//		
//		}
//		
//		
//		System.out.println();

		System.out.println("By using while loop");

		int no = 1;  //2
		int no1 = 15;

		while (no <= 10) {  //1<=10 - true  11<=10 -false
                               //15  *  1  = 15*1 = 15
			                   //15  *  2  = 15*2 = 30
			                   //15  * 10   = 15*10 = 150
			System.out.println(no1 + " * " + no + " = " + no1 * no);
			no++;

		}
		
	}

}
