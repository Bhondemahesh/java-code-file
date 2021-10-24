public class Address 
{
	private String city;
	private String state;
	private String pincode;
	private String add_permnat;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getAdd_permnat() {
		return add_permnat;
	}
	public void setAdd_permnat(String add_permnat) {
		this.add_permnat = add_permnat;
	}
public Address(String city, String state, String pincode, String add_permnat) {
		super();
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.add_permnat = add_permnat;
	}
}
