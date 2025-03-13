package abstraction;

public class HSBCBank extends RBIBank {

	@Override

	public void creditcard() {

		System.out.println("HSBC Credit card");

	}

	@Override

	public void Debitacrd() {

		System.out.println("HSBC debit card");

	}

	public void Demo() {

		System.out.println("HSBC demo method");
	}

	public static void main(String[] args) {

		// RBIBank RB1 = new RBIBank(); //Static binding

		RBIBank RB2 = new HSBCBank();
		RB2.creditcard();
		RB2.Debitacrd();
		RB2.Loan();
		// RB2.Demo();
	}
}
