package relationalOperators;

public class RelationOperators {
    public static void main(String[] args) {

        int a = 4;
        int b = 10;

        boolean isAEqualToB = a == b; // a is equal to b
        boolean isANotEqualToB = a != b; // a is not equal to b

        System.out.println("a = b : " + isAEqualToB);
        System.out.println("a != b : " + isANotEqualToB);

        boolean isAGreaterThanB = a > b;
        boolean isASmallerThanB = a < b;
        boolean isAGreaterThanOrEqualThanB = a >= b;
        boolean isASmallerThanOrEqualB = a <= b;

        System.out.println("a = b : " + isAEqualToB);
        System.out.println("a != b : " + isANotEqualToB) ;
        System.out.println("a >= b : " + isAGreaterThanOrEqualThanB);
        System.out.println("a <= b : " + isASmallerThanOrEqualB);




    }
}
