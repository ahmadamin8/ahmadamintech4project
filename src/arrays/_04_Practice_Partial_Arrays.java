package arrays;

public class _04_Practice_Partial_Arrays {
    public static void main(String[] args) {

        System.out.println("-----TASK 1-----");

        int[] numbers = {10 , -3 , -7 , 0 , 0 , 7 , 22};

        for (int number : numbers) {
            System.out.println(number);
        }


        System.out.println("-----TASK 2-----");

        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum);


        System.out.println("-----TASK 3-----");

        int sum2 = 0;

        for (int i = 0; i <= 2 ; i++) {
            sum2 += numbers[i];
        }
        System.out.println(sum2);


        System.out.println("-----TASK 4-----");

        int sum3 = 0;

        for (int i = numbers.length-5; i < numbers.length; i++) {
            sum3 += numbers[i];
        }
        System.out.println(sum3);


        System.out.println("-----TASK 5-----");
        int product = 1;

        for (int i = numbers.length-4; i < numbers.length; i++) {
            int number = numbers[i];
           if(number != 0) product += number;
        }
        System.out.println(product);


        System.out.println("-----TASK 6-----");

        boolean hasZero = false;

        for (int number : numbers) {
            if(number == 0){
                hasZero = true;
                break;
            }
        }
        System.out.println(hasZero);
    }
}
