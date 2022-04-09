package projects;

import java.util.ArrayList;

public class Project08Testing {
    public static void main(String[] args) {

        System.out.println("-----TASK 1-----");

        String[] task1 = {"foo" , "" , " " , "foo bar" , "java is fun" , " ruby "};
        Project08.countMultipleWords(task1);


        System.out.println("-----TASK 2-----");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(-5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(-10);
        numbers.add(-78);
        numbers.add(0);
        numbers.add(15);
        Project08.removeNegatives(numbers);


        System.out.println("-----TASK 3-----");

        String password = "Abcd123!";

        System.out.println(Project08.validatePassword(password));


        System.out.println("-----TASK 4-----");

        String email = "ahmadaminmj23@gmail.com";

        System.out.println(Project08.validateEmailAddress(email));
    }
}
