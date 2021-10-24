

import java.util.Scanner;

public class Array
{
	
	public static void main(String[] args) 
	{
		int ch=1;
		Arrayinfo arrin =  new  Arrayinfo();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("\n1 Create   Array  : "
					 		 + "\n2 Display  Array  : "
					 		 + "\n3 Search elelment : "
					 		 + "\n4 insert element  : " );
			System.out.println("\n Enter you choice : ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				 arrin.create(ch);
				break;
			case 2:
				arrin.display(ch);
				break;
			case 3:
				arrin.Search(ch);
				break;
			case 4:
				arrin.Insert(ch);
				
				break;
			default:
				System.out.println("-----------invalied choice------------");
				break;
			}
				System.out.println("------------thank you-----------------");
				System.out.println("\n Do you want to continue : press 1");
		} while (ch==sc.nextInt());
			}

}
