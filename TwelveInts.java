/**
 * Created by tony on 29/08/2016.
 */
public class TwelveInts {

    public static void main(String[] args) {

        int array [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        for(int i = 0; i < array.length; ++i){
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for(int i = array.length - 1; i >= 0; --i){
            System.out.print(array[i] + " ");
        }
    }
}
