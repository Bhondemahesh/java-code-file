import java.util.Scanner;

public class HotelMain 
{
	public static void main(String[] args)
	{
		Staters str = new Staters();
		Bill bill = new Bill();
		Scanner sc = new Scanner(System.in);
		System.out.println("----------------------Main Menu---------------------");
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
		System.out.println("-----------------------------------------------------");
		for (int i = 0; i < ordername.length; i++) 
		{
			System.out.println("\t"+ordername[i]+"\t"+orderno[i]);
		}
		System.out.println("-----------------------------------------------------");
		System.out.println(" Enter your choice : ");
		int choice = sc.nextInt();
		System.out.println("-----------------------------------------------------");
		switch (choice) 
		{
		case 1:
			int[] b=str.staters();
			bill.bill(b);
			break;

		default:
			break;
		}
		
	}

}
