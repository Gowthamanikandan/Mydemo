class Rect
{
int l,b;
int r;
void area()
{
int l=20;
int b=40;
int r=l*b;
}
void disp()
{
System.out.println(r);
}
}
class MainRect1
{
public static void main(String args[])
{
Rect robj=new Rect();
robj.area();
robj.disp();
}
}