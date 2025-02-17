package Constructor;

class Vehicle {
    Vehicle() {
        System.out.println("Vehicle constructor called");
    }
}
class CarKia extends Vehicle {
    CarKia()
    {
        super(); // Calls parent class constructor
        System.out.println("Car constructor called");
    }
}
 class Test {
    public static void main(String[] args) {
        CarKia myCar = new CarKia(); // Calls both constructors
    }
}

