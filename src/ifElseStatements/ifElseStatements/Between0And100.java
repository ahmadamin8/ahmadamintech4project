package ifElseStatements.ifElseStatements;
import java.util.Scanner;
public class Between0And100 {
    public static void main(String[] args) {


        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter a number");

        int myNumber = userInput.nextInt();

        boolean isNumBiggerThan0 = myNumber >= 0;
        boolean isNumSmallerThan110 = myNumber <= 100;
        boolean inBetween0And100 = isNumBiggerThan0 && isNumSmallerThan110;

        if (inBetween0And100){
            System.out.println("It is in between 0 and 100");
        }else{
            System.out.println("It is not between 0 and 100");
        }
    }
}
