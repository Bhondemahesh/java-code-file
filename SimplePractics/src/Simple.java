import java.util.Scanner;

public class Simple 
{

	public static void main(String[] args)
	{
		// to welcome program
		int num1,num2,sum1,sub,mul,div;
		int chioce;
		int r=0;// for reverse number
		int n1=0,n2=1,n3,i;
		int flag=0,m;
		int temp,sum=0;
		int r1;
		double pi=3.14,area,pai;
		int length;
		String rutuja,reverse="";
		Scanner in = new Scanner(System.in);
		int n,r2=1,num;
		
		Scanner sc = new Scanner(System.in);  // input stream
		System.out.println("welcome bhonde mahesh  ");
		System.out.println("addtion of two number ----------: 1 ");
		System.out.println("subtration of two nnumber ------: 2 ");
		System.out.println("multiplication  of two nnumber -: 3");
		System.out.println("division  of two nnumber -------: 4 ");
		System.out.println("reverse of number --------------: 5 ");
		System.out.println("even or odd number -------------: 6 ");
		System.out.println("fibonaccisseries number --------: 7 ");
		System.out.println("findout greter than number -----: 8 ");
		System.out.println("findout less than number -------: 9 ");
		System.out.println("prime number -------------------: 10 ");
		System.out.println("paliandrome number -------------: 11 ");
		System.out.println("find out  area of circle -------: 12 ");
		System.out.println("find out armstrong number ------: 13 ");
		System.out.println("reverse string number ----------: 14 ");
		System.out.println("to check magic number ----------: 15 ");
				
		int sumofdigits=0,rev1=0;
		for (i=0;i<20;i++)
		{
		System.out.println("\n enter your choice number       : ");
	       chioce= sc.nextInt();
	      
	       switch (chioce) 
				{
			case 1:
				 	System.out.println("++++addtion of two number ++++++++");
					System.out.println("    enter first  number           :");
					num1= sc.nextInt();
					System.out.println("    enter second number           :");
					num2 = sc.nextInt();
					sum1=num1+num2;
					System.out.println("    there is sum of two number is :"+sum1);
					break;
			case 2:
					System.out.println("\n--subtration of two number------");
					System.out.println("\n  enter first  number           :");
					num1= sc.nextInt();
					System.out.println("\n  enter second number           :");
					num2 = sc.nextInt();
					sub=num1-num2;
					System.out.println("\n  there is subtraction ot two number :"+sub);
					break;
			case 3:
					System.out.println("\n  multiplication of two number  :");
					System.out.println("\n  enter first  number           :");
					num1= sc.nextInt();
					System.out.println("\n  enter second number           :");
					num2 = sc.nextInt();
					mul=num1*num2;
					System.out.println("\n  there is subtraction ot two number :"+mul);
					break;
			case 4:
					System.out.println("\n  division of two number        :");
					System.out.println("\n  enter first  number           :");
					num1= sc.nextInt();
					System.out.println("\n enter second number            :");
					num2 = sc.nextInt();
					div=num1/num2;
					System.out.println("\n there is division of two number:"+div);
					break;
			case 5:
					System.out.println("\n to reverse number              :");
					System.out.println("\n enter number                   :");
					num1= sc.nextInt();
						while (num1!=0)
						{
							r=r*10;
							r=r+num1%10;
							num1=num1/10;		
						}
						System.out.println("\n reverse number             :"+r);
					break;
			case 6:
					System.out.println("\n enter the number to check even or odd:");
					num1=sc.nextInt();
						if (num1%2==0)
						{
							System.out.println("\n given number is even   :"+num1);	
						}
						else
						{
							System.out.println("\n given number is odd    :"+num1);	
			 			}
					break;	
	
			case 7:
					System.out.println("\n enter number to fibo series    :");
					num1=sc.nextInt();
						for ( i = 2; i < num1; ++i)
						{
							n3=n1+n2;
							System.out.println(" \t\t\t\t"+n3);
							n1=n2;
							n2=n3;
						}
					break;
			case 8:
				System.out.println("\n to check greterthan number        :");
					System.out.println("\n enter first  number           :");
					num1= sc.nextInt();
					System.out.println(" \n enter second number          :");
					num2 = sc.nextInt();
						if (num1>num2)
						{
							System.out.println("\n number 1 greterthan number 2 :"+num1);	
						}
						else
						{
							System.out.println("\n number 2 is greterthan number 1 :"+num2);	
						}
			 		break;
			case 9:
				System.out.println("\n to check lessthan number          :");
					System.out.println("\n enter first  number           :");
					num1= sc.nextInt();
					System.out.println(" \n enter second number          :");
					num2 = sc.nextInt();
						if (num1<num2)
						{
							System.out.println("\n number 1 lessthan number 2:"+num1);	
						}
						else
						{
							System.out.println("\n number 2 is lessthan number 1:"+num2);	
						}
					break;
			case 10:
					System.out.println("\n enter  number to check prime or not :");
					num1=sc.nextInt();
					m=num1/2;
						for(i=2;i<=m;i++)
						{
								if(num1%i==0)
								{
									System.out.println("\n number is  not prime   :"+num1);
									flag=1;
									break;
								}
						}
						if(flag==0)
						{
							System.out.println("\n number is prime"+num1);
						}
					break;
			case 11:
					System.out.println("\n enter the number to che pailendrome or not");
					num1 = sc.nextInt();
					temp=num1;
						while(num1>0)
						{
							System.out.println("\t\t\t"+num1);
							r=num1%10;
							sum=(sum*10)+r;
							num1=num1/10;
							System.out.println("\t\t\t "+r);
						}
						if (temp==sum)
						{
							System.out.printf("\n pailendrome number     :"+temp);
						}
						else
						{
							System.out.printf("\n not pailendrome number    :"+temp);
						}
					break;
			case 12:
					System.out.printf("\n enter the redius of circle:");
					r1=sc.nextInt();	
					area=pi*r1*r1;
					pai=2*pi*r1;
					System.out.printf("\n area of circle            :"+area);
					System.out.printf("\n perimeter of circle       :"+pai);
					break;
			case 13:
				System.out.printf("\n enter the number for chheck to armstrong or not ");
				num1= sc.nextInt();
				temp=num1;
					while(num1!=0)//153>0
						{
						r = num1 % 10 ;		//r=153/10
						sum = sum + (r*r*r) ;
						num1 = num1 / 10 ;
						}
						if (temp==sum)
							{
							System.out.printf(" armstrong number    : "+temp);
							}
						else
						{
							System.out.printf(" not armstrong number : "+temp);	
						}
				break;
		
			case 14:
					System.out.println("\n enter a string to a reverse");
					rutuja = in.nextLine();
					length=rutuja.length();
						for (i = length - 1 ; i>=0;i--)
						{
							reverse=reverse+rutuja.charAt(i);
				
						}
					System.out.println(" reverse of string              :"+reverse);
				break;
			case 15:
				System.out.println("\n to check magic number          :");
				System.out.println("enter a number                  :");
				n= sc.nextInt();
				num=n;
					while (num>9)
					{
						while (num>0)
						{
							r2 = num % 10 ;
							sum = sum + r2 ;
							num = num / 10 ;
						}
						num = sum ;
						sum = 0;
					}
					if (num==1) 
					{
						System.out.println("\n magic number                   :"+n);	
					}
					else
					{
						System.out.println("not magic number                 :"+n);
					}
				break;
			default:
				System.out.println("\n ++++++++++invalid choice+++++++++++++");
				break;
			}
		}
		sc.close();
		}

}
