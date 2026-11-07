import java.util.Scanner;

class account {
    void checkBalance() {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter PIN: ");
        int pin = input.nextInt();
        
        System.out.print("Enter Amount to Add: ");
        double balancer = input.nextDouble();
        double balance = 15000;
        
        if (pin == 1234)
            System.out.println("\nLogin Successful!\nWelcome to ABC Bank!\nYour Balance: " + (balance + balancer));
        else
            System.out.println("\nInvalid PIN!");
    }
}

public class atm1 {
    public static void main(String[] args) {
        System.out.println("===== ATM SYSTEM =====\n");
        new account().checkBalance();
    }
}