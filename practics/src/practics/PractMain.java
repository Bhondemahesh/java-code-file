
package practics;

public class PractMain 
	{

	public static void main(String[] args)
	{
	PractMain stud= new (101,"mahesh",20000,1);
		System.out.println("student roll number : "+stud.getStudRoll());
		System.out.println("student name : "+stud.getStudname());
		System.out.println("student painding student feee: "+stud.getStudfee());

		System.out.println("student roll number : "+stud.getStudNum());
		stud.setStud(1);
		

		System.out.println("student id is update  : "+stud.getstudNum());
	}

}
