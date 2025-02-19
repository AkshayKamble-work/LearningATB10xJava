package Abstract;

// Abstract class
abstract class Zomato {
    String roti = "Butter Naan";
    String paneer = "Shahi Paneer";
    String rice = "Jeera Rice";

    public abstract void Order();
    public abstract void OrderStatus();
    public abstract void Bill();
}

// Subclass
class Restaurant extends Zomato {
    @Override
    public void Order() {
        System.out.println("One Plate " + paneer);
        System.out.println("Roti Plate " + roti);
        System.out.println("Rice " + rice);
    }

    @Override
    public void Bill() {
        double rotiPrice = 20.0;
        double paneerPrice = 120.0;
        double ricePrice = 60.0;

        double totalBill = rotiPrice + paneerPrice + ricePrice;
        System.out.println("Total Bill is " + totalBill);
    }

    @Override
    public void OrderStatus() {
        System.out.println("Order is Delivered...");
    }
}
 class TestZomato {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        restaurant.Order();
        restaurant.Bill();
        restaurant.OrderStatus();
    }
}
