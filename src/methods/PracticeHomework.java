package methods;

public class PracticeHomework {
    public static void main(String[] args) {

        System.out.println("---------- Task-1 ----------\n");

        String t1_str = null;
        if (t1_str.length() == 0) System.out.println("Length is zero");
        else{
            System.out.println("Length is = " + t1_str.length());
            System.out.println("First char is = " + t1_str.charAt(0));
            System.out.println("Last char is = " + t1_str.charAt(t1_str.length()-1));
            if(t1_str.contains("a") || t1_str.contains("A") || t1_str.contains("e") || t1_str.contains("E") ||
                    t1_str.contains("i") || t1_str.contains("I") || t1_str.contains("o") || t1_str.contains("O") ||
                    t1_str.contains("u") || t1_str.contains("U")){
                System.out.println("This String has vowel");
            }
            else System.out.println("This String does not have vowel");
        }
    }
}
