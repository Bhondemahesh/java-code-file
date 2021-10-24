import java.util.Scanner;

public class ArmstrongNmber 
{

	public static void main(String[] args) 
	{
	int number ;
	int	sum	=0 ;
	Scanner aa = new Scanner(System.in);
	System.out.println("\n enter any number to find armstrong or not");
	number =aa.nextInt();
	int temp=number;
		while(number!=0)//153>0
			{
		int 	r = number % 10 ;		//r=153/10
				sum= sum + (r*r*r) ;
				number = number / 10 ;
			}
				if (temp==sum)
				System.out.printf(" armstrong number    : "+temp);
				else
				System.out.printf(" not armstrong number :"+temp);	
	}

}
