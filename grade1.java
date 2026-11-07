import java.util.Scanner;

class student {
    void checkGrade() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Grade: ");
        double grade = input.nextDouble();

        if (grade <= 74) 
            System.out.println("Equivalent: 5.00\nRemarks: Failed!");
        else if (grade <= 76) 
            System.out.println("Equivalent: 3.00\nRemarks: Passed!");
        else if (grade <= 79) 
            System.out.println("Equivalent: 2.75\nRemarks: Passed!");
        else if (grade <= 81) 
            System.out.println("Equivalent: 2.50\nRemarks: Passed!");
        else if (grade <= 84) 
            System.out.println("Equivalent: 2.25\nRemarks: Passed!");
        else if (grade <= 87) 
            System.out.println("Equivalent: 2.00\nRemarks: Passed!");
        else if (grade <= 90) 
            System.out.println("Equivalent: 1.75\nRemarks: Passed!");
        else if (grade <= 93) 
            System.out.println("Equivalent: 1.50\nRemarks: Passed!");
        else if (grade <= 96) 
            System.out.println("Equivalent: 1.25\nRemarks: Passed!");
        else if (grade <= 99) 
            System.out.println("Equivalent: 1.00\nRemarks: Passed!");
        else 
            System.out.println("Invald Grade!");
    }
}

public class grade1 {
    public static void main(String[] args) {
        System.out.println("===== GRADE EVALUATION =====");
        new student().checkGrade();
    }
}
