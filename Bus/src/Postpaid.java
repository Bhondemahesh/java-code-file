import java.util.Scanner;

public class Postpaid 
	{
		public void postpaid()
		{
			Vodaphone post = new Vodaphone();
			Scanner sc = new Scanner(System.in);
			System.out.println(" 1 :  jio "
					 + " 2 :  Vi "
					 + " 3 :  Airtel");
			System.out.println("---------------------------------------------");
			int ch = sc.nextInt();
			if (ch==1)
				post.jio();
			else if (ch==2)
				post.vi();
			else if (ch==3)
			post.Airtel();
			else 
				System.out.println("------invalied choice-----");
	
			
		}
	}
