package mathClass;

public class ExerciseMathRandom {
    public static void main(String[] args) {

        /*
        Random number from 45 to 98 and print them out
         */

    //    int random45And98Included = (int) (Math.random() * 54) + 45;
    //    System.out.println(random45And98Included);

       // System.out.println(
         //       (int)(Math.random() * 54) + 45
      //  );

    //    System.out.println(
             //   (int) (Math.random() * 19) + 67
      //  );
            //    (int random2) (Math.random() * 19) + 67
             //   );

                int random1 = (int)(Math.random() * 19 + 67);
                int random2 = (int)(Math.random() * 19 + 67);

        System.out.println("First number is = " + random1 +
                " Second number is = " + random2 +
                " Max of two numbers is = " +
                Math.max(random1, random2) +
                " Min of two numbers is = " +
                Math.min(random1, random2));
    }
}
