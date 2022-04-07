package stringMethods;

import utilities.ScannerHelper;

public class Swap4WithLast4 {
    public static void main(String[] args) {

        String word = ScannerHelper.getAStringFromUser();

        if(word.length() < 8){
            System.out.println("This string does not have 8 characters");
        }
        else{
            String first4 = word.substring(0,4);
            String last4 = word.substring(word.length()-4);
            String middle = word.substring(4,word.length()-4);
            System.out.println(last4 + middle + first4);

        }
    }
}
