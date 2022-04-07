package stringMethods;

public class _13_replace {
    public static void main(String[] args) {

//        String str = "TechGlobalo";
//
//        String capitalizeAllOLetters = str.replace('o', 'O');
//
//        String removeTech = str.replace("Tech", "");
//        System.out.println(capitalizeAllOLetters);

        String sentence = "Can I have a can?";

        System.out.println(sentence.replace("can" , "xxx"));

        String s = "banana";
        System.out.println(s.replace('a' , '$'));

        String name = "John";
        System.out.println(name.replaceFirst("o" , "ooo"));

        System.out.println("Hello".replace("good" , "nice"));


    }
}
