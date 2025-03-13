package Interface;

public class HSBCBank implements RBIBank,USBank,BrazilBank{

	
	public void HomeLoan() {
		
		System.out.println("HSBCBank -- HomeLoan");
	}
	
	public void EducationLoan() {
		
		System.out.println("HSBC Ed loan");
	}

	public void DebitCard() {
		
		System.out.println("HSBC Bank Debit Card");
	}

	public void CreditCard() {

		System.out.println("HSBC Bank Credit Card");
	}

	public void TeansferMoney() {
	
		System.out.println("HSBC Bank Transfer Money");
		
	}

	public void PersonalLoan() {
		
		System.out.println("HSBC Bank Perosnal loan");
		
	}

	public void BikeLoan() {
		System.out.println("HSBC Bank bike loan");
	}

	public void carLoan() {
		
		
		System.out.println("HSBC Bank car loan");

	}

	public void MutulalFund() {
		System.out.println("HSBC Bank mutual  funds");
		
	}

	public void GoldLoan() {

		System.out.println("HSBC Bank gold loan");

	}

	
	
}
