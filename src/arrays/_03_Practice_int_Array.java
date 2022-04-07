package arrays;

import java.util.Arrays;

public class _03_Practice_int_Array {
    public static void main(String[] args) {

        System.out.println("-----TASK 1-----");

        int[] numbers = {-3 , -7 , 0, 2 , 0 , 7 , 7 , 10 , 2 ,15};
        System.out.println("Array not sorted = " + Arrays.toString(numbers));

        Arrays.sort(numbers);

        System.out.println("Array sorted = " + Arrays.toString(numbers));


        System.out.println("-----TASK 2-----");

        int countPositive = 0;
        int countNegative = 0;
        int countZeros = 0;
        for(int element: numbers){
            if(element > 0)  countPositive++;
            else if(element == 0) countZeros++;
            else if(element < 0) countNegative++;
        }
        System.out.println("Positives = " + countPositive);
        System.out.println("Negatives = " + countNegative);
        System.out.println("Zeros = " + countZeros);


        System.out.println("-----TASK 3-----");

        int countEven = 0;
        int countOdd = 0;
        for(int element2: numbers){
            if(element2 % 2 == 0) countEven++;
            else countOdd++;
        }
        System.out.println("Evens = " + countEven);
        System.out.println("Odd = " + countOdd);


        System.out.println("-----TASK 4-----");

        int countDoubleDigits = 0;

        for(int element3: numbers){
            if(element3 >= 10 && element3 < 99) countDoubleDigits++;
        }
        System.out.println(countDoubleDigits);
    }
}
