import java.util.Scanner;

public class Mobilebill 
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("1 : Perpaid \n"
						 + "2 : postpaid \n");
	System.out.println("\n enter your choice");
	int choice = sc.nextInt();
	if(choice==1)
	{
		System.out.println("	Prepaid moblie bill offers:");
		System.out.println(" 	100 Rs > 2GB /per day 28 \n"
						 + " 	200 Rs > 1GB /per day 48 \n");
		
	}
	else if (choice==2)
	{
		
	}
	}

}
