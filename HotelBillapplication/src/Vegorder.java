import java.util.Scanner;

public class Vegorder 
{
	public void  Vegorder() 
	{
		Bill bill = new Bill();
		Scanner sc = new Scanner(System.in);
		int total1=0;
		int order1[] = new int[10];
		String veg_order[] = {
				  "Cheese Garlic bread(4pcs)        :",
				  "Spicy Sureme Garlic bread(4pcs)  :",
				  "Exotica Garlic bread(4pcs)       :",
				  "French Fries                     :",
				  "Fries peri peri                  :",
				  "Chilli Garlic Potato Pops        :",
				  "Garlic Bread Stix                :",
				  "Chese Stuffed Garlic Bread       :",
				  "Paneer Stuff Garlic Bread        :"};
				int orderprice[] = {99,109,119,69,79,69,89,129,149};	
				int k=0;
				System.out.println("~~~~~~~~~~~~~~~~~~Veg Order~~~~~~~~~~~~~~~~~~");	
				do
				{
					System.out.println("------------------------------------------------------------");
					for (int i = 0; i < veg_order.length; i++) 
					{
						System.out.println((i+1)+"\t"+veg_order[i]+"\t"+orderprice[i]);
					}
			System.out.println("-------------------------------------------------------------");
			System.out.println(" Enter your choice : ");
			int choice1 = sc.nextInt();
			System.out.println("-------------------------------------------------------------");		
			order1[k]  = choice1;
			System.out.println("do you want to Any order Veg :  press 1");
			}while(sc.nextInt()==1);
		
			for (int i = 0; i < k; i++)
				{
					System.out.println(order1[i]);
					total1=total1+orderprice[order1[i]-1];		
				}
		}
	}

