package homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework20 {

    //1
    public static boolean hasLowerCase(String str){
        for (int i = 0; i < str.length(); i++) {
            if(Character.isLowerCase(str.charAt(i)))
                return true;
            break;
        }
        return false;
    }

    //2
    public static ArrayList<Integer> noZero(ArrayList<Integer> nums){
        ArrayList<Integer> newArrayList = new ArrayList<>();
        for (Integer element : nums) {
            if(element != 0) newArrayList.add(element);
        }
        return newArrayList;
    }

    //3
    public static int[][] numberAndSquare(int[] nums){
        int[][] squaredNums = new int[nums.length][2];
        for (int i = 0; i < nums.length ; i++) {
            squaredNums[i][0] = nums[i];
            squaredNums[i][1] = nums[i] * nums[i];
        }
        return squaredNums;
    }


    //4
    public static boolean containsValue(String[] strArray, String str){
        for (String element : strArray) {
            if(element.equals(str)) return true;
            break;
        }
        return false;
    }


    //5
    public static String reverseSentence(String str){
        String[] tempStringArray = str.split(" ");
        if(tempStringArray.length < 2) return "There is not enough words!";
        else{
            tempStringArray[0] = (tempStringArray[0].charAt(0) + "").toLowerCase() + tempStringArray[0].substring(1);
            tempStringArray[tempStringArray.length-1] = (tempStringArray[tempStringArray.length-1].charAt(0) + "").toUpperCase() + tempStringArray[tempStringArray.length-1].substring(1);
            String reversedString = "";
            for (int i = tempStringArray.length - 1; i >= 0 ; i--) {
                reversedString += tempStringArray[i] + " ";
            }
            return reversedString.substring(0, reversedString.length()-1);
        }
    }


    //6
    public static String removeStringSpecialsDigits(String str){
        return str.replaceAll("[^a-zA-z ]", "");
    }


    //7
    public static String[] removeArraySpecialsDigits(String[] stringArray){
        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = stringArray[i].replaceAll("[^a-zA-z ]", "");
        }
        return stringArray;
    }


    //8
    public static ArrayList<String> removeAndReturnCommons(ArrayList<String> firstList, ArrayList<String> secondList){
        ArrayList<String> newList = new ArrayList<>();
        for (int i = 0; i < firstList.size(); i++) {
            for (int j = 0; j < secondList.size(); j++) {
                if(!newList.contains(firstList.get(i)) && firstList.get(i).equals(secondList.get(j)))
                    newList.add(firstList.get(i));
            }
        }
        return newList;
    }


    //9
    public static ArrayList<String> noXInVariables(ArrayList<String> str){
        ArrayList<String> newArray = new ArrayList<>();
        for (String element : newArray) {
            if(!element.toLowerCase().equals("x")){
                element = element.replaceAll("[xX]", "");
                newArray.add(element);
            }
        }
        return newArray;
    }

    public static void main(String[] args) {

        System.out.println(hasLowerCase("AHMAD"));

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0);
        arr.add(3);
        arr.add(0);
        arr.add(0);
        arr.add(5);
        System.out.println(noZero(arr));

        System.out.println(Arrays.deepToString(numberAndSquare(new int[]{1,4})));

        System.out.println(containsValue(new String[]{"Hello", "abc", "123"}, "Abc"));

        System.out.println(reverseSentence("Hello World how are you"));

        System.out.println(removeStringSpecialsDigits("Selenium 123#$%Cypress"));

        System.out.println(Arrays.toString(removeArraySpecialsDigits(new String[]{"123Java", "#$%is", "fun"})));

        ArrayList<String> strArr = new ArrayList<>();
        strArr.add("Java");
        strArr.add("is");
        strArr.add("fun");
        strArr.add("fun");
        ArrayList<String> strArr2 = new ArrayList<>();
        strArr2.add("fun");
        strArr2.add("abc");
        strArr2.add("lol");
        System.out.println(removeAndReturnCommons(strArr, strArr2));

        ArrayList<String> strArr3 = new ArrayList<>();
        strArr.add("Jaxva");
        strArr.add("fun");
        strArr.add("xXxX");
        strArr.add("fun");

        System.out.println(noXInVariables(strArr3));


    }
}

