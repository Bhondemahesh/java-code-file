import java.util.Scanner;
public class Arrayinfo 
{
	int n;
	int arr[]=null;
	Scanner sc = new Scanner(System.in);
		public int create(int arr1)
		{
			System.out.println("\n how ele"
					+ "ment entert in array");
			n=sc.nextInt();
			 arr=new int[n];
			for (int i = 0; i < n; i++)
			{
				arr[i] = sc.nextInt();
			}
			return arr1;
		}
		public int display(int arr1)
		{
		System.out.println("----------------element in array-------------------");	
		for (int i = 0; i < n; i++)
		{
			System.out.println(+arr[i]);
		}
		return arr1;
		}
		public int  Search(int arr1)
		{
			System.out.println("\n Enter element to search in array : ");
			int newelement = sc.nextInt();
			for (int i = 0; i < n; i++)
			{
				if (arr[i]==newelement) 
					System.out.println("Element are found "+newelement+"in array location"+i);
				else 
					System.out.println("\n elenent are not found in array :"+newelement);
				n++;
			}			
			return arr1;
		}
		public int Insert(int arr1)
		
		{
			System.out.println("\n enter new value and locatoin");
			int newvalve=sc.nextInt();
			int loc=sc.nextInt();
			for (int i=n-1;i >= loc-1;i--)
			{
				arr[i+1]=arr[i];
			}
			arr[loc-1]=newvalve;
			n++;	
			System.out.println("\n valve added suceesfully");
			return arr1;
		}
}
