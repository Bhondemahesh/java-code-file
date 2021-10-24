import java.util.Scanner;

public class StudentInfo 
{
private int length;
private Student[] create()
{
Scanner sc = new Scanner(System.in);
System.out.println("\n enter element of student");
int n= sc.nextInt();
Student Sarr[]=new Student[n];
for (int i = 0; i < Sarr.length; i++) 
{
	System.out.println("\n enter student name :\n student roll number : \n student class : \n student admin no :\n student address :\n student contact number :\n student bloodgroup");
	Student student1 = new Student(sc.next(), sc.nextInt(),sc.next(), sc.nextInt(), sc.next(),sc.nextDouble(), sc.next());
	Sarr[i]=student1;
}
return Sarr;
}
public void display(StudentInfo student1)
{
for (int i = 0; i < student1.length; i++) {
	
}	
}
}
