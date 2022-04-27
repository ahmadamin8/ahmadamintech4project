package exceptions;

public class UnderstandingException {
    public static void main(String[] args) {

        String name = "John"; // 0,1,2,3

        try{
            System.out.println(name.charAt(10));
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("An exception is here!!!");
        }

        System.out.println("End of the program!");
    }
}
