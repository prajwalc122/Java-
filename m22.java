class Person
{
	void show()
	{
		System.out.println("This is person as a object");
	}
}
class child extends Person
{
	void based()
	{
		System.out.println("This is child as another object");
	}
}
public class m22
{
		public static void main(String[] args)
		{
			child c=new child();
			c.show();
			c.based();
		}
}