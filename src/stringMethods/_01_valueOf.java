package stringMethods;

public class _01_valueOf {
    public static void main(String[] args) {
        /*
        Method Task: Convert given variable to a String
        -it is static - you can call it with class name
        -it is return type, and it returns a String
        -It takes different arguments, and it is an overloaded method and converts given args to a string
         */

        int i = 5;

        String num = String.valueOf(i); // num = 5 static bc calling class name

        System.out.println(i+i); // 10
        System.out.println(num + num);// 55
    }
}
