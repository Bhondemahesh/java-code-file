import java.util.Scanner;
import org.omg.Messaging.SyncScopeHelper;
public class Hotelbill	
{
	public static void main(String[] args)
	{
		Bill bill = new Bill();
		Staters  str = new Staters();
		Vegorder veg = new Vegorder();
		Non_veg  non = new Non_veg();
			System.out.println("----------------------Main Menu---------------------");
		Scanner  sc  = new Scanner(System.in);
		do {
			String ordername[] = {"Staters              :",
								  "Veg                  :",
								  "Non_Veg              :",
								  "Cool Drink           :",
								  "Roti/Risc/and other  :",
								  "Deseart              :"};
			int orderno[] =  {1,
							  2,
							  3,
							  4,
							  5,
							  6};
			System.out.println("------------------------------------------------------------");
			for (int i = 0; i < ordername.length; i++) 
			{
				System.out.println("\t"+ordername[i]+"\t"+orderno[i]);
			}
			System.out.println("-------------------------------------------------------------");
			System.out.println(" Enter your choice : ");
			int choice = sc.nextInt();
				System.out.println("---------------------------------------------------------");
			switch (choice) 
			{
			case 1:
				str.staters();
				break;
			case 2:
				veg.Vegorder();
				break;
			case 3:
				non.non_veg();
				break;
			default:
				System.out.println("~~~~~~~~~~~~~~~~~~~~Invalied choice~~~~~~~~~~~~~~~~~~~~~~");
				break;
			}			
			
		System.out.println("Do you want contiune Main Menu :  press 1");
		} while (sc.nextInt()==1);
	}
} 
