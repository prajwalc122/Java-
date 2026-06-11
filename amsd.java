import java.io.*;
import java.util.Scanner;

class addsub
{	
	double num1,num2;
	void add()
	{
		System.out.println("ADDITION :"+(num1+num2));
	}
	void sub()
	{
		System.out.println("SUBSTRACTION :"+(num1-num2));
	}
}
	
class muldiv extends addsub
{
	void mul()
	{
		System.out.println("MULTIPLICATION :"+(num1*num2));
	}
	void divide()
	{
		if(num2 !=0)
		{
			System.out.println("DIVISION :"+(num1/num2));
		}
		else
		{
			System.out.println("ERROR: cannot divide by ZERO");
		}
	}
}
public class amsd
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		muldiv cal=new muldiv();
		
		System.out.println("\nEnter the first number:");
		cal.num1=sc.nextDouble();
		
		System.out.println("\nEnter the second number:");
		cal.num2=sc.nextDouble();
		
		System.out.println("\n____________RESULT______________");
		cal.add();
		cal.sub();
		cal.mul();
		cal.divide();
		sc.close();
	}
}