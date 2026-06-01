class animal
{
	void show()
	{
		
		System.out.println("Animal is eating");
	}
}
class Dog extends animal
{
	void bark()
	{
		System.out.println("Dog bark");
	}
}
public class m21
{
		public static void main(String[] args)
		{
			Dog c=new Dog();
			c.show();
			c.bark();
		}
}