import java.util.Scanner;

public class MagicNumber 
{

	public static void main(String[] args)
	{
			int n,r2=1,num,sum=0;
			Scanner oo = new Scanner(System.in);
			System.out.println("enter a number = ");
			n= oo.nextInt();
			num=n;
				while (num>9)
				{
			while (num>0)
					{
						r2 = num % 10 ;
						sum = sum + r2 ;
						num = num / 10 ;
					}
				num = sum ;
				sum = 0;
				}
				if (num==1) 
					{
					System.out.println("\n magic number : \t "+n);	
					}
				else
				{
					System.out.println("not magic number : \t "+n);
				}
		}

}
