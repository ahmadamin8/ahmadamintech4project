package regex;

import java.util.regex.Pattern;

public class Quantifiers {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[a-z]+" , "hello"));//true --> contains 1 or more letters
        System.out.println(Pattern.matches("[a-zA-z]{3,}" , "hello class"));//false --> contains a space
        System.out.println(Pattern.matches("[A-Za-z0-9_-]{8,15}" , "TechGlobal"));
        System.out.println(Pattern.matches("\\([1-9]{3}\\)-[\\d]{3}-[\\d]{4}", "(123)-456-7890"));


    }
}
