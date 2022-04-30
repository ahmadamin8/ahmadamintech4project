package date_practices;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UnderstandingDateFormat {
    public static void main(String[] args) {

        Date currentDate = new Date();

        System.out.println(currentDate); // Sat Apr 30 10:15:18 CDT 2022

        // MM/dd/yyyy   04/30/2022

        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        System.out.println("Today is = " + sdf.format(currentDate));


        System.out.println("---Task 1---");

        SimpleDateFormat task1 = new SimpleDateFormat(("EEE hh:mm a"));
        System.out.println(task1.format(currentDate));

        System.out.println(new SimpleDateFormat("EEEE").format(currentDate));
        System.out.println(new SimpleDateFormat("yyyy").format(currentDate));
        System.out.println(new SimpleDateFormat("hh").format(currentDate));


        System.out.println("---Task 2---");

        System.out.println(new SimpleDateFormat(""));



    }
}
