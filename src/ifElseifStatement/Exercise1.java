package ifElseifStatement;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Exercise1 {
    public static void main(String[] args) {

        int random1 = (int) (Math.random() * 21) - 10;
        System.out.println(random1);

        if (random1 > 0){
            System.out.println("number is POSITIVE!");
        }
        if(random1 < 0){
            System.out.println("number is NEGATIVE!");

        }
        if (random1 == 0) {
            System.out.println("number is ZERO!");
        }

        if (random1 < 0) {
            System.out.println("number is NEGATIVE!");
        }else if(random1 > 0) {
            System.out.println("number is POSITIVE!");
        }else{
            System.out.println("number is ZERO!");
        }




        }
    }


