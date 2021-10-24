import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) throws ParseException
	{
		System.out.println("\n enter how many element");
		Scanner sc = new Scanner(System.in);
		int number= sc.nextInt();
		//SimpleDateFormat formatter = new SimpleDateFormat("dd-mm-yy");
		
		//String dob = null;
		//java.util.Date date= formatter.parse(dob);
		Date[] darr = new Date[number];
		for (int i = 0; i < number; i++)
		{
			System.out.println("\n Enter Employee Number      :"
				           	  +"\n Enter Employee Name        :"
				              +"\n Enter Employee Joinnig date:");
		Date date1= new Date(sc.nextInt(),sc.nextLine());
		darr[i]=date1;
		}
		for(int i = 0;i<number;i++)
		{
			System.out.println("Employee Number :"+darr[i].getEmp_Number());
			System.out.println("Employee Name   :"+darr[i].getEmp_name());
		}
		
		
	
	}
}
