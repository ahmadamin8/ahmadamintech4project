package utilities;

import java.util.Arrays;

public class Project07 {

    public static void findGreatestAndSmallestWithSort(int[] num) {
        Arrays.sort(num);
        System.out.println("Smallest = " + num[0]);
        System.out.println("Greatest = " + num[num.length - 1]);

    }

    public static void findGreatestAndSmallest(int[] num) {

        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                int task2 = 0;
                if (num[i] > num[j]) {
                    task2 = num[i];
                    num[i] = num[j];
                    num[j] = task2;
                }
            }
        }
        System.out.println("Smallest  = " + num[0]);
        System.out.println("Greatest = " + num[num.length - 1]);

    }

    public static void findSecondGreatestAndSmallestWithSort(int[] num) {
        Arrays.sort(num);

        int min = num[0], secondSmallest = num[1];
        for (int i = 0; i < num.length; i++) {
            if (min != num[i]) {
                secondSmallest = num[i];
                break;
            }
        }
        int max = num[num.length - 1], secondGreatest = num[num.length - 2];
        for (int i = 0; i < num.length; i++) {
            if (max != num[i]) {
                secondGreatest = num[i];

            }
        }
        System.out.println("Smallest number = " + secondSmallest);
        System.out.println("Greatest number = " + secondGreatest);


    }

    public static void findSecondGreatestAndSmallest(int[] num){
        int min = Math.min(num[0], num[1]), secondSmallest = Math.max(num[0], num[1]);
        int max = Math.max(num[num.length-1], num[num.length - 2]), secondGreatest = Math.min(num[num.length-1], num[num.length - 2]);

        for (int number : num) {
            if(min != number){
                secondSmallest = number;
                break;
            }
        }
        for (int number : num) {
            if(max != number){
                secondGreatest = number;
            }
        }
        System.out.println("Second Smallest = " + secondSmallest);
        System.out.println("Second Greatest = " + secondGreatest);
    }

    public static void findDuplicatedElementsInAnArray(String[] duplicates) {
        String duplicate = "";
        for (int i = 0; i < duplicates.length; i++) {
            for (int j = i + 1; j < duplicates.length; j++) {
                if (duplicates[i].equals(duplicates[j]) && !duplicate.contains(duplicates[i])) {
                    System.out.println(duplicates[i]);
                    duplicate += duplicates[i];
                }
            }
        }
    }
    public static void findMostRepeatedElementsInAnArray(String[] repeated) {

        String element = "";
        int count = 0;
        for (int i = 0; i < repeated.length; i++) {
            String tempElement = repeated[i];
            int tempCount = 0;
            for (int j = 0; j < repeated.length; j++)
                if(repeated[j].equals(tempElement)) tempCount++;
                if(tempCount > count){
                    element = tempElement;
                    count = tempCount;
                }
            }
            System.out.println(element);
    }
}






