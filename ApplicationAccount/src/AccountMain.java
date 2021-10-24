import java.util.Scanner;

public class AccountMain
{
	private static final Account[] AccountMain = null;
	public static void main(String[] args)
		{
			Account acc[] = AccountMain ;
			AccountManeger am= new AccountManeger();
			int flag=0;
			int ch1;
				do
				{
					System.out.print("\n Create Account      : 1"
									  +"\n Display Account     : 2"
									  +"\n Search Account      : 3"
									  +"\n Update Account      : 4"
									  +"\n Transation Amount   : 5 \n ");
					System.out.println("Enter your choice   : ");
					Scanner sc =new Scanner(System.in);
					int ch=sc.nextInt();
					if(ch==1)
						{
						acc = am.create();
						flag++;
						}					
					else if (ch==2)
						{
							if(flag==1)
							am.display(acc);
							else
								System.out.println(" Firstly Create a Account :");
						}
					else  if(ch==3)
						{			
						System.out.println("Enter Account Number To Search Account   :");
						am.searchData(acc,sc.nextInt());
						}
					else if(ch==4)
						{
						System.out.println("Enter Account Number And Account Balance :");
						int accno=sc.nextInt();
						double accbal=sc.nextDouble();
						am.Update(acc, accno, accbal);
						}
					else if(ch==5)
						{
						System.out.println("Enter Account Number   :");
						int accno=sc.nextInt();
						am.transaction(acc, accno);
						}
					  
		System.out.println("do yu want to continue : press 1");
		ch1=sc.nextInt();
		
		}while(ch1==1);
	}
}

