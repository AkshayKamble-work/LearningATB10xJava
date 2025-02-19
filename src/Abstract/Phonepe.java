package Abstract;

abstract class Phonepe {
    public abstract void Recharge(String networkOperator, double amount, double quantity);

    public abstract void RechargeStatus();

    double quantity;
    double amount;
    String NetworkOperator;
}

class Paytm extends Phonepe {

    @Override
    public void Recharge(String networkOperator, double amount, double quantity) {
        this.NetworkOperator = networkOperator;
        this.amount = amount;
        this.quantity = quantity;
        double total = amount * quantity;
        System.out.println("Total Recharge amount is " + total);
    }

    @Override
    public void RechargeStatus() {
        System.out.println("Recharge status is Successful");
        System.out.println("Quantity is " + quantity);
        System.out.println("Network Operator is " + NetworkOperator);
        System.out.println("Recharge amount is " + amount);
    }
}

class TestPhonePe {
    public static void main(String[] args) {
        Paytm p = new Paytm();
        p.Recharge("Airtel", 300, 2);
        p.RechargeStatus();
    }
}
