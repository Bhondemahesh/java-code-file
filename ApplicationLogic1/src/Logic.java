import javax.swing.Spring;

public class Logic 
{
	int i;
	int sum;
	int r;
	int ans;
	public void  factor(int n)
	{
		
		for (int i = 2; i <= n/2; i++) 
		{
			if (n%i==0)
				System.out.println(i);	
		}
	}
	public int factorial(int n)
	{
		int ans=1;
		for (int i = 2; i <=n; i++) 
		{
			ans=ans*i;
		}
		return ans;
	}
	public int  addtion(int n,int n1)
	{
		int ans=n+n1;
		return ans;
	}
	public float area(float n)
	{
	float ans=(float) (3.14*n*n);
		return ans;
	}
	public float rectangle(float n2,float n3)
	{
		float ans=(float) (0.5*n2*n3);
		return ans;
	}
	public int reverse(int n)
	{
		int r=0;
		while (n!=0)
		{
		    r=r*10;
			r=r+n%10;
			n=n/10;
			ans=ans+r; 
		}
	return r;	
	}
	public int evenorodd(int n)
	{
		if(n%2==0)
		System.out.println("\n even number"+n);
		else
		System.out.println("\n odd number"+n);	
		return ans;
	}
	public int fibo(int n)
	{ 
		int i,n3=0,n1=1,n2=2;
		for ( i = 2; i < n; ++i)
		{
			n3=n1+n2;
			System.out.println(" \t\t\t\t"+n3);
			n1=n2;
			n2=n3;
		}
	return ans;	
	}
	public int greterthan(int n,int n1)
	{
		if (n>n1) 
			System.out.println("\n greterthan number is:"+n);
		else 
			System.out.println("\n greterthan number is:"+n1);
		return ans;
			
	
	}
	public int lessthan(int n,int n1)
	{
		if (n<n1) 
			System.out.println("\n Lessthan number is:"+n);
		else 
			System.out.println("\n Lessthan number is:"+n1);
		return ans;	
	}
	public int prime(int n)
	{
		int flag=0;
		int m=n/2;
		for(int i=2;i<=m;i++)
		{
				if(n%i==0)
				{
					System.out.println("\n number is  not prime   :"+n);
					flag=1;
					break;
				}
		}
		if(flag==0)
		{
			System.out.println("\n number is prime"+n);
		}
	
	return ans;	
	}
	public int arm(int n)
	{
		int temp=n;
		while(n!=0)//153>0
			{
			r = n % 10 ;		//r=153/10
			 sum = sum + (r*r*r) ;
			n = n / 10 ;
			}
			if (temp==sum)
				System.out.printf(" armstrong number    : "+temp);
			else
				System.out.printf(" not armstrong number : "+temp);	
	return ans;
	}
	public String reString(String[] rutuja)
	{
		String reverse = null;
	String ans1 = null ;
	Object length = rutuja.length;
	for (Object i1 = rutuja.length - 1 ; i>=0;i--)
	{
		reverse=reverse+rutuja.length;

	}
    System.out.println(" reverse of string              :"+reverse);	
	return ans1;	
	}
	public int magic(int n)
	{
		 int num=n;
		while (num>9)
		{
			while (num>0)
			{
				r = num % 10 ;
				sum = sum + r ;
				num = num / 10 ;
			}
			num = sum ;
			sum = 0;
		}
		if (num==1) 
			System.out.println("\n magic number  :"+n);	
		else
			System.out.println("not magic number :"+n);	
		return ans;	
	}
	public int pailendrome(int n)
	{
		int temp=n;
		while(n>0)
		{
			System.out.println("\t"+n);
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
			System.out.println("\t\t\t "+r);
		}
		if (temp==sum)
			System.out.printf("\n pailendrome number     :"+temp);
		else
			System.out.printf("\n not pailendrome number    :"+temp);	
	return ans;	
	}
	}
