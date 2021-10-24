public class StudentMain
{
	public static void main(String[] args)
		{
		StudentInfo stuInfo = new StudentInfo();
		Student stud = stuInfo.input();
		stuInfo.display(stud);
	}
}
