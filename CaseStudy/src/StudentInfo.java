import java.util.Scanner;
public class StudentInfo
	{
	public Student[] create () 
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many element");
	int number = sc.nextInt();
	Student[] stud = new Student[number];
	for (int i = 0; i <stud.length; i++)
			{
				System.out.println("Enter student id   :"
								  +"Enter student name :");
				Student student1 = new Student(sc.nextInt(),sc.next(),sc.next());
				stud[i]=student1;
			}
			return stud;
		}
	public  Student[]  display(Student[] stud)
	{
	for (int i = 0; i < stud.length; i++) 
	{
	System.out.println("student id is   :"+stud[i].getStudent_id());
	System.out.println("student name is :"+stud[i].getStudent_name());
	System.out.println("student dob is  :"+stud[i].getStudent_dob());
	}
	return stud;	
	}
	}
