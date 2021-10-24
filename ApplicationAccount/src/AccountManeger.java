import java.util.Scanner;
public class AccountManeger 
{
	Scanner sc=new Scanner(System.in);
	
	public Account[] create()
	{
		System.out.println("Enter haw many Accounts element  want");
		int n=sc.nextInt();
		Account acc[]=new Account[n];
		for (int i = 0; i < acc.length; i++)
		{
			System.out.println("Enter Account number   : "
					         + "Enter Account Name     :"
					         + "Enter Account Balance  :");
			Account acc1=new Account(sc.nextInt(),sc.next(),sc.nextDouble());
			acc[i]=acc1;
		}
		return acc;
		
	}
	public void display(Account acc[])
			{
			for (int i = 0; i < acc.length; i++) 
				{
				System.out.println("Account Number     :"+acc[i].getAccNo());
				System.out.println("Account Name       :"+acc[i].getCustname());
				System.out.println("Account Balance    :"+acc[i].getAccbal());
				}
			
			}
		public int searchData(Account acc[],int accno)
		{
			boolean b=false;
			int i=-1;
			for ( i = 0; i < acc.length; i++) 
			{
				if(acc[i].getAccNo()==accno)
				{
					b=true;
					System.out.println(" Account is found Sucessfull"+accno);
					
					break;
				}
			}
		return i;
		}

		public void Update(Account acc[],int accno,double accbal)
		{
			int i=searchData(acc, accno);
		if (i>=0)
		{
			acc[i].setAccbal(accbal);
			System.out.println("Your Balance Update Sucessfull   :");
		}
		else
		{
			System.out.println("Your Account is Invalid !   :");
		}
		}
		
		public void transaction(Account acc[],int accno)
		{
		Transation t=new Transation();
		int i=searchData(acc, accno);
		if(i>=0)
		{
			System.out.println("Withdrow Balance  : Press 1 \n"
				              +"Deposit Balance   : Press 2");
			System.out.println("Enter your choice to Withdrow or Deposit balance:");
			int ch= sc.nextInt();
		if(ch==1)
		{
			System.out.println("Enter amount to withdrow to balance :");
			t.withdrwal(acc[i],sc.nextInt());
		}
		if(ch==2)
		{
			System.out.println("Enter amount to Deposit to balance:");
			t.deposit(acc[i],sc.nextInt());
		}
		}
		}
}
