/*replace()

Replaces characters.

Program*/
public class ReplaceDemo
{
    public static void main(String[] args)
    {
        StringBuffer sb = new StringBuffer("I like c");

        sb.replace(7,8,"Python");

        System.out.println(sb);
    }
}