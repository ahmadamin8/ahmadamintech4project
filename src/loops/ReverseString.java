package loops;

import utilities.ScannerHelper;

public class ReverseString {
    public static void main(String[] args) {

        String name = ScannerHelper.getAStringFromUser();

        String reversedName = "";

        for(int i = name.length()-1; i >= 0; i--){
            reversedName += name.charAt(i);
        }
        System.out.println("The reversed name = " + reversedName);
        System.out.println("The reversed name to uppercase = " + reversedName.toUpperCase());











    }
}
