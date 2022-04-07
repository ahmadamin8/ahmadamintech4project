package casting;

public class ExerciseConvertingDataTypes {
    public static void main(String[] args) {

        /*
        Write a program which will take two numbers as a STRING and get the avg of them
        and print it out

        Input:
        String num1 = "23";
        String num2 = "25";

        Output:
        24
         */

        String num1 = "23";
        String num2 = "25";

        int num1Avg = Integer.parseInt(num1);
        int num2Avg = Integer.parseInt(num2);

        System.out.println("The average is = " + (num1Avg + num2Avg) / (2));
    }
}
