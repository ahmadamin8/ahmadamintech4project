package methods;

import utilities.MathHelper;
import utilities.RandomNumberGenerator;

public class FindIfNumberIsEvenOrOdd {
    public static void main(String[] args) {

        int random1 = RandomNumberGenerator.getRandomNumber(17 , 33);
        System.out.println("The random number is = " + random1);

        if(MathHelper.isEven(random1)){
            System.out.println("The number generated is EVEN");
        }
        else{
            System.out.println("The number generated is ODD");
        }







    }
}
