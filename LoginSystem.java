import java.util.Scanner;

public class LoginSystem{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String username = "admin";
        String password = "1234";

        String user, pass;

        System.out.print("Enter Username: ");
        user = sc.nextLine();

        System.out.print("Enter Password: ");
        pass = sc.nextLine();

        if(user.equals(username) && pass.equals(password)) {
            System.out.println("Login Successful");
        }
        else {
            System.out.println("Wrong Username or Password");
        }

        sc.close();
    }
}