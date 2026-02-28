import java.io.*;
public class example3{
    public static void main(String[] args) {

        int sum = 0;  // store total

        for(int i = 1; i <= 5; i++) {
            sum = sum + i;  // add i to sum
        }

        System.out.println("Total = " + sum);
    }
}