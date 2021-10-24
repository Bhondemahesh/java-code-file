
import java.util.Scanner;

public class Areamain
{
public static void main (string[] args)
{
int ch =0;
Scanner sc= new Scanner(System.in);
area a=new Area();
do {
	System.out.println("1-cicrle Area \n - triangle area");
	System.out.println("enter your choice---");
	ch=sc.nextInt();
	switch (ch) {
	case 1:
		System.out.println("enter radius for circle");
		a.circleArea(sc.nextFloat());
		break;
		
	case 2:
		System.out.println("enter base and hight");
         a.trianglearea(sc.nextFloat(),sc.nextFloat());
         break;
	default:
		System.out.println("invalid ...........");
	
	}
	System.out.println("do you want to continue press");
	ch=sc.nextInt();
	
} while (ch==1);

System.out.println("===============================thank you===============================");
}
	
}
