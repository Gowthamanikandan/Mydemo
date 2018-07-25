class Employee
{
	int eid;
	String empName;
	int salary;

	void accept_Emp(int eno,String ename,int sal)
		{
			eid=eno;
			empName=ename;
			salary=sal;
		}
	void disp_Emp()
		{
			System.out.println("Empid:"+eid);
			System.out.println("EmpName:"+empName);
			System.out.println("sal:"+salary);
		}
	public static void main(String args[])
		{
			Employee eobj=new Employee();
			eobj.accept_Emp(100,"niit",15000);
			eobj.disp_Emp();
		}
}