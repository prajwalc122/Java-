// TODAY WE LEARN ABOUT THE SINGLE INHERITANCES.
import java.io.*;

class student
{
	void his()
	{
		System.out.println("Before inherit he was an student.");
	}
}
class person extends student
{
	void old()
	{
		System.out.println("He was now older person.");
	}
}
public class persons
{
	public static void main(String[] args)
	{
		person p=new person();
		p.his();
		p.old();
	}
}