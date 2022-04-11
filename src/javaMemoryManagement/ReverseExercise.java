package javaMemoryManagement;

public class ReverseExercise {

        public static String reverse1(String s){
            String r = "";
            for (int i = s.length()-1; i >= 0 ; i--) {
                r+= s.charAt(i);
            }
            return r;
        }

        public static String reverse2(String str){
            StringBuilder sb = new StringBuilder(str);

            sb.reverse();

            return sb.toString();
        }

        public static boolean isPalindrome(String s){
            return  s.equals(new StringBuilder(s).reverse().toString());
        }
}


