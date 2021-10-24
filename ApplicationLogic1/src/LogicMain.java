import java.util.Scanner;
public class LogicMain 
	{
	public static void main(String[] args)
		{
		Scanner sc = new Scanner(System.in);
		Logic l=new Logic();
		int n,n1;
		int ch,ans;
		String a;
		do
		{
		System.out.println(" factor number           : 1");
		System.out.println(" factorial number        : 2");
		System.out.println(" addtion of two number   : 3 ");
		System.out.println(" area of circle          : 4 ");
		System.out.println(" area of ractangle       : 5 ");
		System.out.println(" to reverse number       : 6 ");
		System.out.println(" even or odd number      : 7 ");
		System.out.println(" fibo series             : 8 ");
		System.out.println(" greterthan number       : 9 ");
		System.out.println(" lessthan number         : 10");
		System.out.println(" prime number            : 11 ");
		System.out.println(" armstrong number        : 12 ");
		System.out.println(" reverse string          : 13 ");
		System.out.println(" magic number            : 14 ");
		System.out.println(" enter your choice       : ");
		ch=sc.nextInt();
			if(ch==1)
			{
				System.out.println("\n enter any number to factor");
				n=sc.nextInt();
				l.factor(n);
			}
			else if (ch==2)
			{
				System.out.println("\n enter any number :");
				n=sc.nextInt();
				int fact=l.factorial(n);
				System.out.println("factorial is :"+n+" is :"+fact);
			}
			else if (ch==3)
			{
				System.out.println("\n enter any two number for addtion");
				n=sc.nextInt();
				n1=sc.nextInt();
				int add=l.addtion(n, n1);
				System.out.println("\n addtion of to number"+add);
			}
			else if(ch==4)
			{
				System.out.println("\n enter redius:");
				n=sc.nextInt();
				float rad=l.area(n);
				System.out.println("\n area of circle :"+rad);
			}
			else if(ch==5)
			{
				System.out.println("\n enter base and height:");
				float	n2=sc.nextFloat();
				float	n3=sc.nextFloat();
				float rad=l.rectangle(n2,n3);
				System.out.println("\n area of ractangle:"+rad);
			}
			else if(ch==6)
			{
				System.out.println("\n enter any number to reverse number");
				n=sc.nextInt();
				ans=l.reverse(n);
				System.out.println("\n reverse number"+ans);
			}
			else if(ch==7)
			{
				System.out.println("\n enter any number to check even or odd");
				n=sc.nextInt();
				ans=l.evenorodd(n);
			}
			else if(ch==8)
			{
				System.out.println("\n entre any number to fiboo series: ");
				n=sc.nextInt();
				ans=l.fibo(n);
			}
			else if (ch==9)
			{
			System.out.println("\n enter any to number to greterthan number");
			n=sc.nextInt();
			n1=sc.nextInt();
			ans=l.greterthan(n, n1);
			}
			else if (ch==10)
			{
			System.out.println("\n enter any to number to Lessthan number");
			n=sc.nextInt();
			n1=sc.nextInt();
			ans=l.lessthan(n, n1);
			}
			else if (ch==11)
			{
			System.out.println("\n enter  number to check prime or not :");
			n=sc.nextInt();
			ans=l.prime(n);
			}
			else if (ch==12)
			{
				System.out.printf("\n enter the number for chheck to armstrong or not ");
				n= sc.nextInt();
				ans=l.arm(n);
			}
			else if (ch==13)
			{
				System.out.println("\n  do not workS");
			}
			else if (ch==14)
			{
				System.out.println("\n to check magic number:");
				n= sc.nextInt();
				ans=l.magic(n);
								
			}
			else if (ch==15)
			{
			System.out.println("\n enter number to check pailendrome");	
			n=sc.nextInt();
			ans=l.pailendrome(n);
			}		
			System.out.println("\n do you want contine press  1:\n");
			ch =sc.nextInt();
		 }while(ch==1);
		}
}
