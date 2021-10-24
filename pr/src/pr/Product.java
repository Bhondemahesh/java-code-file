package pr;

public class Product {
	private int prodId;
	private String prodname;
	private float prodprice;
	private int prodQty;
	public Product(int prodId, String prodname, float prodprice, int prodQty) {
		super();
		this.prodId = prodId;
		this.prodname = prodname;
		this.prodprice = prodprice;
		this.prodQty = prodQty;
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdname() {
		return prodname;
	}
	public void setProdname(String prodname) {
		this.prodname = prodname;
	}
	public int getProdQty() {
		return prodQty;
	}
	public void setProdQty(int prodQty) {
		this.prodQty = prodQty;
	}
	public double getprodPrice(){
		return prodprice;
	}
	public void setprodprice(float prodprice) {
		this.prodprice = prodprice;
		
	}
	
}
