public class Address 
{
		private String city;
		private String state;
		private int pincode;
		private String Permarnet_add;
		public Address(String city, String state, int pincode, String permarnet_add) {
			super();
			this.city = city;
			this.state = state;
			this.pincode = pincode;
			Permarnet_add = permarnet_add;
		}
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
		public int getPincode() {
			return pincode;
		}
		public void setPincode(int pincode) {
			this.pincode = pincode;
		}
		public String getPermarnet_add() {
			return Permarnet_add;
		}
		public void setPermarnet_add(String permarnet_add) {
			Permarnet_add = permarnet_add;
		}
		
}
