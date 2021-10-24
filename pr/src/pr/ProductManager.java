package pr;

import java.util.Scanner;

public class ProductManager
{
		private int prodPrice;
		public Product[] create()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter haw many element are want");
			int n=sc.nextInt();
			Product acc[]=new Product[n];
			for (int i = 0; i < acc.length; i++)
			{
				System.out.println("\n enter product id : product name : product price : product quantity ");
				Product acc1=new Product(sc.nextInt(),sc.next(), sc.nextFloat(),sc.nextInt());
				acc[i]=acc1;
			}
			return acc;	
		}		              
		public int display(Product acc[])
				{
				for (int i = 0; i < acc.length; i++) 
					{
					System.out.println("product no          :"+acc[i].getProdId());
					System.out.println("product name        :"+acc[i].getProdname());
					System.out.println("product price       :"+acc[i].getprodPrice());
					System.out.println("product quantity    :"+acc[i].getProdQty());
					}
				return 0;
					}
		public void sarechData(Product acc[],int pid ){
		for(Product p : acc)
		{
			if(p.getProdId()==pid)
			{
			System.out.println("product Found..........");
			System.out.println(p.getProdId()+"\t"+p.getProdId());
			}
		}
		}
		public void update(Product acc1[] ,int pid,float newprice)
		{
			if(prodPrice<=120)
			{
			
			}
		    }
	}



