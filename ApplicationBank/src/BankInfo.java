import java.awt.print.Book;

public class BankInfo
{
	public Bank create()
	{
		Bank bank1 = new Bank(0,"mahesh", 101101, "bhondemahesh9999", 123123,10000, "dighi");
		return bank1;
	}
	
	public void display(Bank bank1)
	{

		System.out.println("\n \t\t\t banck account number is: \t\t\t"+bank1.getAccNo());
		System.out.println("\t\t\t bank account holder name is : \t\t\t"+bank1.getAccName());
		System.out.println("\t\t\t bank IFSC code: \t\t\t\t"+bank1.getAccifcCode());
		System.out.println("\t\t\t bank account email address: \t\t\t"+bank1.getAccEmail());
		System.out.println("\t\t\t bank account holder phone number: \t\t"+bank1.getAccPhone());;
		System.out.println("\t\t\t bank balance is: \t\t\t\t"+bank1.getAccBalance());
		System.out.println("\t\t\t bank address id : \t\t\t\t"+bank1.getAccAddress());
	}	
}
