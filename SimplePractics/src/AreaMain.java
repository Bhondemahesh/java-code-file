import java.util.Scanner;
public class AreaMain {

	public static void main(String[] args) 
	{
		float r ,h,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("\n enter your chice");
		int ch=sc.nextInt();
		System.out.println("\n enter a redius:");
		r= sc.nextFloat();

		System.out.println("\n enter base and height :");
		b= sc.nextFloat();
		h= sc.nextFloat();
		
		Area a=new Area();
		
			a.area(r);
			a.rectangle(h,b);
	
	
		System.out.println("\n do you want to contine to press 1");
		
	}

}
