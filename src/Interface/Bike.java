package Interface;

public class Bike implements Vehicle {
    @Override

   public void Break() {
        System.out.println("Bike stopped");
    }

    @Override
    public void Move() {
        System.out.println("Bike is running ");

    }

    @Override
    public void Gear() {
        System.out.println("Bike gear up  and bike at 4th gear");
    }

    @Override
    public void start() {
        System.out.println("Bike is started ");
    }
}
