import java.util.Scanner;
public class Array 
{
	int [][] arr1= new int[20][20];
	int [][] arr2= new int[20][20];
	int [][] arr3= new int[20][20];
	int r1,c1,r2,c2,ch;
	Scanner sc =new Scanner(System.in);
	public void create()
	{

		System.out.println("How many Array create : ");
		 ch = sc.nextInt();
		 if (ch==1)
		 {
			 System.out.println("\n Enter row and column in first matrix :\n");
				r1=sc.nextInt();
				c1=sc.nextInt();
			 System.out.println("\n Enter a element in matrix : 1\n");
				for (int i = 0; i < r1; i++) 
					{
						for (int j = 0; j < c1; j++) 
						{
						arr1[i][j]=sc.nextInt();	
						}
					}
		 }
		else if (ch==2)
		{
			System.out.println("Enter row and column in first matrix :");
			r1=sc.nextInt();
			c1=sc.nextInt();
			System.out.println("Enter row and column in second matrix :");
			r2=sc.nextInt();
			c2=sc.nextInt();
			System.out.println("Enter a element in Array1 : ");
			for (int i = 0; i < r1; i++) 
				{
					for (int j = 0; j < c1; j++) 
					{
					arr1[i][j]=sc.nextInt();	
					}
				}
			
			 System.out.println(" Enter a element in Array2 : ");
			for (int i = 0; i < r2; i++) 
				{
					for (int j = 0; j < c2; j++) 
					{
					arr2[i][j]=sc.nextInt();	
					}
				}
			}
	}
	public void display()
	{
		if(ch==1)
		{
		System.out.println("---------------------------------------");
			for (int i = 0; i < r1; i++) 
			{
				for (int j = 0; j < c1; j++) 
				{
				System.out.println(+arr1[i][j]);	
				}
			}
		}
		else if(ch==2)
		{
			System.out.println("---------------------------------------");
			for (int i = 0; i < r1; i++) 
			{
				for (int j = 0; j < c1; j++) 
				{
				System.out.println(+arr1[i][j]);	
				}
			}
			System.out.println("---------------------------------------");
			for (int i = 0; i < r2; i++) 
			{
				for (int j = 0; j < c2; j++) 
				{
				System.out.println(+arr2[i][j]);	
				}
			}
			System.out.println("---------------------------------------");
		}
	}
	public void  addtion()
	{
		if (r1==r2)
		{
			for (int i = 0; i < r1; i++)
			{
				for (int j = 0; j < c1; j++) 
				{
					arr3[i][j]=arr1[i][j]+arr2[i][j];
				}			
			}
			System.out.println("-----------Addtion of array-----------");
			for (int i = 0; i < r1; i++) 
			{
				for (int j = 0; j < c1; j++) 
				{
				System.out.println(+arr3[i][j]);	
				}
			}
			System.out.println("---------------------------------------");
		}
		else
		{
			System.out.println("----------Addtion is not posible ----------");
		}
	}
	public void  multiplication()
	{
		if (r1==r2)
		{
			for (int i = 0; i < r1; i++)
			{
				for (int j = 0; j < c1; j++) 
				{
					arr3[i][j]=arr1[i][j]*arr2[i][j];
				}			
			}
			System.out.println("-------------Multiplication of array-----------");
			for (int i = 0; i < r1; i++) 
			{
				for (int j = 0; j < c1; j++) 
				{
				System.out.println(+arr3[i][j]);	
				}
			}
			System.out.println("---------------------------------------");
		}
		else
		{
			System.out.println("\n----------Multiplication not posible -----");
		}
	}

}