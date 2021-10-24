
public class Student
{
	private String studentname;
	private int studentroll;
	private String studentclass;
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public int getStudentroll() {
		return studentroll;
	}
	public void setStudentroll(int studentroll) {
		this.studentroll = studentroll;
	}
	public String getStudentclass() {
		return studentclass;
	}
	public void setStudentclass(String studentclass) {
		this.studentclass = studentclass;
	}
	public int getStudenAdminno() {
		return studenAdminno;
	}
	public void setStudenAdminno(int studenAdminno) {
		this.studenAdminno = studenAdminno;
	}
	public String getStudenaddresss() {
		return studenaddresss;
	}
	public void setStudenaddresss(String studenaddresss) {
		this.studenaddresss = studenaddresss;
	}
	public Double getStudentContectno() {
		return studentContectno;
	}
	public void setStudentContectno(Double studentContectno) {
		this.studentContectno = studentContectno;
	}
	public String getStudentBloodgp() {
		return studentBloodgp;
	}
	public void setStudentBloodgp(String studentBloodgp) {
		this.studentBloodgp = studentBloodgp;
	}
	private int studenAdminno;
	private String studenaddresss;
	private Double studentContectno;
	private String studentBloodgp;
	public Student(String studentname, int studentroll, String studentclass, int studenAdminno, String studenaddresss,
			Double studentContectno, String studentBloodgp) {
		super();
		this.studentname = studentname;
		this.studentroll = studentroll;
		this.studentclass = studentclass;
		this.studenAdminno = studenAdminno;
		this.studenaddresss = studenaddresss;
		this.studentContectno = studentContectno;
		this.studentBloodgp = studentBloodgp;
	}
	public Student(String next, int nextInt, String next2, int nextInt2, String next3, double nextDouble,
			String next4) {
		// TODO Auto-generated constructor stub
	}
}
