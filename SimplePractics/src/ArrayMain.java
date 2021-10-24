import java.util.Scanner;
public class ArrayMain 
{
	public static void main(String[] args)
	{
		Array array = new Array();
		int number=0																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																							;
		int k=0;
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("---------------------------------------");
			System.out.print (   "1 Create     : "
					 		 + "\n2 Display    : "
					 		 + "\n3 Search     : "
					 		 + "\n4 Insert     : "
					 		 + "\n5 Delete     : "
					 		 + "\n6 Total      : "
					 		 + "\n7 Avrage     : "
					 		 + "\n8 Greterthan : "
					 		 + "\n9 Lessthan   : "
					 		 + "\n10 Event&Odd : "
					 		 + "\n11 Prime     : ");
			System.out.print("\n---------------------------------------\n");
			int choice = sc.nextInt();
			switch (choice)
			{
			case 1:
				System.out.println("How many number to add in array");
				number = sc.nextInt();
				array.create(number);
				k=1;
				break;
			case 2:
				if(k==1)
				array.display(number);
				else
					System.out.println(" .......Create array are firstly........");
				break;
			case 3:
				if(k==1)
				array.search(number);
				else
					System.out.println("........Create array are firstly........");
				break;
			case 4:
				if(k==1)
				array.insert(number);
				else
					System.out.println("........Create array are firstly........");
				break;
			case 5:
				if(k==1)
				array.delete(number);
				else
					System.out.println("........Create array are firstly........");
				break;
			case 6:
				 if(k==1)
				 array.total(number);
				 else
					 System.out.println(".......Create array are firstly.........");
				break;
			case 7:
				if(k==1)
					array.Avreage(number);
				else
					System.out.println(".......Create array are firstly.........");
				break;
			case  8:
				if(k==1)
				array.greterthan(number);
				else
					System.out.println(".......Create array are firstly.........");
				break;
			case  9:
				 if(k==1)
					 array.lessthan(number);
				 else
					 System.out.println(".......Create array are firstly.........");
				 break;
			case 10:
				if(k==1)
					array.evenorodd(number);
				else
					 System.out.println(".......Create array are firstly.........");
				 break;
			case 11:
				if(k==1)
					array.prime(number);
				else
					System.out.println(".......Create array are firstly.........");
				break;
				
			default:
				System.out.println("-----------invailed choice------------");
			break;
		}
				System.out.println("--------------Thank you---------------");
		} while (1==1);
	}
}
