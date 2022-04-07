package arrays;



public class _09_Practice_Find_First_Even_Odd {
    public static void main(String[] args) {

        int[] numbers = {0, 5, 3, 2, 4, 7, 10};

        boolean isFirstEvenFound = false;
        boolean isFirstOddFound = false;
        int firstEven = 1;

        for (int element : numbers) {
            if(element % 2 == 0 && !isFirstEvenFound) {
                isFirstEvenFound = true;
                System.out.println("First Even = " + element);
                firstEven = element;

            }
            else if(!isFirstOddFound){
                isFirstOddFound = true;
                System.out.println("First Odd = " + element);
            }
            if(isFirstEvenFound && isFirstOddFound) break;
        }

    }
}
