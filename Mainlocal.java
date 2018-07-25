class Localvar
{
void add()
{
int l=12,b=13;
int res;
res=l*b;
}
void disp()
{
System.out.println("result:"+ res);
}
}
class Mainlocal
{
public static void main(String arg[])
{
Localvar lobj=new Localvar();
lobj.disp();
}
}