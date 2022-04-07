package loops;
import java.util.Scanner;

public class SumOfNumbersFromUser {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter how many numbers you want");
        int totalNumbers = userInput.nextInt();
        int sum = 0;

        for(int i = 1; i <= totalNumbers; i++){
            System.out.println("Please enter number " + i);
            sum += userInput.nextInt();
        }
        System.out.println("Sum of your numbers is = " + sum);

        System.out.println("Please enter how many numbers you want");
        int times = userInput.nextInt();

        int count = 1;
        int sum2 = 0;

        while(count <= times){
            System.out.println("Please enter number " + count);
            sum2 += userInput.nextInt();
            count++;
        }
        System.out.println("Sum of your number is = " + sum2);
    }
}



