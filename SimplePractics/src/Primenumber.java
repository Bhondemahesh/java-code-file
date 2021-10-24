import java.util.Scanner;

public class Primenumber
{
public static void main() 
{
@SuppressWarnings("unused")
int number ;
Scanner sc =new Scanner(System.in);
System.out.println("\n enter  number to check prime or not :");
number=sc.nextInt();
int m=number/2;
	int flag=0;
	for(int i=2;i<=m;i++)
	{
			if(number%i==0)
			{
				System.out.println("\n number is  not prime   :"+number);
				flag=1;
				break;
			}
	}
	if(flag==0)
	{
		System.out.println("\n number is prime"+number);
	}


}
}
