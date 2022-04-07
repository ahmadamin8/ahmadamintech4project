package arrays;

import utilities.CharacterHelper;
import utilities.ScannerHelper;
import utilities.StringHelper;

import java.util.Arrays;

public class _01_Practice_Char_Array {
    public static void main(String[] args) {

        System.out.println("-----TASK 1-----");

        char[] chars = {'#' , '$' , '5' , 'A' , 'b' , 'H'};
        System.out.println(Arrays.toString(chars));


        System.out.println("-----TASK 2-----");

        System.out.println("The size of the array is = " + chars.length);


        System.out.println("-----TASK 3-----");

        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }


        System.out.println("-----TASK 4-----");

        for(char element: chars){
            System.out.println(element);
        }


        System.out.println("-----TASK 5-----");

        for (int i = 0; i < chars.length; i++) {
            if((chars[i] >= 65 && chars[i] <= 90 || chars[i] >= 97 && chars[i] <= 122)){
                System.out.println(chars[i]);
            }
        }


        System.out.println("-----TASK 6-----");
        int count = 0;

        for (int i = 0; i < chars.length; i++) {
            if(CharacterHelper.isUppercase(chars[i])){
                count++;
            }
        }
        System.out.println(count);


        System.out.println("-----TASK 7-----");





    }
}
