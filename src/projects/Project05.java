package projects;

import utilities.RandomNumberGenerator;
import utilities.ScannerHelper;
import utilities.StringHelper;

import java.util.Scanner;

public class Project05 {
    public static void main(String[] args) {

       System.out.println("-----TASK 1-----");

       String task1String = ScannerHelper.getAStringFromUser();

       String firstTask1 = task1String.substring(0 , 4);
       String middleTask1 = task1String.substring(4,task1String.length()-4);
       String secondTask1 = task1String.substring(task1String.length()-4);
       if(task1String.length() >= 8){
       System.out.println(secondTask1.concat(middleTask1).concat(firstTask1));

        }else System.out.println("This string does not have 8 characters");

        System.out.println("-----TASK 2-----");

        String task2String = ScannerHelper.getAStringFromUser();
        if(task2String.trim().contains(" ")){
        String task2First = task2String.substring(0 , task2String.indexOf(32));
        String task2Middle = task2String.substring(task2String.indexOf(32) , task2String.lastIndexOf(32) +1);
        String task2Last = task2String.substring(task2String.lastIndexOf(32) +1);
        System.out.println(task2Last.concat(task2Middle).concat(task2First));

        }else System.out.println("This sentence does not have 2 or more words to swap");

        System.out.println("-----TASK 3-----");

        String str1 = "These books are so stupid";
        String str2 = "I like idiot behaviors";
        String str3 = "I had some stupid t-shirts in the past and also some idiot look shoes";

        System.out.println(str1.replace("stupid" , "nice"));
        System.out.println(str2.replace("idiot" , "nice"));
        System.out.println(str3.replace("stupid" , "nice").replace("idiot" , "nice"));

        System.out.println("-----TASK 4-----");
        String task4Name = ScannerHelper.getAStringFromUser();

        int length = task4Name.length();

        if(length < 2) System.out.println("Invalid input!!!");
        else{
            System.out.println(StringHelper.getMiddle(task4Name));
        }

        System.out.println("-----TASK 5-----");

        String task5Country = ScannerHelper.getAStringFromUser();

        int task5Length = task5Country.length();

        if(task5Length < 5) System.out.println("Invalid input!!!");
        else{
            System.out.println(task5Country.substring(2 , task5Country.length()-2));
        }

        System.out.println("-----TASK 6-----");

        String s1 = ScannerHelper.getAStringFromUser();
        System.out.println(s1.replace('a' , '*').replace('A' , '*')
                .replace('e' , '#' ).replace('E' , '#')
                .replace('i' , '+' ).replace('I' , '+')
                .replace('u' , '$' ).replace('U' , '$')
                .replace('o' , '@' ).replace('O' , '@'));

        System.out.println("-----TASK 7-----");

        int random1 = (RandomNumberGenerator.getRandomNumber(0 , 25));
        int random2 = (RandomNumberGenerator.getRandomNumber(0 , 25));
        System.out.println("First random number is = " + random1);
        System.out.println("Second random number is = " + random2);

        for(int i = random1; i <= random2; i++) {
            if (i % 5 != 0) {
                System.out.println(i);
            }
        }
        for(int i = random2; i <= random1; i++){
            if(i % 5 != 0){
                System.out.println(i);
            }


        }





    }
}
