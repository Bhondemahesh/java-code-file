public class Studentinfo 
{
	public Student create()
	{
		Address add = new Address("pune", "maharashtra", "413702", "Dighi ,dattanagr");
		StudentPersnal studper = new StudentPersnal("Mahesh Bhonde", "Sampat","Shevanta", "9623897271", "28/02/2000", "413702");
		Student stud = new Student(10,"mahesh","computer engg","b", "9623897271", "581826327109", add, studper);
		Student stud1 ;
		return null ;
	}
	public void display(Student stud) 
	{
		System.out.println("\n-----------Student imformation---------------");
		System.out.println("roll number       : "+stud.getRoll_no());
		System.out.println("Student Name      : "+stud.getStud_name());
		System.out.println("Student Class     : "+stud.getStud_class());
		System.out.println("Student Div       : "+stud.getStud_div());
		System.out.println("Moblile number    : "+stud.getStud_mobile());
		System.out.println("Adhar number      : "+stud.getStud_Adhar());
		System.out.println("----------------Student address-----------------");
		System.out.println("city              : " +stud.addr.getCity());
		System.out.println("State             : "+stud.addr.getState());
		System.out.println("Pincode           : "+stud.addr.getPincode());
		System.out.println("permarnet addresss: "+stud.addr.getAdd_permnat());
		System.out.println("-----------Student Family imformation----------");
		System.out.println("Full name         : "+stud.studper.getFull_name());
		System.out.println("father Name       : "+stud.studper.getFather_name());
		System.out.println("mother name       : "+stud.studper.getMother_name());
		System.out.println("mobile name       : "+stud.studper.getMobile_name());
		System.out.println("date of birth     : "+stud.studper.getDob());
		System.out.println("-------------------------------------	---------");


	}
	public void display() {
		// TODO Auto-generated method stub
		
	}
}
