import java.util.Scanner;
public class Offer 
{
	Scanner sc = new Scanner(System.in);
	int bill=0;
	int k=0;
	String mobilenumber;
		public void Preoffer()
		{
			System.out.println("Enter your mobile number");
			mobilenumber=sc.next();
			System.out.println("_____________________________________________________________");
			System.out.println("              Choice your following offers your              ");
			System.out.println("*************************************************************");
			System.out.println("choice-----RS--------GB/Day/SMS--------- -Validity-----------");
			System.out.println("   1:     13          100MB                02 Days");
			System.out.println("   2:     19          200MB                02 Days");
			System.out.println("   3:     48          3GB                  Till your existing pack");
			System.out.println("   4:     78          5GB/Day/SMS/100      30 Days");
			System.out.println("   5:     89          6GB/Day/SMS/100      28 Days");
			System.out.println("   6:     98         12GB/Day/SMS/100      Till your existing pack");
			System.out.println("   7:    251          50GB                 Till your existing pack");
			System.out.println("   8:    248          25GB                 Till your existing pack");
			System.out.println("   9:    349          2GB/Day/SMS/100      84 Days");
			System.out.println("  10:    379          3GB/Day/SMS/100      28 Days");
			System.out.println("  11:    389        3.5GB/Day/SMS/100      28 Days");
			System.out.println("  12:    449          2GB/Day/SMS/100      56 Days");
			System.out.println("  13:    698          2GB/Day/SMS/100      84 Days");
			System.out.println("  14:    699          2GB/Day/SMS/100      56 Days");
			System.out.println("  15:   2798          2GB/Day/SMS/100      365 Days");
			System.out.println("----------------------------------------------------------------");
			int choice = sc.nextInt();
			switch (choice)
			{
			case 1:
				k++;
				bill=13;
				System.out.println("Your selected plan is RS :"+bill+" Offers is 100MB  02 Days");
				break;
			case 2:
				k++;
				bill=19;
				System.out.println("Your selected plan is RS :"+bill+" Offers is 200MB  02 Days");
				break;
			case 3:
				k++;
			
				bill=48;
				System.out.println("Your selected plan is RS :"+bill+" Offers is 3GB  UNlimited ");
				break;			
			case 4:
				k++;
				bill=78;
				System.out.println("Your selected plan is RS :"+bill+" Offers is 5GB/Day/SMS/100   30 Days");
				break;
			case 5:
				k++;
				bill=89;
				System.out.println("Your selected plan is RS :"+bill+" Offers is 6GB/Day/SMS/100    28 Days");
				break;
			case 6:
				k++;
				bill=98;
				System.out.println("Your selected plan is RS :"+bill+" Offers is 12GB/Day/SMS/100      Till your existing pack");
				break;
			case 7:
				k++;
				bill=251;
				System.out.println("Your selected plan is RS :"+bill+" Offers is 50GB   Till your existing pack");
				break;
			case 8:
				k++;
				bill=248;
				System.out.println("Your selected plan is RS :"+bill+" Offers is 25GB Till your existing pack");
				break;
			case 9:
				k++;
				bill=349;
				System.out.println("Your selected plan is RS :"+bill+" Offers is 2GB/Day/SMS/100 84 Days");
				break;
			case 10:
				k++;
				bill=379;
				System.out.println("Your selected plan is RS :"+bill+" Offers is 3GB/Day/SMS/100 28 Days");
				break;
			case 11:
				k++;
				bill=389;
				System.out.println("Your selected plan is RS :"+bill+" Offers is 3.5GB/Day/SMS/100 28 Days");
				break;
			case 12:
				k++;
				bill=449;
				System.out.println("Your selected plan is RS :"+bill+" Offers is 2GB/Day/SMS/100 56 Days");
				break;
			case 13:
				k++;
				bill=689;
				System.out.println("Your selected plan is RS :"+bill+" Offers is 2GB/Day/SMS/100 84 Days");
				break;
			case 14:
				k++;
				bill=699;
				System.out.println("Your selected plan is RS :"+bill+" Offers is 2GB/Day/SMS/100 56 Days");
				break;
			case 15:
				k++;
				bill=2798;
				System.out.println("Your selected plan is RS :"+bill+" Offers is 2GB/Day/SMS/100 365 Days");
				break;
			default:
				System.out.println("-------------Invalied offers selected------------------");
				k=0;
				break;
			}
			if (k==1)
			{
			System.out.println("Your recharge is suceesfull \n"
							 + "Mobile number is :"+mobilenumber);	
			}	
		}
		
}
