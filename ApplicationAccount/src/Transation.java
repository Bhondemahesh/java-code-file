public class Transation
{
	public void withdrwal(Account acc,int amt)
	{
	acc.setAccbal(acc.getAccbal()-amt);
	System.out.println(" Sussesfull withdrow balance"+amt);
	
	}
	
	public void deposit(Account acc,int amt)
	{
		acc.setAccbal(acc.getAccbal()+amt);
		System.out.println(" Sussesfull  balance"+amt);
		
	}

}
