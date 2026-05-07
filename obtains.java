//This is an Multiple inheritances
import java.io.*;
class grandfather
{
	void house()
	{
		System.out.println("The grandfather owns a House in his era.");
	}
}
class father extends grandfather
{
	void bike()
	{
		System.out.println("The father had an Bike and car");
	}
}
class son extends father
{
	void obts()
	{
		System.out.println("The son owns his father and grandfather properties.");
	}
}
public class obtains
{
	public static void main(String[] args)
	{
	/*
	We create object using:
	Son s = new Son();
	Because Son gets:
	Grandfather properties	
	Father properties
	Its own properties
	So Son can access ALL methods:
	*/
		son s=new son();
		s.house();
		s.bike();
		s.obts();
		
		System.out.println("Program is closed().");
	}
}