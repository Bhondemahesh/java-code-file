import java.util.Scanner;

public class EvenNumber 
{
	public static void main(String[] args)
	{
			Scanner sc=new Scanner(System.in);
			int number ;
			System.out.println("to check even or odd to lessthan equal to number :");
			number=sc.nextInt();
			for (int i= 0; i <= number; i++) 
			{

				if (i%2==0)
				{
					System.out.println("\n given number is even   :"+i);	
				}	
			}
	}

}