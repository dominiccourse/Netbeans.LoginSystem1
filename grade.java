
import java.util.Scanner;

class Student {
    void checkGrade() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Grade: ");
        double grade = input.nextDouble();

        if (grade >= 75)
            System.out.println("PASSED!");
        else
            System.out.println("FAILED!");
    }
}

public class grade {
    public static void main(String[] args) {
        System.out.println("===== GRADE EVALUATION =====");
        new Student().checkGrade();
    }
}
