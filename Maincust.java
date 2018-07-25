class Customer
{
	int id;
	String name;
	void accept()
	{
		id=100;
		name="bhartah";

	}
	void disp()
	{
	System.out.println("customer id="+id);
	System.out.println("customer name="+name);
}
}
class Maincust
{
public static void main(String arg[])
{
Customer cust=new Customer();
cust.accept();
cust.disp();
}}
