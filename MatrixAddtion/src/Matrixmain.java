import java.util.Scanner;
public class Matrixmain 
{
	public static void main(String[] args) 
	{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter first Row in matrix: ");
			int n1=sc.nextInt();
			int arr[][] = new int [n1][];
			for (int i = 0; i < n1; i++) 
			{
				System.out.println((i+1)+"Enter number of column ");
				arr[i]=new int [sc.nextInt()];
				
			}
	System.out.println(" Enter element in Matrix : ");
	for (int i = 0; i < arr.length; i++) 
	{
		for (int j = 0; j < arr[i].length; j++) {
			arr[i][j]=sc.nextInt();
		}
	}
	System.out.println("                  Display array");
	System.out.println("------------------------------------------------");
	for (int i = 0; i < arr.length; i++)
	{
		for (int j = 0; j < arr[i].length; j++)
		{
			System.out.print(arr[i][j]+"\t");
		}
	System.out.println();
	}
	
	}

}
