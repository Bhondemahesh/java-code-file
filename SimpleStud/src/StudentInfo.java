import java.util.Scanner;

public class StudentInfo
{
	public Student input()
	{
		Student stud = new Student(0, 0, null, 0, null);
		Scanner sc = new Scanner(System.in);
				return null;
		
	}
	public void display(Student stud)
	{
		System.out.println("student id        :"+stud.getStudid());
		System.out.println("student name      :"+stud.getStudname());
		System.out.println("student resiterid :"+stud.getStudResterid());
		System.out.println("student pincode   :"+stud.getPincode());
		System.out.println("student address   :"+stud.getStudenAdress());
	}
}
