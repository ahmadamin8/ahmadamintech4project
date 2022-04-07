package arrays;


public class _06_Additional_Interview_Questions {
    public static void main(String[] args) {

        System.out.println("-----TASK 1-----");

        int[] numbers = {5 , 3 , 0 , -5};

        int maxNum = numbers[0];

        for (int number : numbers) {
            if(number > maxNum)
                maxNum = number;
            
        }
        System.out.println(maxNum);


        System.out.println("-----TASK 2-----");


        double[] numbers2 = {2.5, 9 , 10.25 , 0.5 , 1.5 , 10.25};

        double minDouble = numbers2[0];

        for (double element : numbers2) {
            if(element < minDouble)
                minDouble = element;

        }
        System.out.println(minDouble);


        System.out.println("-----TASK 3-----");

        double minValue2 = Double.MAX_VALUE;

        for (double number : numbers2) {
            if(number == minDouble) continue;
            else if(number < minValue2) minValue2 = number;

        }
        System.out.println(minValue2);


        }

    }

