
public class Student 
{
private int studid;
private int studResterid;
private String studname;
private int pincode;
private String studenAdress;
public Student(int studid, int studResterid, String studname, int pincode, String studenAdress) {
	super();
	this.studid = studid;
	this.studResterid = studResterid;
	this.studname = studname;
	this.pincode = pincode;
	this.studenAdress = studenAdress;
}
public int getStudid() {
	return studid;
}
public void setStudid(int studid) {
	this.studid = studid;
}
public int getStudResterid() {
	return studResterid;
}
public void setStudResterid(int studResterid) {
	this.studResterid = studResterid;
}
public String getStudname() {
	return studname;
}
public void setStudname(String studname) {
	this.studname = studname;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}
public String getStudenAdress() {
	return studenAdress;
}
public void setStudenAdress(String studenAdress) {
	this.studenAdress = studenAdress;
}

}
