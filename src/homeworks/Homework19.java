package homeworks;

import java.util.Arrays;

public class Homework19 {

    //1
    public static String noDigit(String str) {
        return str.replaceAll("[0-9]", "");

    }

    //2
    public static String noVowel(String str) {
        return str.replaceAll("[aeiouAEIOU]", "");
    }

    //3
    public static int sumOfDigits(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) sum += i;
        }
        return sum;
    }

    //4
    public static boolean hasUpperCase(String str) {
        char c;
        boolean containsUpper = false;
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                containsUpper = true;
            }
        }
        return containsUpper;
    }

    //5
    public static int middleInt(int a, int b, int c) {
        int[] nums = {a, b, c};
        Arrays.sort(nums);
        return nums[1];
    }

    //6
    public static int[] no13(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) nums[i] = 0;
        }
        return nums;
    }

    //7
    public static int[] arrFactorial(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) numbers[i] = 1;
            else {
                int fact = 1;
                for (int j = 1; j <= numbers[i]; j++) {
                    fact *= j;
                }
                numbers[i] = fact;
            }
        }
        return numbers;
    }

    //8
    public static String[] categorizeCharacters(String str){
        String[] strArray = {"", "", ""};
        for (int i = 0; i < str.length(); i++) {
            if(Character.isWhitespace(str.charAt(i))) continue;
            else if(Character.isLetter(str.charAt(i))) strArray[0] += str.charAt(i);
            else if(Character.isDigit(str.charAt(i))) strArray[1] += str.charAt(i);
            else if(!Character.isLetterOrDigit(str.charAt(i))) strArray[2] += str.charAt(i);
        }
        return strArray;
    }
}





