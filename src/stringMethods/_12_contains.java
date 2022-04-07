package stringMethods;
import utilities.ScannerHelper;

import java.util.Locale;
import java.util.Scanner;

public class _12_contains {
    public static void main(String[] args) {


//        String s = "Good Morning";
//        System.out.println(s.contains("Good"));
//        System.out.println(s.contains(""));
//        System.out.println(s.contains("123"));
//        System.out.println(s.contains(s));

        String address = ScannerHelper.getAStringFromUser();

        System.out.println(address.toLowerCase().contains("chicago") ? "You are in the club" : "You are not in the club");






    }
}
