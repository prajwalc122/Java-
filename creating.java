// Creating one more program using class and  objects.

class employe
{
	String name;
	int salary;
	
	void read()
	{
		System.out.println("employee Details");
	}
}
public class creating
{
	public static void main(String[] args)
	{
		employe e1=new employe();
		e1.name="prajwal";
		e1.salary=33000;
		e1.read();
		
		System.out.println("His name is :"+e1.name);
		System.out.println("His salary will be :"+e1.salary);
	}
}
