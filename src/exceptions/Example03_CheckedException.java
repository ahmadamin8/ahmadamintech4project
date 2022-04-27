package exceptions;

public class Example03_CheckedException {
    public static void main(String[] args) throws InterruptedException {

//        try {
//            for (int i = 0; i < 10; i++) {
//                Thread.sleep(1000); // 2 seconds
//                System.out.println(i);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000); // 2 seconds
            System.out.println(i);
        }
        Thread.sleep(3000);
        System.out.println("End of the program!");
    }
}

