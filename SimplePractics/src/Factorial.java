
import java.util.Scanner;

public class Factorial
{
	public static void main(String[] args) 
	{
		int number;
		Scanner fa = new Scanner(System.in);
		System.out.println("\n enter any number two check 			factorial :");
		number=fa.nextInt();

		int ans=1;
		for (int i = 2; i <=number; i++) 
		{
			ans=ans*i;
		}
		System.out.println("\n factorial number"+ans);
	}
}
