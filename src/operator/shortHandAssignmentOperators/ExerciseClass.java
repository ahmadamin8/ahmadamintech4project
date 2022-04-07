package operator.shortHandAssignmentOperators;

public class ExerciseClass {
    public static void main(String[] args) {

        int a = 8;
        int b=3;

        a += b;
        System.out.println(a); //--> 11

        a -= b;
        System.out.println(a); // --> 8

        a *= b;
        System.out.println(a); // --> 24

        a /=b;
        System.out.println(a); // --> 8

        a %=b;
        System.out.println(a); // --> 2



    }
}
