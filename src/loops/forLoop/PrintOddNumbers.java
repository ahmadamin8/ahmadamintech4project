package loops.forLoop;

import utilities.MathHelper;
import utilities.ScannerHelper;

public class PrintOddNumbers {
    public static void main(String[] args) {

        int givenNumberByUser = ScannerHelper.getNumberFromUser();
        for (int i = 1; i <= givenNumberByUser; i++) {
            if(i % 2 == 1) System.out.println(i);
        }
    }
}










