package operator.arithmeticOperators;

public class Exercise3 {
    public static void main(String[] args) {
        double avgSalary = 90_000.00;

        double monthlySal = avgSalary / 12;
        double biWeeklySal = avgSalary / 26;
        double weeklySal = avgSalary / 52;

        System.out.println("Monthly salary = " + monthlySal);
        System.out.println("Bi weekly = " + biWeeklySal);
        System.out.println("Weekly salary = " + weeklySal);

        /*
        An annual salary for an average sdet is 90k
         */


    }
}
