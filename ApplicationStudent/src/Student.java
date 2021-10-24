
public class Student {
    
	private int roll;
	private int Id;
	private String name;
	private String schoolname;
	private int mobilenumber;
	public Student(int roll, int id, String name, String schoolname, int mobilenumber) {
		super();
		this.roll = roll;
		Id = id;
		this.name = name;
		this.schoolname = schoolname;
		this.mobilenumber = mobilenumber;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSchoolname() {
		return schoolname;
	}
	public void setSchoolname(String schoolname) {
		this.schoolname = schoolname;
	}
	public int getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(int mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	
	
}
