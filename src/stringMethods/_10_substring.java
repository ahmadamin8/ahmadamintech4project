package stringMethods;

public class _10_substring {
    public static void main(String[] args) {


        String result = "About 3,520,000,000 results (0.82 seconds)";

        String num = result.substring(6, 19);

        System.out.println(num);

        //use the substring method to get "(0.82 seconds)"

        String num2 = result.substring(28);
        System.out.println(num2);
    }
}
