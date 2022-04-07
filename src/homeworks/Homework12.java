package homeworks;

import utilities.CharacterHelper;
import utilities.StringHelper;

import java.util.Arrays;

public class Homework12 {
    public static void main(String[] args) {

        System.out.println("-----TASK 1-----");

        int[] numbers = new int[10];
        numbers[2] = 23;
        numbers[4] = 12;
        numbers[7] = 34;
        numbers[9] = 7;
        numbers[6] = 15;
        numbers[0] = 89;

        System.out.println(numbers[3]);
        System.out.println(numbers[0]);
        System.out.println(numbers[9]);
        System.out.println(Arrays.toString(numbers));


        System.out.println("-----TASK 2-----");

        String[] letters = new String[5];
        letters[1] = "abc";
        letters[4] = "xyz";

        System.out.println(letters[3]);
        System.out.println(letters[0]);
        System.out.println(letters[4]);
        System.out.println(Arrays.toString(letters));


        System.out.println("-----TASK 3-----");

        int[] task3Numbers = {23 , -34 , -56 , 0 , 89 , 100};

        System.out.println(Arrays.toString(task3Numbers));

        Arrays.sort(task3Numbers);

        System.out.println(Arrays.toString(task3Numbers));


        System.out.println("-----TASK 4-----");

        String[] countries = {"Germany" , "Argentina" , "Ukraine" , "Romania"};

        System.out.println(Arrays.toString(countries));

        Arrays.sort(countries);

        System.out.println(Arrays.toString(countries));


        System.out.println("-----TASK 5-----");

        String[] task5String = {"Scooby Doo" , "Snoopy" , "Blue" , "Pluto" , "Dino" , "Sparky"};

        boolean hasPluto = false;

        for(String element: task5String){
            if(element.equals("Pluto")){
                hasPluto = true;
                break;
            }
        }
        System.out.println(hasPluto);


        System.out.println("-----TASK 6-----");

        String[] task6String = {"Garfield" , "Tom" , "Sylvester" , "Azrael"};
        Arrays.sort(task6String);

        System.out.println(Arrays.toString(task6String));

        boolean hasGarAndFel = false;

        for(String element2: task6String){
            if(element2.contains("Garfield") && element2.contains("Felix")){
                hasGarAndFel = true;
                break;
            }
        }
        System.out.println(hasGarAndFel);


        System.out.println("-----TASK 7-----");

        double[] task7Double = {10.5 , 20.75 , 70 , 80 , 15.75};

        System.out.println(Arrays.toString(task7Double));
        System.out.println(task7Double[0]);
        System.out.println(task7Double[1]);
        System.out.println(task7Double[2]);
        System.out.println(task7Double[3]);
        System.out.println(task7Double[4]);


        System.out.println("-----TASK 8-----");

        char[] task8Char = {'A' , 'b' , 'G' , 'H' , '7' , '5' , '&' , '*' , 'e' , '@' , '4'};

        System.out.println(Arrays.toString(task8Char));

        int lettersTotal = 0;
        int upperCase = 0;
        int lowerCase = 0;
        int digits = 0;
        int special = 0;

        for(char element3: task8Char){
            if(element3 >= 65 && element3 <= 122) {
                lettersTotal++;
            }
            if(element3 >= 65 && element3 <= 90) {
                upperCase++;
            }else if(element3 >= 97 && element3 <= 122) {
                lowerCase++;
            }else if(element3 >= 48 && element3 <= 57) {
                digits++;
            }else special++;
            }
        System.out.println("Letters = " + lettersTotal);
        System.out.println("Uppercase letters = " + upperCase);
        System.out.println("Lowercase letters = " + lowerCase);
        System.out.println("Digits = " + digits);
        System.out.println("Special characters = " + special);


        System.out.println("-----TASK 9-----");

        String[] task9String = {"Pen" , "notebook" , "Book" , "paper" , "bag" , "pencil" , "Ruler"};
        System.out.println(Arrays.toString(task9String));
        int task9Upper = 0;
        int task9Lower = 0;
        int task9StartWithBOrP = 0;
        int task9BookOrPen = 0;
        for(String element4: task9String){
            if(CharacterHelper.isUppercase(element4.charAt(0))){
                task9Upper++;
            }
            else task9Lower++;

            if(element4.toLowerCase().charAt(0) == 'b' || element4.toLowerCase().charAt(0) == 'p') task9StartWithBOrP++;

            if(element4.toLowerCase().contains("book") || element4.toLowerCase().contains("pen")) task9BookOrPen++;
        }
        System.out.println("Elements start with uppercase = " + task9Upper);
        System.out.println("Elements start with lowercase = " + task9Lower);
        System.out.println("Elements starting with B or P  = " + task9StartWithBOrP);
        System.out.println("Elements having book or pen = " + task9BookOrPen);


        System.out.println("-----TASK 10-----");

        int[] task10Int = {3 , 5 , 7 , 10 , 0 , 20 , 17 , 10 , 23 , 56 , 78};
        System.out.println(Arrays.toString(task10Int));

        int moreThan10 = 0;
        int lessThan10 = 0;
        int equalTo10 = 0;

        for(int task10Element: task10Int){
            if(task10Element > 10) {
                moreThan10++;
            }else if(task10Element < 10) {
                lessThan10++;
            }else if(task10Element == 10) {
                equalTo10++;
            }

        }
        System.out.println("Elements that are more than 10 = " + moreThan10);
        System.out.println("Elements that are less than 10 = " + lessThan10);
        System.out.println("Elements that are 10 = " + equalTo10);


        System.out.println("-----TASK 11-----");

        int[] firstArray = {5 , 8 , 13 , 1 , 2};
        int[] secondArray = {9 , 3 , 67 , 1 , 0};

        int[] thirdArray = new int[5];

        for (int i = 0; i < thirdArray.length; i++) {
            if(firstArray[i] > secondArray[i]){
                thirdArray[i] = firstArray[i];
            }
            else thirdArray[i] = secondArray[i];
        }

        System.out.println("1st array is = " + Arrays.toString(firstArray));
        System.out.println("2nd array is = " + Arrays.toString(secondArray));
        System.out.println("3rd array is = " + Arrays.toString(thirdArray));
        System.out.println("End of the program!");

    }


    }




