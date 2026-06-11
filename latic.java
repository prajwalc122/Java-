import java.io.*;

class student
{
	static String schoolname="ABC school";
	String name;
	int marks;
	
	student(String n,int m)
	{
		marks=m;
		name=n;
	}
	void display()
	{
		System.out.println("school :"+schoolname);
		System.out.println("name :"+name);
		System.out.println("mark :"+marks);
	}
}
	
public class latic
	{
		public static void main(String[] args)
		{
			student s1=new student("prajwal",18);
			student s2=new student("ninja",20);
			
			System.out.println("Initializes the value");
			s1.display();
			s2.display();
			
			student.schoolname="XYC school";
			System.out.println("\nAfter changing static variable value ");
			s1.display();
			s2.display();
		}
	
	}
