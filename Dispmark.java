// we learn inheritance with an displays my name and marks.

import java.io.*;

class person
{
	String name="prajwal.c";
	void display()
	{
		System.out.println("The person name is:"+name);
	}
}
class student extends person
{
	int marks=85;
	void show()
	{
		System.out.println("The student marks will be :"+marks);
	}
}
public class Dispmark
{
	public static void main(String[] args)
	{
		student s1=new student();
		s1.display();
		s1.show();
	}
}