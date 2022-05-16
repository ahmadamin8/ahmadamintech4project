package homeworks;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Homework18 {


    //1
    public static String noSpace (String str){

        return str.replace(" ", "");
    }
    //2
    public static String replaceFirstLast (String str){
        if(str.length() < 2) return str;

        char[] charArray = str.toCharArray();

        char replace = charArray[0];
        charArray[0] = charArray[charArray.length-1];
        charArray[charArray.length-1] = replace;

        return String.valueOf(charArray);
    }
    //3
    public static boolean hasVowel (String str){
        return str.toLowerCase().contains("a") || str.toLowerCase().contains("e") ||
                str.toLowerCase().contains("i") || str.toLowerCase().contains("o") ||
                str.toLowerCase().contains("u");
    }
    //4
    public static void checkAge(int age) {
        Date thisYear = new Date();
        SimpleDateFormat year = new SimpleDateFormat("yyyy");
        if (Integer.parseInt(year.format(thisYear)) - age < 16) System.out.println("AGE IS NOT ALLOWED");
        else if (Integer.parseInt(year.format(thisYear)) - age > 100) System.out.println("AGE IS NOT VALID");
        else System.out.println("AGE IS ALLOWED");
    }
    //5
    public static int averageOfEdges(int a, int b, int c){
        int max = (Math.max(Math.max(a, b), c));
        int min = (Math.min(Math.min(a, b), c));

        return (max + min) / 2;
    }
    //6
    public static String[] noA(String[] strArr){
        for (int i = 0; i < strArr.length; i++) {
            if(strArr[i].toLowerCase().startsWith("a")) strArr[i] = "###";
        }
        return strArr;
    }
    //7
    public static int[] no3or5(int[] numbers){
        for (int element : numbers) {
            if(element % 15 == 0) element = 101;
            else if(element % 3 == 0) element = 100;
            else if(element % 5 == 0) element = 99;
        }
        return numbers;
    }
    //8
    public static int countPrimes(int[] numbers) {
        int count = 0;
        for (int num : numbers) {
            if (num < 2) continue;
            boolean isPrime = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) isPrime = false;
                break;
            }
            if (isPrime) count++;
        }
        return count;
    }






}
