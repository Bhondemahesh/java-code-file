import java.util.Scanner;

public class Staters 
{
	Bill bill =  new Bill();
	int total1=0;
	Scanner sc = new Scanner(System.in);
	int order[] =  new int[10];
	int order1[] =  new int[20];
	String ordername[] = {"Masala Papad         :",
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
		String veg_order[] = {"Cheese Garlic bread(4pcs)        :",
						  "Spicy Sureme Garlic bread(4pcs)  :"
						, "Exotica Garlic bread(4pcs)       :",
						  "French Fries                     :",
						  "Fries peri peri                  :",
						  "Chilli Garlic Potato Pops        :",
						  "Garlic Bread Stix                :",
						  "Chese Stuffed Garlic Bread       :",
						  "Paneer Stuff Garlic Bread        :"};
	int orderprice[] = {99,109,119,69,79,69,89,129,149};
	int k=0;
	public float staters()
	{
		
		do
		{
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~Staters Order~~~~~~~~~~~~~~~~~~~~~~~~");	
			System.out.println("------------------------------------------------------------");
		for (int i = 0; i < ordername.length; i++) 
		{
		System.out.println((i+1)+"\t"+ordername[i]+"\t"+orderno[i]);
		}
		System.out.println("-------------------------------------------------------------");
		System.out.println(" Enter your choice : ");
		int choice = sc.nextInt();
		System.out.println("-------------------------------------------------------------");		
		order[k]  = choice;
		System.out.println("do you want to Any order staters :  press 1");
		}while(sc.nextInt()==1);
		
			float total=0;
			for (int i = 0; i < k; i++)
			{
				System.out.println(order[i]);
				total=total+orderno[order[i]-1];		
			}
			return total;
		}
	}
	
	
	


