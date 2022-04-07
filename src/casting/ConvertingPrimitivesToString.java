package casting;

public class ConvertingPrimitivesToString {
    public static void main(String[] args) {

        int num = 36;

        String numStr1 = 45 + num + ""; // 81
        String numStr2 = String.valueOf(num + 45);
        String numStr3 = String.valueOf(num) + String.valueOf(45);


        System.out.println("numStr1 = " + numStr1);
        System.out.println("numStr2 = " + numStr2);


        /*
        Assume David is going to save  $390 to buy a bicycle.
        David can save only $15.60 per day. How many days later,
        David can save $390 and buy the bicycle.

        Requirement:
        Write a java program to solve this problem given above

        Input:
        String save = 390;
        String day = 15.60;

        Expected Output:
        25
        */

        String save = "390";
        String day = "15.60";

        int saveInt = Integer.parseInt(save);
        double dayDouble = Double.parseDouble(day);

        System.out.println("It will take " + (int)(saveInt / dayDouble) + " days");



    }
}
