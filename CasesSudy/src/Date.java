import java.text.DateFormatSymbols;

import javax.print.attribute.DateTimeSyntax;
import javax.xml.crypto.Data;

public class Date {

	public int getEmp_Number() {
		return Emp_Number;
	}
	public void setEmp_Number(int emp_Number) {
		Emp_Number = emp_Number;
	}
	public char getEmp_name() {
		return Emp_name;
	}
	public void setEmp_name(char emp_name) {
		Emp_name = emp_name;
	}
//	public DateFormatSymbols getEmp_joindate() {
	//	return Emp_joindate;
	//}
	//public void setEmp_joindate(DateFormatSymbols emp_joindate) {
		//Emp_joindate = emp_joindate;
	//}
	public Date(int emp_Number, char emp_name) {
		super();
		Emp_Number = emp_Number;
		Emp_name = emp_name;
		//Emp_joindate = emp_joindate;
	}
	
	public Date(int nextInt, String nextLine) {
		// TODO Auto-generated constructor stub
	}

	private int Emp_Number;
	private char Emp_name;
	//private DateFormatSymbols Emp_joindate;
	
}
