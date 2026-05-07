//program to add two integer and float numbers when number are arguments are using method overloading?
import java.io.*;
class demos
{
	private static void display(int a,int b)
	{
		System.out.println("int values is,"+(a+b));
	}

	private static void display(float a,float b)
	{
		System.out.println("floating values is"+(a+b));
	}
	private static void display(String a)
	{
		System.out.println("string valuesis:"+a);
	}
	public static void main(String[] args)
	{
		display(12,87);
		display(4.78f,77.89f);
		display("prajwal");
	}
}
		