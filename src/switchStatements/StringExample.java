package switchStatements;
import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {

       Scanner userInput = new Scanner(System.in);
        System.out.println("Hello, tell me the greeting for the time");
        String greeting = userInput.nextLine();

        switch(greeting){
            case "Good morning":
                System.out.println("Then it is morning");
                break;
            case "Good afternoon":
                System.out.println("Then, it is afternoon");
                break;
            case "Good evening":
                System.out.println("Then, it is evening");
                break;
            default:
                System.out.println("Well, I need to study more");


        }
    }
}
