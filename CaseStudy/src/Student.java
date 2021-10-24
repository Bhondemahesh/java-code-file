/*
- Create Student class (id, name, dateofbirth)
  - Cover constructors, getters and setters
*/
public class Student
{
private int student_id;
private  char Student_name;
private String student_dob;
public Student(int student_id, char student_name, String student_dob) {
	super();
	this.student_id = student_id;
	Student_name = student_name;
	this.student_dob = student_dob;
}
public Student(int nextInt, String next, String next2) {
	// TODO Auto-generated constructor stub
}
public int getStudent_id() {
	return student_id;
}
public void setStudent_id(int student_id) {
	this.student_id = student_id;
}
public char getStudent_name() {
	return Student_name;
}
public void setStudent_name(char student_name) {
	Student_name = student_name;
}
public String getStudent_dob() {
	return student_dob;
}
public void setStudent_dob(String student_dob) {
	this.student_dob = student_dob;
}

}
