class Rect
{
	int length,breadth;
	int area;
	Rect()
	{
		length=20;
		breadth=40;
	}
	float Rect()
	{
		area=length*breadth;
		return area;		
	}
	void disp()
	{
		System.out.println("area of rect="+Rect());
	}
}
class MainRect
{
	public static void main(String arg[])
	{
		Rect robj=new Rect();
		robj.disp();
	}
} 