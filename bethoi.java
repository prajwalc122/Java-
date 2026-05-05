class cat
{
	int age;
	String goodname;
	
	void her()
	{
		System.out.println("Cat was an Girl");
	}
}
public class bethoi
{
	public static void main(String[] args)
	{
		cat c1=new cat();
		c1.goodname="Beku";
		c1.age=18;
		c1.her();
		
		System.out.println(c1.goodname);
		System.out.println(c1.age);
		
		System.out.println("Program was Completed.");
	}
}