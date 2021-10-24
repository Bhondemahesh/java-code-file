import java.util.Scanner;

public class MsbBill
	{
	public static void main(String[] args) 
		{
		int	id;
		String name;
		float unit;
		float total = 0,total1 = 0,total2=0,total3=0,total4=0,total5;
		Scanner sc= new Scanner(System.in);
		System.out.println("\n enter consumer meter number :");
		id=sc.nextInt();
		System.out.println("\n enter consumer meter unit   :");
		unit=sc.nextFloat();
		if (unit>0)
		{
			total=(float) (unit*3.05);
		}
		if (unit>0)
		{
		total1=(float) (unit*1.28);	
		}
		if(unit>0)
		{
			total2=(float) (unit*0.49);
		}
		if(unit>0)
		{
			total3=90;
		}
		if (unit>0)
		{
		total4=(float) (unit*1.01948275862069);	
		}
		total5=total+total1+total2+total3+total4;
		System.out.println("total Energy Charges          :"+total);
		System.out.println("Total Wheeling Charges Amount :"+total1);
		System.out.println("Total Fuel Charges Amount     :"+total2);
		System.out.println("Result Fixed Charges Amount   :"+total3);
		System.out.println("Tax Amount                    :"+total4);
		System.out.println("Total Bill Amount             :"+total5);
		}	
}
