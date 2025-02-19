public abstract class MSTRC {
    double seat;
    double price;
    String destinationName;

    public abstract void Booking(String city_Place, double price_R, double seat_R);
    public abstract void OfferCode();
}

class Redbus extends MSTRC {

    @Override
    public void Booking(String city_Place, double price_R, double seat_R) {
        this.seat = seat_R;
        this.destinationName = city_Place;
        this.price = price_R;
        double totalBill = seat * price;
        System.out.println("Seat selected: " + seat);
        System.out.println("Destination name: " + destinationName);
        System.out.println("Price per seat: " + price);
        System.out.println("Total bill: " + totalBill);
    }

    @Override
    public void OfferCode() {
        // Implement OfferCode logic here
        System.out.println("Offer code applied successfully.");
    }
}

class TestRedBus {

    public static void main(String[] args) {
        Redbus book = new Redbus();
        book.Booking("Pune", 500, 2);
        book.OfferCode();
    }
}
