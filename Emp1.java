class Emp1
{
	int EId;
	String Ename;
	double salary;

	void accept_Emp(int id,String empName,double salary)
	{
		EId=EId;
		Ename=Ename;
		salary=salary;
	
	}
	void disp_Emp()
	{
		System.out.println("EId:"+EId);
		System.out.println("Ename:"+Ename);
		System.out.println("salary:"+salary);
	}
	public static void main(String arg[])
		{
		Employee empobj=new Employee();
			 empobj.accept_Emp(100,"niit",12000);
			empobj.disp_Emp();
			
		}
}