package ifElseStatements.nestedIfStatements;

public class GoldNumber {
    public static void main(String[] args) {


        int point = 0;
        int random = (int) (Math.random() * 101) - 50;
        System.out.println(random);


        if (random > 0) {
            point += 10; // adding 10 points

            if (random > 25) {
                point += 10;
            } else if (random == 7)
                point += 100;

        }else if (random < 0)
            if (random < -25) {


            }else if (random == -7) {
                    point += 10;

            }
        System.out.println("Points is = " + point);

    }
            }









