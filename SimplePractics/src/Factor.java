import java.util.Scanner;

public class Factor 
{
	public static void main(String[] args) 
	{
	int n;
	Scanner bb= new Scanner(System.in);
	System.out.println("\n enter any number to check factor of number");
	n=bb.nextInt();
	
	for (int i = 2; i <= n/2; i++) 
	{
		if (n%i==0)
			System.out.println(i);	
	}
}
}
