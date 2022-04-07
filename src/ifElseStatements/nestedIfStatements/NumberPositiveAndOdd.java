package ifElseStatements.nestedIfStatements;

public class NumberPositiveAndOdd {
    public static void main(String[] args) {

        int random1 = (int) (Math.random() * 101) - 50;
        System.out.println(random1);

        if (random1 > 0) {
            System.out.println("Number is positive");

            if (random1 % 2 != 0) {
                System.out.println("Number is positive and odd");

            }else{
                System.out.println("Number is positive and even");
            }

            }
            else{

        }



//        if (random1 < 0);
//        System.out.println("Number is negative");


    }
}
