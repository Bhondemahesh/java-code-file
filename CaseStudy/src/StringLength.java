import java.util.Scanner;
public class StringLength 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\n enter a string");
		String rev=sc.next();
		rev.length();
		System.out.println("length:"+rev.length());
		rev.toUpperCase();
		System.out.println("upper case :"+rev.toUpperCase());
		rev.toLowerCase();
		System.out.println("lower case :"+rev.toLowerCase());
	}

}
