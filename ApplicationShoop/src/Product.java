public class Product 
{
	private int prod_id;
	private String prod_name;
	private int prod_price;
	private int prod_qty;
	private String prod_compni;
	private String prod_Dateofmanu;
	private String prod_massage;
	public Product(int prod_id, String prod_name, int prod_price, int prod_qty, String prod_compni,
			String prod_Dateofmanu, String prod_massage) {
		super();
		this.prod_id = prod_id;
		this.prod_name = prod_name;
		this.prod_price = prod_price;
		this.prod_qty = prod_qty;
		this.prod_compni = prod_compni;
		this.prod_Dateofmanu = prod_Dateofmanu;
		this.prod_massage = prod_massage;
	}
	public int getProd_id() {
		return prod_id;
	}
	public void setProd_id(int prod_id) {
		this.prod_id = prod_id;
	}
	public String getProd_name() {
		return prod_name;
	}
	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}
	public int getProd_price() {
		return prod_price;
	}
	public void setProd_price(int prod_price) {
		this.prod_price = prod_price;
	}
	public int getProd_qty() {
		return prod_qty;
	}
	public void setProd_qty(int prod_qty) {
		this.prod_qty = prod_qty;
	}
	public String getProd_compni() {
		return prod_compni;
	}
	public void setProd_compni(String prod_compni) {
		this.prod_compni = prod_compni;
	}
	public String getProd_Dateofmanu() {
		return prod_Dateofmanu;
	}
	public void setProd_Dateofmanu(String prod_Dateofmanu) {
		this.prod_Dateofmanu = prod_Dateofmanu;
	}
	public String getProd_massage() {
		return prod_massage;
	}
	public void setProd_massage(String prod_massage) {
		this.prod_massage = prod_massage;
	}
}
