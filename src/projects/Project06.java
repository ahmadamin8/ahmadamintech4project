package projects;
import java.util.Scanner;
public class Project06 {
    public static void main(String[] args) {


        System.out.println("-----TASK 1-----");
        System.out.println("Please enter a string");
        Scanner userInput = new Scanner(System.in);
        String task1String = userInput.nextLine().trim();

        int count = 1;

        for (int i = 0; i < task1String.length() - 1; i++) {
            if ((task1String.charAt(i) == ' ') && (task1String.charAt(i + 1) != ' ')) {
                count++;
            }
        }

        if (!task1String.contains(" ")) {
            System.out.println("This sentence does not have multiple words.");
        } else System.out.println("This sentence has " + count + " words.");


        System.out.println("-----TASK 2-----");
        System.out.println("Please enter a word");
        String task2String = userInput.nextLine().trim();
        String reversedString = "";

        int stringLength = task2String.length();

        for (int i = (stringLength - 1); i >= 0; i--) {
            reversedString = reversedString + task2String.charAt(i);
        }
        if (task2String.toLowerCase().equals(reversedString) && task2String.length() > 1) {
            System.out.println("This word is palindrome");
        }
        if (!task2String.toLowerCase().equals(reversedString)) {
            System.out.println("This word is not palindrome");
        }
        if (task2String.length() < 1) {
            System.out.println("This word does not have 1 more more characters");
        }
        System.out.println("-----TASK 3-----");
        System.out.println("Please enter a sentence");
        String task3String = userInput.nextLine().trim();

        int a = 0;

        for (int i = 0; i < task3String.length(); i++) {
            char task3Char = task3String.toLowerCase().charAt(i);
            if (task3Char == 'a') {
                a += 1;
            }
        }
        if (task3String.length() < 1) {
            System.out.println("This sentence does not have any characters");
        } else System.out.println("This sentence has " + a + " a or A letters.");


        System.out.println("-----TASK 4-----");
        System.out.println("Please enter a positive number");
        int task4Int = userInput.nextInt();

        for (int i = 1; i <= task4Int ; i++) {
            if(i % 2 == 0 && i % 3 == 0) {
                System.out.println("FooBar");
            }else if(i % 2 == 0) {
                System.out.println("Foo");
            }else if(i % 3 == 0) {
                System.out.println("Bar");
            }else{
                System.out.println(i);


            }

        }




        }





        }








