import java.util.Scanner;

public class PrePaid
{
	Offer off = new Offer();
	PostPaid postp = new PostPaid();
	public void  create()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("1 : Perpaid Moblie Communication Plans : \n"
						 + "2 : Postpaid tele_Communication Plans  : ");
		System.out.println("----------------------------------------------------------------");
		System.out.println("    Enter Your Communication Plans     : ");
		
		int choice = sc.nextInt();
		if (choice==1)
			off.Preoffer();
		
		else if (choice==2)
			postp.Postoffer();
		else
			System.out.println("Invalied Choice Communication Plans ");
	}
	
}
