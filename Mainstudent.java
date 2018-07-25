import java.util.*;
class Student
{
	int sid;
	String sname;
	int m,p,c,total;
	float avg;
	Scanner scan=new Scanner (System.in);	
	void accept_stud()
	{
		System.out.println("Enter the student name");
		sname=scan.next();
		System.out.println("Enter roll number");
		sid=scan.nextInt();
		System.out.println("enter maths,phy,che marks");
		m=scan.nextInt();
		p=scan.nextInt();		
		c=scan.nextInt();
		total=m+p+c;
	}
	float calculate_marks()
	{
		avg=total/3;
		return avg;
	}
	void disp_stud()
	{
		System.out.println("display your details");
		System.out.println("student id:"+sid);
		System.out.println("student name:"+sname);
		System.out.println("student total marks:"+total);
		float result=calculate_marks();
		System.out.println("student average:"+result);
	}
}
class Mainstudent
{
	public static void main(String arg[])
	{
		Student stud=new Student();
		stud.accept_stud();
		stud.disp_stud();
		
	}
}
		
