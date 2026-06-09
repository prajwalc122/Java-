import java.io.*;
import java.util.Scanner;

class addsub
{
	double num1,num2;
	void add()
	{
		System.out.println("Addition is:"+(num1+num2));
	}
	void sub()
	{
		System.out.println("Substraction is :"+(num1-num2));
	}
}
class muldiv extends addsub
{
	void mul()
	{
		System.out.println("multiplication is "+(num1*num2));
	}
	void divide()
	{
		if(num2 != 0)
		{
			System.out.println("Division"+(num1/num2));
		}
		else
		{
			System.out.println("Division:Error! cannot divide by zero.");
		}
	}
}
public class asmd
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		muldiv cal=new muldiv();
		
		System.out.println("Enter Your First Number:");
		cal.num1=sc.nextDouble();
		
		System.out.println("Enter your second Number:");
		cal.num2=sc.nextDouble();
		
		System.out.println("-----------Result---------");
		
		cal.add();
		cal.sub();
		cal.mul();
		cal.divide();
		sc.close();
	}
}