package stringMethods;

import java.util.Scanner;
public class PracticeStartsWithAndEndsWith {
        public static void main(String[] args) {

            Scanner userInput = new Scanner(System.in);

            System.out.println("Enter a name");

            String name = userInput.nextLine();

            if(name.startsWith("A")) {
                System.out.println("You are in club A");

            }else if(name.startsWith("a")){
                System.out.println("You are in club A");

            }else{
                System.out.println("You are not in the club A");
            }

            }

    }

