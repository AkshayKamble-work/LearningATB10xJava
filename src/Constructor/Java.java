package Constructor;


class Car {
    String brand;
    int year;

    Car() {
        this("Ford", 2020); // Calls the constructor below
        System.out.println("Default constructor called");
    }

    Car(String b, int y) {
        this.brand = b;
        this.year = y;
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}

class Main {
    public static void main(String[] args) {
        Car myCar = new Car(); // Calls the default constructor
        System.out.println(myCar.brand);
        System.out.println(myCar.year);
    }
}


