package abstraction;

public class HDFCBank extends RBIBank {

	public static void main(String[] args) {

		RBIBank RB = new HDFCBank();
		RB.creditcard();
		RB.Debitacrd();
	}

	@Override
	public void creditcard() {
		System.out.println("HDFC credit card");

	}

	@Override
	public void Debitacrd() {
		System.out.println("HDFC debit card");

	}

}
