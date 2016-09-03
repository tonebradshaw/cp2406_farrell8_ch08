import java.lang.reflect.Array;

/**
 * Created by tony on 29/08/2016.
 */
public class ArrayMethodDemo {

    static int [] numbers = {1, 5, 31, 63, 104, 129, 38, 52, 83, 147};
    static int total = 0;

    public static void main(String[] args) {

        displayArrayInOrder();
        System.out.println();
        displayArrayInRevOrder();
        System.out.println();
        total = displayIntegerSum();
        displayValuesBelowEighty();
        System.out.println();
        displayValuesAboveAverage(total);
    }
    public static void displayArrayInOrder(){

        for(int i = 0; i < numbers.length; ++i)
        System.out.print(numbers[i] + " ");
    }
    public static void displayArrayInRevOrder(){

        for(int i = numbers.length - 1; i >= 0; --i)
            System.out.print(numbers[i] + " ");
    }
    public static int displayIntegerSum(){

        for(int i = 0; i < numbers.length; ++i) {

            total += numbers[i];
        }
        System.out.println("The sum of the integers is: " + total);
        return total;
    }
    public static void displayValuesBelowEighty(){

        for(int i = 0; i < numbers.length; ++i)
            if(numbers[i] < 80) {
                System.out.print(numbers[i] + " ");
            }
    }
    public static void displayValuesAboveAverage(int total){

        double average = total/10.0;

        for(int i = 0; i < numbers.length; ++i)
            if(numbers[i] > average) {
                System.out.print(numbers[i] + " ");
            }
    }
}
