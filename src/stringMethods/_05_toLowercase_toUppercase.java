package stringMethods;

public class _05_toLowercase_toUppercase {
    /*
    Method Task: These methods are used to convert letters of a String to uppercase or lowercase
    -They are non-static methods that you can call them with objects of String class
    -They are return type methods, and they return the modified String object break
    -They don't take any argument
     */
    public static void main(String[] args) {
        String s1 = "HELLO world 10$";

        System.out.println(s1); // HELLO world
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());

        String sentence = "I paid $100.99 to buy airpods";

        String s2 = sentence.toLowerCase(); // i paid $100.99 to buy airpods
        String s3 = sentence.toUpperCase(); // I PAID $100.99 TO BUY AIRPODS

        System.out.println(s3.toUpperCase().toUpperCase().toLowerCase());

    }
}
