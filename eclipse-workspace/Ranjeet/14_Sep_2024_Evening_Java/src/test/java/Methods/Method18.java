package Methods;

public class Method18 extends Method11 {

	public static void main(String[] args) {

		Method18 M18 = new Method18();

		int numbers = M18.square(3);
		System.out.println(numbers);   //9

		int no = M18.additon(20);
		System.out.println(no);

		System.out.println(addition(2, 3));
		
	
		int Add = Method18.addition(30, 40);
		System.out.println(Add);
	}

	public int square(int num) { // non static one input paramete rtmethod

		return num * num; // return a square value
	}

	public int additon(int a) {

		return 10 + a;
	}

	public static int addition(int num1, int num2) {

		int sum = num1 + num2;  

		return sum;

	}

}
