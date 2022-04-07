package nestedIfStatements;

public class NumberPositiveAndOdd {
    public static void main(String[] args) {
        int point = 0;
        int n = (int) (Math.random() * 101) - 50;
        System.out.println(n);


        // if they CANNOT be present at the SAME time THEY ARE LINKED (use if elseif else)

        if (n > 0){
            point += 10;
            if (n > 25){
                point += 10;
            }else if(n==7){
                point += 100;
            }
        }else if(n < 0){
            if (n < -25){
                point += 0;
            }else if(n == -7){
                point += 10;
            }
        }else{
            point += 0;
        }
        System.out.println("Points = "+point);

    }
}
