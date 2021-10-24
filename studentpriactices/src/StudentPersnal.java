public class StudentPersnal {
	private String full_name;
	private String father_name;
	private String mother_name;
	private String mobile_name;
	private String dob;
	private String pincode;
	public StudentPersnal(String full_name, String father_name, String mother_name, String mobile_name, String dob,
			String pincode) {
		super();
		this.full_name = full_name;
		this.father_name = father_name;
		this.mother_name = mother_name;
		this.mobile_name = mobile_name;
		this.dob = dob;
		this.pincode = pincode;
	}
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	public String getFather_name() {
		return father_name;
	}
	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}
	public String getMother_name() {
		return mother_name;
	}
	public void setMother_name(String mother_name) {
		this.mother_name = mother_name;
	}
	public String getMobile_name() {
		return mobile_name;
	}
	public void setMobile_name(String mobile_name) {
		this.mobile_name = mobile_name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
}
