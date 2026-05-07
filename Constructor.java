/*
Constructor in Inheritance (Java)

A constructor is automatically called when an object is created.

In inheritance:

Parent constructor executes first
Child constructor executes next
*/
class parent
{
	void show()
	{
		System.out.println("This is parent constructor");
	}
}
class child extends parent
{
	void display()
	{
		System.out.println("This is an child constructor");
	}
}
public class Constructor
{
	public static void main(String[] args)
	{
		child c=new child();
		c.show();
		c.display();
	}
}