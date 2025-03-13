package Interface;

public class Test {


	//RBIBank RB = new RBIBank();   //Not allowed to create object of the Interface and abstract classes
	
	public static void main(String[] args) {
		
		System.out.println(RBIBank.minbalance);
		
		HSBCBank HB = new HSBCBank();
		
		HB.HomeLoan(); 
		HB.EducationLoan();
		HB.CreditCard();
		HB.DebitCard();
		HB.TeansferMoney();
		HB.carLoan();
		HB.MutulalFund();
		HB.BikeLoan();
		HB.GoldLoan();
		HB.PersonalLoan();
		
		RBIBank RB =new HSBCBank();
		
		RB.CreditCard();
		RB.DebitCard();
		RB.TeansferMoney();
	//	RB.HomeLoan();
		
		USBank UB =new HSBCBank();
		
		UB.BikeLoan();
		UB.PersonalLoan();
		
		BrazilBank BB =new HSBCBank();
		//BB.GoldLoan();
		BB.MutulalFund();
		BB.carLoan();
		//BB.BikeLoan();
	}

	

	
}
