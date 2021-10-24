public class Bill 
{
private float total;
private float cgst;
public Bill(float total, float cgst) 
{
	super();
	this.total = total;
	this.cgst = cgst;
}
public float getTotal() 
{
	return total;
}
public void setTotal(float total) 
{
	this.total = total;
}
public float getCgst() 
{
	return cgst;
}
public void setCgst(float cgst)
{
	this.cgst = cgst;
}
}