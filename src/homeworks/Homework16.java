package homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework16 {

    public static int countWords(String str) {
        int countWords = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') countWords++;
        }
        return countWords + 1;
    }

    public static int countA(String str) {
        int countA = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.toLowerCase().charAt(i) == 'a') countA++;
        }
        return countA;
    }

    public static int countPos(ArrayList<Integer> positiveNums) {
        int countPos = 0;
        for (Integer positiveNum : positiveNums) {
            if (positiveNum > 0) countPos++;
        }
        return countPos;
    }

    public static ArrayList<Integer> removeDuplicateNumbers(ArrayList<Integer> task4List) {
        ArrayList<Integer> finalList = new ArrayList<>();
        for (Integer element : task4List) {

            if (!finalList.contains(element)) finalList.add(element);
        }
        return finalList;
    }

    public static ArrayList<String> removeDuplicateElements(ArrayList<String> task5List) {
        ArrayList<String> newList = new ArrayList<>();

        for (String element : task5List) {
            if (!newList.contains(element)) newList.add(element);
        }
        return newList;
    }

    public static String removeExtraSpaces(String str) {
        String[] split = str.trim().split(" ");
        String container = "";
        for (String element : split) {
            if (!element.isEmpty()) container += element + " ";
        }
        return container.trim();
    }

    public static int[] add(int[] array1, int[] array2) {
        int[] finalArray = new int[Math.max(array1.length, array2.length)];
        if (array1.length >= array2.length) finalArray = array1;
        else finalArray = array2;
        for (int i = 0; i < Math.min(array1.length, array2.length); i++) {
            finalArray[i] = array1[i] + array2[i];

        }
        return finalArray;

    }

    public static int findClosestTo10(int[] array) {
        Arrays.sort(array);
        int small = Integer.MIN_VALUE;
        int big = Integer.MAX_VALUE;

        for (int element : array) {
            if(element < 10 && element > small) small = element;
            else if(element > 10 && element < big) big = element;
        }
        if(10 - small <= big - 10) return small;
        return big;
    }
}



















