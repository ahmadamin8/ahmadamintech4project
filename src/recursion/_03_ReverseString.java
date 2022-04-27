package recursion;

public class _03_ReverseString {

    public static void main(String[] args) {

        System.out.println(reversedString("Apple"));
    }

    public static String reversedString(String str){
        if(str.isEmpty()) return str;
        return reversedString(str.substring(1)) + str.charAt(0);
    }
}
