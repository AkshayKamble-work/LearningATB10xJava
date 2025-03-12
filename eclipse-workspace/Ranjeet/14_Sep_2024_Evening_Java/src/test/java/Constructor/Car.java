package Constructor;

public class Car {

	String model;
	int year;

	public Car() {

		model = "Default model";
		year = 2020;

	}

	public Car(String Model, int Year) {

		model = Model;
		year = Year;
	}

	public static void main(String[] args) {

		Car C1 = new Car();

		C1.Display();

		Car C2 = new Car("Tesla", 2023);
		
		C2.Display();

	}

	public void Display() {

		System.out.println("Model -->" + model + " Year -->" + year);

		// Null 0 , 0 ,0 , Default model , 2020
	}

}
