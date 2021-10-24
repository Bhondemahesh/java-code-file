import java.util.Scanner;
public class Array	
{
	Scanner sc = new Scanner(System.in);
	int array[] = new int[20];
	public void create(int number)
	{
		System.out.println("\n--------------------------------------");
		for (int i = 0; i < number; i++)
		{
		 array[i]= sc.nextInt();	
		}	
	}
	public void display(int number)
	{
		for (int i = 0; i < number; i++)
		{
		System.out.print("\t"+array[i]);	
		}
		System.out.println("\n------------------------------------------");
	}
	public void search(int number)
	{
		int count=0;
		System.out.println("Enter any number search");
		int num = sc.nextInt();
			for (int i = 0; i < number; i++) 
			{	
				if(array[i]==num)
				count=1;
			}
			if(count==0)
				System.out.println("Number are not_found in array :"+number);
			else
				System.out.println("Number are found in array     :"+number);
	}
	public void insert(int number)
	{
		System.out.println("Enter New value and location  :");
		int value = sc.nextInt();
		int loc = sc.nextInt();
			for (int i = number-1; i >=loc-1; i--)
			{
				array[i+1] = array[i];
			}
			array[loc-1]=value;
			number++;
		System.out.println("new value insered  :"+loc+" in array  :"+value);
	}
	public void delete(int number)
	{
		System.out.println("Enter location to Deleted in array:");
		int loc = sc.nextInt();
		int newval=array[loc-1];
		for(int i=loc-1;i<number;i++)
		{
			array[i]=array[i+1];
		}
		System.out.println("Value are deleted in array"+loc);
		number--;
	}
	public void total(int number)
	{
		int result=0;
	for (int i = 0; i < number; i++)
	{
	result = result+array[i];	
	}	
	System.out.println("Sum of array element is :"+result);
	}
	public void Avreage(int number) 
	{
		int result=0;
		float avg=0;
		for (int i = 0; i < number; i++)
		{
		result = result+array[i];	
		}	
		avg=result/number; 
		System.out.println("Sum of array element is  :"+result);
		System.out.println("Average of array element :"+avg);
	}
	public void greterthan(int number)
	{
		for (int i = 0; i < number; i++)
		{
			if(array[i] > array[i+1] && array[i] >array[i-1])
			 System.out.println(+array[i]+"\t");
		}
	}
	public void lessthan(int number)
	{
		for (int i 	= 1; i < number ; i++)
		{
			if(array[i]<array[i-1] && array[i]<array[i+1])
				System.out.println(+array[i]+"\t");
		}
	}
	public void evenorodd(int number)
	{
		int count=0;
		for (int i = 0; i < number; i++)
		{
			if (array[i]%2==0)
			{	
				count++;
				System.out.print(+array[i]+"\t");
			}
		}
		System.out.println("\ntotal number of even number of array : "+count);
		System.out.println("----------------------------------------------");
		count=0;
		for (int i = 0; i < number; i++)
		{
			if (array[i]% 2!= 0)
			{
				count++;
				System.out.print(+array[i]+"\t");
			}
		}
		System.out.println("\ntotal number of odd number of array : "+count);
	}
	public void prime(int number)
	{
		int flag=0;
		for(int i=2;i<number;i++)    
		{    
		if(array[i]%2==0)    
		{    
			System.out.println("Number is not prime");    
			flag=1;    
			break;    
		}    
		}    
		if(flag==0)    
		System.out.println("Number is prime"); 
	 }    	
}

