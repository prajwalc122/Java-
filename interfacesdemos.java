import java.io.*;
import java.util.Scanner;
interface animal
{
	void sound();
	void eat();
}
class dog implements animal
{
	public void sound()
	{
		System.out.println("Dog Barks at night ");
	}
	
	public void eat()
	{
		System.out.println("Dog eats the food");
	}
}
class cat implements animal 
{
	public void eat()
	{
		System.out.println("Cat drinks the milk at midnight");
	}
	public void sound()
	{
		System.out.println("Cat meows");
	}
}
public class interfacesdemos
{
	public static void main(String [] args)
	{
		animal a1=new dog();
		animal a2=new cat();
		
		a1.sound();
		a1.eat();
		
		System.out.println("_________________________");
		
		a2.sound();
		a2.eat();
	}
}