public class Student 
{
	private int roll_no;
	private String stud_name;
	private String stud_class;
	private String stud_div;
	private String stud_mobile;
	private String stud_Adhar;
	public Student(int roll_no, String stud_name, String stud_class, String stud_div, String stud_mobile,
			String stud_Adhar, Address addr, StudentPersnal studper) {
		super();
		this.roll_no = roll_no;
		this.stud_name = stud_name;
		this.stud_class = stud_class;
		this.stud_div = stud_div;
		this.stud_mobile = stud_mobile;
		this.stud_Adhar = stud_Adhar;
		this.addr = addr;
		this.studper = studper;
	}
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public String getStud_name() {
		return stud_name;
	}
	public void setStud_name(String stud_name) {
		this.stud_name = stud_name;
	}
	public String getStud_class() {
		return stud_class;
	}
	public void setStud_class(String stud_class) {
		this.stud_class = stud_class;
	}
	public String getStud_div() {
		return stud_div;
	}
	public void setStud_div(String stud_div) {
		this.stud_div = stud_div;
	}
	public String getStud_mobile() {
		return stud_mobile;
	}
	public void setStud_mobile(String stud_mobile) {
		this.stud_mobile = stud_mobile;
	}
	public String getStud_Adhar() {
		return stud_Adhar;
	}
	public void setStud_Adhar(String stud_Adhar) {
		this.stud_Adhar = stud_Adhar;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	public StudentPersnal getStudper() {
		return studper;
	}
	public void setStudper(StudentPersnal studper) {
		this.studper = studper;
	}
	Address addr;
	StudentPersnal studper;
}
