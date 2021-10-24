import java.util.Scanner;

public class Emloyee
{
	public static void main(String[] args)
	{
	int empId ;
	float pf,hra,ta;
	String empname;
	Double empsalary;
	Scanner sc =new Scanner(System.in);
	System.out.println("\n enter employee id     :" );
	empId=sc.nextInt();
	System.out.println("\n enter employee name   :");
	empname = sc.next();
	System.out.println("\n enter employee salary :");
	empsalary = sc.nextDouble();
	if(empsalary<10000)
		{
			pf=(float) (empsalary*0.05);
			hra=(float) (empsalary*0.04);
			ta = (float) (empsalary*0.03);
			}
			else if (empsalary<10000 && empsalary<2000)
				{
				pf=(float) (empsalary*0.06);
				hra=(float) (empsalary*0.05);
				ta = (float) (empsalary*0.04);
				}
			else
				{
				pf=(float) (empsalary*0.07);
				hra=(float) (empsalary*0.06);
				ta = (float) (empsalary*0.05);	
				}
	System.out.println("\n employee id--------------------:"+empId);
	System.out.println("\n employee name------------------:"+empname);
	System.out.println("\n employee salary----------------:"+empsalary);
	System.out.println("\n Provident fund-----------------:"+pf);
	System.out.println("\n employee house rent allowance--:"+hra);
	System.out.println("\n travelling allowance-----------:"+ta);
	}
}
