package ifElseStatements.ifStatements;
import java.util.Scanner;
public class MathGradeExample {
    public static void main(String[] args) {
        System.out.println("Enter your grade");

        Scanner userInput = new Scanner(System.in);
        int myGrade = userInput.nextInt();

        if (myGrade >= 60) {
            System.out.println("You have passed the class");


        } else {
            System.out.println("You did not pass the class");
        }
    }
}