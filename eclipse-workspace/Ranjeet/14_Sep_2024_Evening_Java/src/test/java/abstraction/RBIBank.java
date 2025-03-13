package abstraction;

public abstract class RBIBank {

	int number = 10;

	public void Loan() {

		System.out.println("RBI loan");
	}

	// SBI bank
	//
	public abstract void creditcard();

	public abstract void Debitacrd();
}
