package homeworks;

import utilities.Project07;

public class Project07Testing {
    public static void main(String[] args) {

        System.out.println("-----TASK 1-----");

        int[] numbers = {10 , 7 , 7 , 10 , -3 , 10 , -3};

        Project07.findGreatestAndSmallestWithSort(numbers);


        System.out.println("-----TASK 2-----");

        Project07.findGreatestAndSmallest(numbers);


        System.out.println("-----TASK 3-----");

        int[] numbersT2 = {10 , 5 , 6 , 7 , 8 , 5 , 15 , 15};

        Project07.findSecondGreatestAndSmallestWithSort(numbersT2);


        System.out.println("-----TASK 4-----");
        int[] numbersT4 = {10 , 5 , 6 , 7 , 8 , 5 , 15 , 15};
        Project07.findSecondGreatestAndSmallest(numbersT4);


        System.out.println("-----TASK 5-----");
        String[] task5 = {"foo" , "bar" , "Foo" , "bar" , "6" , "abc" , "6" , "xyz"};

        Project07.findDuplicatedElementsInAnArray(task5);


        System.out.println("-----TASK 6-----");
        String[] words = {"pen" , "eraser" , "pencil" , "pen" , "123" , "abc" , "pen" , "eraser" , "word"};

        Project07.findMostRepeatedElementsInAnArray(words);


    }
}
