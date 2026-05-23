import java.util.Scanner;

public class Library{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String books[] = {"Java", "Python", "C Programming"};

        System.out.println("Available Books:");

        for(String b : books) {
            System.out.println(b);
        }

        System.out.print("Enter book to issue: ");
        String issue = sc.nextLine();

        System.out.println(issue + " Book Published Successfully");
    }
}