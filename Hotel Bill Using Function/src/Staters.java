import java.util.Scanner;

public class Staters
{
	int k =0;
	public int[] staters()
	{
		int[] order = new int[20];
		Scanner sc = new Scanner(System.in);
		String ordername[] = {
				  "Masala Papad         :",
		  		  "Potato chipess       :",
		  		  "chaha                :",
		  		  "Copy                 :",
		  		  "Cold Copy            :",
		  		  "Chikeen lolipop      :",
		  		  "Pasta                :"};
		int orderno[] =  {20,
						  15,
						  10,
						  10,
						  15,
						  100,
						  45};
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~Staters Order~~~~~~~~~~~~~~~~~~~~~~~~");	
		System.out.println("------------------------------------------------------------");
		for (int i = 0; i < ordername.length; i++) 
		{
		System.out.println((i+1)+"\t"+ordername[i]+"\t"+orderno[i]);
		}
		System.out.println("-------------------------------------------------------------");
		System.out.println(" Enter your choice : ");
		int ono = sc.nextInt();
		order[k]=ono;
		k++;
		System.out.println("-------------------------------------------------------------");		
		 return order;
	}
}	
