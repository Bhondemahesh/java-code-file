import java.util.Scanner;
public class ArrayMain 
{
	public static void main(String[] args) 
	{
		int ch1;
		int k=0;
		Array arr = new Array();
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("--------------------------------------------");
			System.out.println("1 Create  Array         : "
					 		 + "\n2 Display Array         : "
					 		 + "\n3 Addtion Array         : "
					 		 + "\n4 Multiplication Array  :");
			System.out.println("--------------------------------------------");
				int choice = sc.nextInt();				
				switch (choice)
				{
				case 1:
					arr.create();
					k++;
					break;
				case 2:
					if(k==1)
					arr.display();
					else
						System.out.println("___________create array firstly_______________");
					break;
				case 3:
					if(k==1)
					arr.addtion();
					else
						System.out.println("___________create array firstly_______________");
					break;
				case 4:
					if(k==1)
					arr.multiplication();
					else
						System.out.println("___________create array firstly_______________");
					break;
				default:
					break;
				}
				System.out.println("--------------------------------------------");
				System.out.println("Do you want to continue : press 1");
				System.out.println("--------------------------------------------");
				ch1 = sc.nextInt();
		} while (ch1==1);			
	}
}
