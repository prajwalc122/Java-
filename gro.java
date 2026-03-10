import java.io.*;

public class gro

{
	private static void display(int a)
	{
		System.out.println("arguments is :"+a);
	}
	private static void display(String a)
	{
		System.out.println("String value is :"+a);
	}
	private static void display(float a,float b)
	{
		System.out.println("The floating value is :"+a+"and"+b);
	}
	
	public static void main(String[] args)
	{
		display(78);
		display("prajwal c");
		display(22.4F, 44.56F);
	}
}
		
