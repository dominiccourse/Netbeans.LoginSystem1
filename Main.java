
import java.util.Scanner;

class Login {
    void checkLogin() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Username: ");
        String user = input.nextLine();

        System.out.print("Enter Password: ");
        String pass = input.nextLine();

        if (user.equals("admin") && pass.equals("12345"))
            System.out.println("\nLogin Successful!\nWelcome Admin!");
        else
            System.out.println("\nInvalid Username or Password!");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("==== LOGIN SYSTEM ====\n");
        new Login().checkLogin();
    }
}
