import java.util.Scanner;

public class AreaMain {

	public static void main(String[] args) 
	{
		float r ,h,b;
		Scanner sc = new Scanner(System.in);
		
		Area a=new Area();
		System.out.println("***************************************************");
		System.out.println("\n how many number to calculate  area of rectangle:");
		int number= sc.nextInt();

		for (int i = 0; i < number; i++)
		{//a.area(r);
			System.out.println("\n enter base and height :");
			b= sc.nextFloat();
			h= sc.nextFloat();
		a.rectangle(h,b);
		}
		System.out.println("*********************thank you*********************");
			
	}

}
