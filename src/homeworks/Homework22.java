package homeworks;

import java.util.*;

public class Homework22 {

    //Task 1

    public static int[] fibonacciSeries1(int num){
        int firstNum = 0, secondNum = 1, sum;
        int[] fibo = new int[num];

        for (int i = 0; i < num ; i++) {

            fibo[i] = firstNum;
            sum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = sum;
        }
        return fibo;
    }

    //Task 2

    public static int fibonacciSeries2(int num){
        int firstNum = 0, secondNum = 1, sum;
        int[] fibo = new int[num];

        for (int i = 0; i < num ; i++) {

            fibo[i] = firstNum;
            sum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = sum;
        }
        return fibo[num - 1];
    }

    //Task 3

    public static int[] findUniques(int[] arr1, int[] arr2){
        LinkedHashSet<Integer> firstSet = new LinkedHashSet<>();
        LinkedHashSet<Integer> secondSet = new LinkedHashSet<>();

        for(int firstNum: arr1) firstSet.add(firstNum);
        for(int secondNum: arr2) secondSet.add(secondNum);

        List<Integer> allLists = new ArrayList<>(firstSet);
        allLists.addAll(secondSet);

        List<Integer> duplicatedList = new ArrayList<>();

        for (int i = 0; i < allLists.size() - 1; i++) {
            for (int j = i + 1; j < allLists.size(); j++) {
                if(Objects.equals(allLists.get(i), allLists.get(j))){
                    duplicatedList.add(allLists.get(i));
                    duplicatedList.add(allLists.get(j));
                }
            }
        }
        allLists.removeAll(duplicatedList);

        int[] result = new int[allLists.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = allLists.get(i);
        }
        return result;
    }

    //Task 4

    public static boolean isPowerOf3(int num){
        if(num < 1){
            return false;
        }
        while(num % 3 == 0){
            num /= 3;
        }
        return num == 1;
    }

    //Task 5

    public static int firstDuplicate(int[] array){
        int answer = 0;
        if(array.length == 0) return -1;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == array[i + 1]){
                answer = array[i];
                break;
            } else answer = -1;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println("\n---Task 1---\n" + Arrays.toString(fibonacciSeries1(5)));
        System.out.println("\n---Task 2---\n" + fibonacciSeries2(7));
        System.out.println("\n---Task 3---\n" + Arrays.toString(findUniques(new int[]{1, 2, 3, 4}, new int[]{2, 3, 4, 5})));
        System.out.println("\n---Task 4---\n" + isPowerOf3(15));
        System.out.println("\n---Task 5---\n" + firstDuplicate(new int[]{2,4,8,2,24}));
    }
}
