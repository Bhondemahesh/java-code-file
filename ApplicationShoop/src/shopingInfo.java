public class shopingInfo 
{
	public Custmer create(Custmer cust)
	{
		Product prod = new Product(10, "mahesh", 20000, 1, "wipro", "30/10", "goood product");
		Address addr = new Address("nagar","maharastra", 413702,"pargoan sudrik");
		Bill bill = new Bill(0, 0);
		Custmer cust1 = new Custmer(101, "bhonde mahesh", "9623897271", "581826327109", addr, prod,bill) ;
		return cust;	
	
	}
	
	public void display(Custmer cust)
	{
		System.out.println("--------------------------------------------");
		System.out.println("-----------Custmoer Imformation-------------");
		System.out.println("--------------------------------------------");
		System.out.println("Custmer Id number   :"+cust.getCust_id());	
		System.out.println("Custmer Name        :"+cust.getCust_name());
		System.out.println("Custmer Mobile No   :"+cust.getCust_mobilenumber());
		System.out.println("custmer adhar number:"+cust.getCust_Adharno());
		System.out.println("--------------------------------------------");
		System.out.println("-----------------ADDRESS--------------------");
		System.out.println("--------------------------------------------");
		System.out.println("City                : "+cust.getAddr().getCity());
		System.out.println("State               : "+cust.getAddr().getState());
		System.out.println("Pincode             : "+cust.getAddr().getPincode());
		System.out.println("perment Address     :"+cust.getAddr().getPermarnet_add());
		System.out.println("--------------------------------------------");
		System.out.println("-----------------PRODUCT--------------------");
		System.out.println("--------------------------------------------");
		System.out.println("Product id number   : "+cust.getProd().getProd_id());
		System.out.println("Product name        : "+cust.getProd().getProd_name());
		System.out.println("Product price       : "+cust.getProd().getProd_price());
		System.out.println("Product quantity    : "+cust.getProd().getProd_qty());
		System.out.println("Product compnies of : "+cust.getProd().getProd_compni());
		System.out.println("Product date of manufacture : "+cust.getProd().getProd_Dateofmanu());
		System.out.println("About Product               : "+cust.getProd().getProd_massage());
		System.out.println("-------------------Bill----------------------");
		
		
}
}