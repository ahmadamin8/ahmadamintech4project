package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class UnderstandingArrays {
    public static void main(String[] args) {

        String name;

        name = "John";

        int age = 45;

        System.out.println("Name is = " + name);
        System.out.println("Age is = " + age);

        String studentsName[] = {"Ahmad" , "Naim" , "Rami"};
        int[] ages = {20 , 21 ,22};
        char[] favCharacters = {'A' , '%' , 'G'};
        double[] balances = {5.6 , 15 , 23.6};
        boolean[] doTheyLikeJava = {false, true , true};

        System.out.println(Arrays.toString(studentsName));

        System.out.println(studentsName[0]);
        System.out.println(studentsName[1]);
        System.out.println(studentsName[2]);

        studentsName[1] = "Naim Abdullah";
        System.out.println(Arrays.toString(studentsName));

        System.out.println(studentsName[0] + "'s age is " + ages[0] + " and his fav char is " + favCharacters[0] + ".");
        System.out.println(studentsName[1] + "'s age is " + ages[1] + " and his fav char is " + favCharacters[1] + ".");
        System.out.println(studentsName[2] + "'s age is " + ages[2] + " and his fav char is " + favCharacters[2] + ".");

        for (int i = 0; i <= 2; i++) {
            System.out.println(studentsName[i] + "'s age is " + ages[i] + " and his fav char is " + favCharacters[i] + ".");

        }



    }
}
