class Student1
{
int rollNo;
String name; 

void Student(String nam, int rollN)
{
name = nam;
rollNo = rollN;
} 
public void displayDetails()
{
System.out.println("RollNo = " + rollNo);
System.out.println("name = " + name);
}
public static void main(String args[])
{
Student1 stu1 = new Student1();
stu1.Student("jai",200);
stu1.displayDetails();
}
}

