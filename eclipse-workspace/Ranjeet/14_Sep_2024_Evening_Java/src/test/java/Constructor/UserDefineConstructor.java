package Constructor;

public class UserDefineConstructor {

	int No1;
	int No2;
	int Addition;

	public UserDefineConstructor() {

		System.out.println("Zero input prrmeter const");

	}

	public UserDefineConstructor(int n1, int n2) {

		No1 = n1;
		No2 = n2;
		Addition = No1 + No2;
		// Addition =n1 +n2;

	}

	public static void main(String[] args) {

		UserDefineConstructor UD1 = new UserDefineConstructor(); // Object
		UserDefineConstructor UD2 = new UserDefineConstructor(10, 20);

		System.out.println(UD2.No1 + " " + UD2.No2); //

		System.out.println(UD2.Addition);

		UD2.Demo();
	}

	public void Demo() {

		System.out.println(No1 + " " + No2); // 0 0 10 ,20
		System.out.println(Addition); // 30
	}

}
