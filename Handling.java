/* in java exceptional handling is more more taken time compare to others topcs*/
import java.io.*;

public class Handling
{
	public static void main(String[] args)
	{
		try{
			int a=10,b=0;
			int c=a/b;
			}
		catch(ArithmeticException e){
		System.out.println("Cannot Divide by zero ");
		}
		finally{
			System.out.println("Program contineous ");
				}
		}
	}