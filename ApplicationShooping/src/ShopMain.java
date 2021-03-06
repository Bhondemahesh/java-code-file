
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class ShopMain 
{
	Date current_date = new Date();
	public static void main(String[] args) 
	{
		System.out.println("Hello....");
		Product prod = new Product(10, "laptop", 20000, 2);
		Address addr = new Address("pune","MH",413702);
		Customer cust = new Customer(10, "mahesh", "9623897271", addr, prod);
		Display(cust);
	}
	public static void Display(Customer cust)
	{
	System.out.println("--------------------------------------------");
	System.out.println("-----------Custmoer Imformation-------------");
	System.out.println("--------------------------------------------");
	System.out.println("Custmer Id number   :"+cust.getCustId());	
	System.out.println("Custmer Name        :"+cust.getCustName());
	System.out.println("Custmer Mobile No   :"+cust.getMobNo());
	System.out.println("--------------------------------------------");
	System.out.println("-----------------ADDRESS--------------------");
	System.out.println("--------------------------------------------");
	System.out.println("City                : "+cust.getAddr().getCity());
	System.out.println("State               : "+cust.getAddr().getState());
	System.out.println("Pincode             : "+cust.getAddr().getPincode());
	System.out.println("--------------------------------------------");
	System.out.println("-----------------PRODUCT--------------------");
	System.out.println("--------------------------------------------");
	System.out.println("Product id number   : "+cust.getProd().getProdId());
	System.out.println("Product name        : "+cust.getProd().getProdName());
	System.out.println("Product price       : "+cust.getProd().getProdPrice());
	System.out.println("Product quantity    : "+cust.getProd().getProdQty());
	System.out.println("--------------------------------------------");
	System.out.println("Today's Date: "); // Print today's date
	}
}
