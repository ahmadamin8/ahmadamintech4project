package methods;

import utilities.Calculator;

public class TestingCalculator {
    public static void main(String[] args) {
        int i1 = 15, i2 = 2;

       int result = Calculator.divide(i1, i2); // returns an int

        System.out.println(result); // 7

        double d1 = 15, d2 = 2;

       double result2 = Calculator.divide(d1, d2); // returns a double

        System.out.println(result2);

        Introduction.introduce("Amin", "Engineer", 22, "Books");
    }
}
