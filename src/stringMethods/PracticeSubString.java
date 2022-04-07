package stringMethods;
import utilities.ScannerHelper;

import java.util.Scanner;

public class PracticeSubString {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        String sentence = ScannerHelper.getAStringFromUser();

        String first = sentence.substring(0,sentence.indexOf(' '));

        String last = sentence.substring(sentence.lastIndexOf(' ') + 1);

        System.out.println("first word = " + first);

        System.out.println("last word = " + last);

    }
}
