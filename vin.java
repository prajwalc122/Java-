import java.io.*;

public class vin

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
		display(18);
		display("ninja");
		display(22.4F, 44.56F);
	}
}