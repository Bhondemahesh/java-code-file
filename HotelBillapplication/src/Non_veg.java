import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;
public class Non_veg 
{
	Bill bill = new Bill();
	Scanner sc = new Scanner(System.in);
	int k=0;
	int total=0;
	int order[] = new int[10];
	String non_vegname[] = {"chickan Half handi","chicken full handi  ","chiken Thali  "};
	int non_price[] = {120,250,200};
	public void non_veg()
	{
		System.out.println("~~~~~~~~~~~~~~~~~~Non_Veg Order~~~~~~~~~~~~~~~~~~");	
		do 
		{
			System.out.println("------------------------------------------------------------");
			for (int i = 0; i < non_vegname.length; i++) 
			{
				System.out.println((i+1)+"\t"+non_vegname[i]+"\t"+non_price[i]);
			}
	System.out.println("-------------------------------------------------------------");
	System.out.println(" Enter your choice : ");
	int choice = sc.nextInt();
	System.out.println("-------------------------------------------------------------");		
	order[k]  = choice;
	for (int i = 0; i < k; i++)
		{
			System.out.println(order[i]);
			total=total+non_price[order[i]-1];		
		}
	System.out.println("do you want to Any order Veg :  press 1");
	}while(sc.nextInt()==1);

			
			
	}
}
