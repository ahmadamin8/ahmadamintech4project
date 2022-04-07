package arrays;

import java.util.Arrays;

public class _05_Practice_Searching_In_Array {
    public static void main(String[] args) {

        System.out.println("-----TASK 1-----");

        String[] objects = {"Remote" ,  "Mouse" , "Mouse" , "Keyboard" , "iPad"};

        boolean hasMouse = false;

        for (String object : objects) {
            if(object.equalsIgnoreCase("Mouse")){
                hasMouse = true;
                break;
            }
        }
        System.out.println(hasMouse);


        System.out.println("-----TASK 2-----");

        boolean hasBoard = false;

        for (String object : objects) {
            if(object.equalsIgnoreCase("board")){
                hasBoard = true;
                break;
            }
        }
        System.out.println(hasBoard);


        System.out.println("-----TASK 3-----");

        Arrays.sort(objects);

        System.out.println(Arrays.binarySearch(objects , "iPad"));
        System.out.println(Arrays.binarySearch(objects , "Mouse"));
        System.out.println(Arrays.binarySearch(objects , "Apple"));


        System.out.println("-----TASK 4-----");

        int[] numbers = {5 , -2 , 0 , -7 , 0 , 5 , 8 , 45 , 53};
        Arrays.sort(numbers);

        System.out.println(Arrays.binarySearch(numbers,5) >= 0);
        System.out.println(Arrays.binarySearch(numbers,  0) >= 0);
        System.out.println(Arrays.binarySearch(numbers,45) >= 0);
        System.out.println(Arrays.binarySearch(numbers,3) >= 0);
        System.out.println(Arrays.binarySearch(numbers,-7) >= 0);


        }
    }

