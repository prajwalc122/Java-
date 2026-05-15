//todAY we learn the string buffer concepts in java.
/* STRING BUFFER:-In Java, Java provides a class called StringBuffer to create and modify strings easily.

	Definition

	StringBuffer is a mutable class.

	Mutable means:

1)The value can be changed after creation.
2)Memory is not created again and again like String.

	USES OF STRING BUFFER:-
	
1)Faster
2)Memory efficient
3)Useful when strings change many times.

Important Methods of StringBuffer
1) APPEND()*/

class Append
{
    public static void main(String args[])
    {
        StringBuffer sb = new StringBuffer("Java");
		StringBuffer sb1=new StringBuffer("python");
		
        sb.append(" Programming");
		sb1.append(" programming");

        System.out.println(sb);
		System.out.println(sb1);
    }
}