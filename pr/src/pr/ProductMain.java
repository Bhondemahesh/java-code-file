package pr;

import java.util.Scanner;

public class ProductMain 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		ProductManager am= new ProductManager();
		Product acc[] = null ;
		int choice1;
		do
		{
		System.out.printf("\n Enter your choice            :"
						 + "\n Create Product Imformation   : 1"
						 + "\n Display Product Imformation  : 2"
						 + "\n Search Product Imformation   : 3");
		int choice = sc.nextInt();
		if (choice==1)
		{
			am.create();	
		}
		else if(choice==2)
		{
			am.display(acc);	
		}
		else if (choice==3)
		{
			am.sarechData(acc, 0); 
		}
		else
		{
		System.out.println("Your choice is invailed:");	
		}
		
	System.out.println("Do you want to continue :press 1");
	    choice1=sc.nextInt();
		}while(choice1==1);
		} 

}
