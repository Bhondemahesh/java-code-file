import java.util.Scanner;

public class Mobliecomunication
{
		public static void main(String[] args)
	{
		PrePaid pre = new PrePaid();
		Postpaid post = new Postpaid();
		Scanner sc = new Scanner(System.in);
		System.out.println("1 : prepaid comunication");
		System.out.println("2 : postpaid comunication");
		int ch = sc.nextInt();
		if (ch==1)
			pre.prepaid();
		else if (ch==2)
			post.postpaid();
		else 
			System.out.println("invalied choice");
	}

}
