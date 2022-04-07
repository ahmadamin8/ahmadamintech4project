package operator;

public class ShorthandAssignmentOperators {
    public static void main(String[] args) {

        int johnsAge = 5;

       // int johnsFutureAge = johnsAge + 5;

      //  johnsAge = johnsAge + 5;

        johnsAge += 5;

        System.out.println(johnsAge);

        String name = "ALex";

        name += "an";
        name += "d";
        name += "e";
        name += "r";


        System.out.println(name);
    }
}
