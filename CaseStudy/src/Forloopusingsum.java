import java.util.Scanner;

public class Forloopusingsum 
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("\n Enter any to number");
	int number = sc.nextInt();
	int number1 = sc.nextInt();
	int ans1=number;
	int ans=0;
	for (int i = 1; i < 13; i++)
	{
	ans=ans1+number1;//1+3
	System.out.println("+ans"
			+ "+i");
	ans1=number1;//3
	number1=ans;//4
	}
	
	}
	

}
