
import java.util.Scanner;

class Account {
    void checkBalance() {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter PIN: ");
        int pin = input.nextInt();

        if (pin == 1234)
            System.out.println("\nLogin Successful!\nWelcome to ABC Bank!\nYour Balance: 15000.0");
        else
            System.out.println("\nInvalid PIN!");
    }
}

public class atm {
    public static void main(String[] args) {
        System.out.println("===== ATM SYSTEM =====\n");
        new Account().checkBalance();
    }
}
