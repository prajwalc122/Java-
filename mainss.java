import java.io.*;

class student
{
	static String schoolname="xyz School";
	String name;
	int marks;
	
	student(String n,int m)
	{
		marks =m;
		name =n;
	}
	void display()
	{
		System.out.println("School name"+schoolname);
		System.out.println("name"+name);
		System.out.println("marks"+marks);
	}
}
public class mainss
{
	public static void main(String[] args)
	{
		student s1=new student("prajwal",19);
		student s2=new student("divua",33);
	
	System.out.println("initializes the values");
		s1.display();
		s2.display();
	
	student.schoolname="AVS school";
	
	System.out.println("After changing the static variable");
		s1.display();
		s2.display();
	}
}