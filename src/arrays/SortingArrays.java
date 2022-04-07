package arrays;

import java.util.Arrays;

public class SortingArrays {
    public static void main(String[] args) {

        System.out.println("-----First Task-----");
        int[] numbers = {10 , -5 , 0 , 0 , 3 , 0 , 7 , 9};


        System.out.println("My array is = " + Arrays.toString(numbers));

        //Sort array in ascending order [-5 , 0 , 0, 0 , 3 , 7 , 9 , 10]

        Arrays.sort(numbers);

        System.out.println("My array sorted = " + Arrays.toString(numbers));


        System.out.println("-----Second Task-----");
        char[] characters = {'A' , 'b' , 'z' , 'H'};

        System.out.println("My characters array = " + Arrays.toString(characters));

        Arrays.sort(characters);

        System.out.println("My characters array sorted = " + Arrays.toString(characters));


        System.out.println("-----Third Task-----");
        String[] names = {"Adam" , "Adame" , "Alex" , "tom" , "ally" , "Adele" , "terry" , "Josh"};

        System.out.println("My names array = " + Arrays.toString(names));


        Arrays.sort(names);

        System.out.println("My names array sorted = " + Arrays.toString(names));


        System.out.println("-----TASK 2-----");





        }



    }

