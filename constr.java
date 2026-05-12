class person
{
	int age;
	String name;
	
	//constructor initializes 
	person(int a,String n)
	{
		age=a;
		name=n;
	}
	void gen()
	{
		System.out.println("His name is :"+name);
	}
	void show()
	{
		System.out.println("His age is :"+age);
	}
}
public class constr
{
	public static void main(String[] args)
	{
		// constructor is calling ,
		person p= new person(18,"prajwal_c");
		p.gen();
		p.show();
	}
}