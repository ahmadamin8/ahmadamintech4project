package stringMethods;

import utilities.StringHelper;

public class PracticeFindMiddle {
    public static void main(String[] args) {
        String name1 = "Taylor";
        String name2 = "Alona";

        System.out.println(StringHelper.getMiddle(name1));
        System.out.println(StringHelper.getMiddle(name2));
        System.out.println(StringHelper.getMiddle("Kaly"));
        System.out.println(StringHelper.getMiddle("Guluzar"));
        System.out.println(StringHelper.getMiddle("Alexandr"));
    }
}
