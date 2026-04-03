import java.io.*;
import java.util.*;

public class kio
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name :");
		String name=sc.next();
		System.out.println(name);
		
		System.out.println("Enter a sebtence ");
		String sentence=sc.next();
		System.out.println(sentence);
		
		sc.close();
	}
}