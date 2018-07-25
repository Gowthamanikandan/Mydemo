class Stud
{
int sid=10;
String sname="niit";
float marks=45.5f;
void acceptstud()
{
System.out.println(sid);
System.out.println(sname);
System.out.println(marks);
}
}
class Student
{
public static void main(String arg[])
{
Stud std=new Stud();
std.acceptstud();
}
}
