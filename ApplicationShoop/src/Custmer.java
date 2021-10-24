public class Custmer 
{
private int cust_id;
private String cust_name;
private String cust_mobilenumber;
private String cust_Adharno;
private Address addr;
private Product prod;
private Bill bill;
public Custmer(int cust_id, String cust_name, String cust_mobilenumber, String cust_Adharno, Address addr, Product prod,
		Bill bill) {
	super();
	this.cust_id = cust_id;
	this.cust_name = cust_name;
	this.cust_mobilenumber = cust_mobilenumber;
	this.cust_Adharno = cust_Adharno;
	this.addr = addr;
	this.prod = prod;
	this.bill = bill;
}
public int getCust_id() {
	return cust_id;
}
public Bill getBill() {
	return bill;
}
public void setBill(Bill bill) {
	this.bill = bill;
}
public void setCust_id(int cust_id) {
	this.cust_id = cust_id;
}
public String getCust_name() {
	return cust_name;
}
public void setCust_name(String cust_name) {
	this.cust_name = cust_name;
}
public String getCust_mobilenumber() {
	return cust_mobilenumber;
}
public void setCust_mobilenumber(String cust_mobilenumber) {
	this.cust_mobilenumber = cust_mobilenumber;
}
public String getCust_Adharno() {
	return cust_Adharno;
}
public void setCust_Adharno(String cust_Adharno) {
	this.cust_Adharno = cust_Adharno;
}
public Address getAddr() {
	return addr;
}
public void setAddr(Address addr) {
	this.addr = addr;
}
public Product getProd() {
	return prod;
}
public void setProd(Product prod) {
	this.prod = prod;
}
}
