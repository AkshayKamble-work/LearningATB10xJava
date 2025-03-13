package Polymorphism_Overriding;

public class Maruti extends Car{

	 
	
	public void TheftySaftey() {
		
		System.out.println("Maruti TheftySaftey");
	}
	
	public void Start() {
		
		System.out.println("Maruti start");
	}
	
	public void Stop() {
		
		System.out.println("Maruti Stop");
	}
	
	public void Demo() {
		System.out.println("M2 method");
	}
	
	public void Refuel() {
		
		System.out.println("Maruti refuel");
	}
	
	public static void main(String[] args) {
		
		Car M1  = new Car();	
		M1.Start();   //
		M1.Stop();
		M1.M1();
		M1.Refuel();
		
		Maruti M2 = new Maruti();  //Static binding/CTP/Early binding
		M2.Start();
		M2.Stop();
		M2.Demo();
		M2.TheftySaftey();
        M2.Refuel();
        
        Car C1  =  new Maruti();    //Dynamic binding/Run time poly/Late binding/Upcastinor topcasting
		//C1.Demo();
        C1.Start();  // MAruti start
        C1.Stop();   // Maruti stop
        C1.Refuel();   //Maruti refuel
        C1.M1();     //Car M1 Method
        // C1.TheftySaftey();
        
        Maruti MM1 =(Maruti) new Car();  //down casting  --> ClassCastException:
 
        MM1.Start();
        
         
        
		
	}

}
