package homeworks;
import java.util.Scanner;

import utilities.ScannerHelper;

public class Practice01 {
    public static void main(String[] args) {

        System.out.println("-----TASK 1-----");

        String str = "SDLC is step by step procedure to create an application";

        int size1 = str.length();

        str.indexOf("SDLC");
        str.indexOf("application");

        System.out.println(size1);
        System.out.println(str.indexOf("SDLC"));
        System.out.println(str.indexOf("application"));

        System.out.println("-----TASK 2-----");

        String str2 = "  I know how to code with Python  ";

        System.out.println(str2.trim().replace("Python" , "Java").toUpperCase());

        System.out.println("-----TASK 3-----");

        String str3 = "    SDLC has planning, design, development, testing, deployment and maintenance phases   ";

        System.out.println(str3.trim().charAt(0));
        System.out.println(str3.trim().charAt(str3.trim().length()-1));


        System.out.println("-----TASK 4-----");

        String s1 = "  TECH ".trim().replace("ECH", "ech");
        String s2 = " glo  ".trim().replace('g', 'G');
        String s3 = " BAL       ".trim().replace("BAL", "bal");
        String s4 = s1 + s2 + s3;

        System.out.println(s4);

        System.out.println("-----TASK 5-----");
        Scanner userInput = new Scanner(System.in);
        String color = userInput.nextLine();

        System.out.println("Enter your favorite color");

        System.out.println("1st character is = " + color.charAt(0));
        System.out.println("First 3 characters are = " + color.substring(0 , 3));
        System.out.println("Last 3 characters are = " + color.substring(color.length()-3));


        System.out.println("-----TASK 6-----");

        String sentence = ScannerHelper.getAStringFromUser().toLowerCase();

        System.out.println("1st word is = " + sentence.substring(0 , sentence.indexOf(' ')));
        System.out.println("2nd word is = " + sentence.substring(sentence.lastIndexOf(' ') + 1));


        System.out.println("-----TASK 7-----");

        String sentence2 = ScannerHelper.getAStringFromUser();

        if(sentence2.contains("$")){
            System.out.println("This sentence contains $ character \n $ character's index is = " + sentence2.indexOf('$'));
        }else System.out.println("This sentence does not contain $ character");










    }


}
