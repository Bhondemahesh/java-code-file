
public class Bank {
public Bank(int accNo, String accName, int accifcCode, String accEmail, int accPhone, int accBalance,
			String accAddress) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.accifcCode = accifcCode;
		this.accEmail = accEmail;
		this.accPhone = accPhone;
		this.accBalance = accBalance;
		this.accAddress = accAddress;
	}
public int getAccNo() {
	return accNo;
}
public void setAccNo(int accNo) {
	this.accNo = accNo;
}
public String getAccName() {
	return accName;
}
public void setAccName(String accName) {
	this.accName = accName;
}
public int getAccifcCode() {
	return accifcCode;
}
public void setAccifcCode(int accifcCode) {
	this.accifcCode = accifcCode;
}
public String getAccEmail() {
	return accEmail;
}
public void setAccEmail(String accEmail) {
	this.accEmail = accEmail;
}
public int getAccPhone() {
	return accPhone;
}
public void setAccPhone(int accPhone) {
	this.accPhone = accPhone;
}
public int getAccBalance() {
	return accBalance;
}
public void setAccBalance(int accBalance) {
	this.accBalance = accBalance;
}
public String getAccAddress() {
	return accAddress;
}
public void setAccAddress(String accAddress) {
	this.accAddress = accAddress;
}
private int accNo;
private String accName;
private int accifcCode;
private String accEmail;
private int accPhone;
private int accBalance;
private String accAddress;

}
