import java.awt.print.Book;

public class StudentInfo 
{

	public Student create() 
	{
	Student stud = new Student(10, 12,"mahesh","drvp",3);
	return stud;
	
	}
public void display(Student stud)
{

	System.out.println("student id:"+stud.getId());
	System.out.println("student roll:"+stud.getRoll());
	System.out.println("student id:"+stud.getName());
	System.out.println("student id:"+stud.getSchoolname());
	System.out.println(" student mobile number :"+stud.getMobilenumber());;
}	
}
