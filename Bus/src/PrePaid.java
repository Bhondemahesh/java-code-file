import java.util.Scanner;

public class PrePaid
{
public void prepaid() 
{
	offer off = new offer();
	Scanner sc = new  Scanner(System.in);
	System.out.println(" 1 :  jio "
					 + " 2 :  Vi "
					 + " 3 :  Airtel");
		System.out.println("---------------------------------------------");
	int ch = sc.nextInt();
	if (ch==1)
		off.Jio();
	else if (ch==2)
		off.Vi();
	else if (ch==3)
		off.Airtel();
	else 
		System.out.println("---------------Invalied choice---------------");
	
}
}
