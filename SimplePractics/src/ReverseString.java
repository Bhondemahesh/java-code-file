import java.util.Scanner;

public class ReverseString
{
	public static void main(String args[])
		{
		int length,i;
	String rutuja,reverse="";
	Scanner in = new Scanner(System.in);
	System.out.println("\n enter a string to a reverse");
	rutuja = in.nextLine();
	length=rutuja.length();
	for (i = length - 1 ; i>=0;i--)
	{
		reverse=reverse+rutuja.charAt(i);
		
	}
	System.out.println("reverse of string : "+reverse);
		}
}
