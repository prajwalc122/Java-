import java.io.*;

public class exception{
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int result = a / b;   // exception occurs
            System.out.println(result);
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
        finally {
            System.out.println("Program finished");
        }
    }
}