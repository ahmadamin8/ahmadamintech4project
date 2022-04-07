package arrays;

public class ForEachLoop {
    public static void main(String[] args) {

        char[] chars = {'A' , ' ' , '.' , '#' , 'T' , '6' , '9'};

        System.out.println(chars.length);


        System.out.println("-----TASK 1-----");

        for (int i = 0; i < chars.length; i++) {
            System.out.println("Element " + i + " is = " + chars[i]);
        }


        System.out.println("-----TASK 1 Second Way For Each Loop-----");

        for(char element: chars){
            System.out.println("Element is = " + element);
        }


    }
}
