package homeworks;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

//        System.out.println("-----TASK 7-----");
//        System.out.println("Please enter your first and last name");
//        Scanner userInput = new Scanner(System.in);
//        String task7String = userInput.nextLine();
//
//        int vowels = 0;
//
//        for (int i = 0; i < task7String.length(); i++) {
//            char task7Char = task7String.charAt(i);
//            if (task7Char == 'a' || task7Char == 'e' || task7Char == 'i' || task7Char == 'o' || task7Char == 'u') {
//                ++vowels;
//            }
//        }
//        System.out.println("There are " + vowels + " letters in this full name");
//    }
//}

//        System.out.println("-----TASK 10-----");
//        System.out.println("Please enter a name");
//        Scanner userInput = new Scanner(System.in);
//        String task10String = userInput.nextLine();
//
//        String lowercaseJ = "j";
//        String upperCaseJ = "J";
//
//        if (task10String.contains("j") || task10String.contains("J")) {
//            System.out.println("End of the program");
//        } else
//            System.out.println("Please enter another name");

//        System.out.println("-----TASK 10 TRY-----");
//
//        System.out.println("Please enter a name");
//        Scanner userInput = new Scanner(System.in);
//        String userString = userInput.nextLine();
//
//        while(!userString.contains("j") && !userString.contains("J")){
//            System.out.println("Please enter a name");
//            userString = userInput.nextLine();
//        }
//        System.out.println("End of the program");
//
//    }
//}
//        System.out.println("-----TASK 9-----");
//        System.out.println("Please enter a number");
//        Scanner userInput = new Scanner(System.in);
//        String task9String = "";
//        int task9Int = userInput.nextInt() , first = 0 , second = 1;
//
//
//
//
//        for (int i = 1; i <= task9Int; i++) {
//            task9String += i + " - ";
//
//            int next = first + second;
//            first = second;
//            second = next;
//            if(task9String.isEmpty()) System.out.println(task9String.substring(0 , task9String.length()-3));

//        System.out.println("task9");
//        System.out.println("Please enter a number");
//        Scanner userInput = new Scanner(System.in);
//
//        int userNum = userInput.nextInt();
//        int num1 = 0;
//        int num2 = 1;
//        int num3;
//
//        String task9String = "";
//
//        for (int i = 0; i < userNum; i++) {
//            task9String+= num1 + " - ";
//            num3 = num1 + num2;
//            num1 = num2;
//            num2 = num3;
//
//        }
//        System.out.println(task9String.substring(0 , task9String.length()-3));
//    }
//}
        System.out.println("-----TASK 10-----");
        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter a name");
        String userString = userInput.nextLine();

        while(!userString.contains("j") && !userString.contains("J")){
            System.out.println("Please enter a name");
            userString = userInput.nextLine();
        }
        System.out.println("End of the program");
        System.out.println("-----TASK 8-----");

        int task8Container = 0;
        int attempt = 1;

        do {
            if(attempt == 1) System.out.println("Please enter a number");
            else{
                System.out.println("Please enter another number");
            }
            int task8Num = userInput.nextInt();
            task8Container += task8Num;
            attempt++;
        }
        while(task8Container < 100);{
            System.out.println("Sum of the entered numbers is at least 100");
        }


    }
}