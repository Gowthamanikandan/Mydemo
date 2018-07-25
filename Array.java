import java.util.*;
class Array
{
public static void main(String arg[])
{
	int array[]=new int[5];
	int var1;
	Scanner scanner=new scanner(System.in);
	for(var1=0;var1<5;var1++)
	{
		System.out.println("enter the value of array:"+var1);
		array[var1]=scanner.nextInt();
	}
	for(var1=0;var1<5;var1++)
	{
		System.out.println("array["+var1"]=")+array[var1];
	}
}
}