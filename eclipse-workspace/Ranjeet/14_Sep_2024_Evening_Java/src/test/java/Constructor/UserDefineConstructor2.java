package Constructor;

public class UserDefineConstructor2 {
 
	//Name
	//Model
	//Price
	//Engine
	//Year
	
	String Name;
	String Model;
	int Price;
	String Engine;
	int Year;
	
	
	public UserDefineConstructor2(String Name1, String Model1, int Price1, String Engine1, int Year1) {
	
		Name = Name1;
		Model = Model1;
		Price = Price1;
		Engine = Engine1;
		Year = Year1;
		
		
	}
	
	public static void main(String[] args) {

	
		UserDefineConstructor2 UD1  = new UserDefineConstructor2("Kia","Seltos",2000000,"Automatic",2020);
		UserDefineConstructor2 UD2  = new UserDefineConstructor2("Hundai","Creta",2200000,"Manual",2022);
		UserDefineConstructor2 UD3  = new UserDefineConstructor2("Tata","Nexon",1800000,"Manual",2023);
		UserDefineConstructor2 UD4  = new UserDefineConstructor2("BMW","X6",18000000,"Automatic",2019);
		
		
		System.out.println("Car Name -->"+UD1.Name+" || "+"Model -->"+UD1.Model+" || "+"Price -->"+UD1.Price+" || "+"Engine -->"+UD1.Engine+" || "+"Year -->"+UD1.Year);
		System.out.println("Car Name -->"+UD2.Name+" || "+"Model -->"+UD2.Model+" || "+"Price -->"+UD2.Price+" || "+"Engine -->"+UD2.Engine+" || "+"Year -->"+UD2.Year);
		System.out.println("Car Name -->"+UD3.Name+" || "+"Model -->"+UD3.Model+" || "+"Price -->"+UD3.Price+" || "+"Engine -->"+UD3.Engine+" || "+"Year -->"+UD3.Year);
		System.out.println("Car Name -->"+UD4.Name+" || "+"Model -->"+UD4.Model+" || "+"Price -->"+UD4.Price+" || "+"Engine -->"+UD4.Engine+" || "+"Year -->"+UD4.Year);

		
	}
	

}
