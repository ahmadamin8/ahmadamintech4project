package exceptions;

public class Example02 {
    public static void main(String[] args) {

        int number = 45;

        System.out.println("Hello World");

        try{
            System.out.println(number / 0);

            System.out.println("abc".charAt(15));
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("End of the program!");
    }
}
