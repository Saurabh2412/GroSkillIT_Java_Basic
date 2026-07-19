package weeklyassignmentsix;


class BankAccount{
	final String AccountType="Savings";
	
	int accountNumber;
	String accountHolderName;
	double balance;
	
	BankAccount(int accountNumber, String accountHolderName, double balance){
		
		this.accountNumber= accountNumber;
		this.accountHolderName=accountHolderName;
		this.balance=balance;
	}
	
	void displayAccountDetails()
	{
		System.out.println("Account Details:");
		System.out.println("Account Type: "+AccountType);
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Account Holder: "+accountHolderName);
		System.out.println("Balance: "+balance);
	}
}

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount b1 = new BankAccount(123456789, "Rohan Sharma", 85000);
		b1.displayAccountDetails();
		//b1.AccountType = "Current";
		

	}

}
