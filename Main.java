
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Test your program here
        int[] array = {-3, 2, 3, 4, 7, 8, 12};
        Scanner reader = new Scanner(System.in);

        System.out.print("Numbers in the array " + Arrays.toString(array));
        System.out.println();

        System.out.print("Enter searched number: ");
        String number = reader.nextLine();
        System.out.println();

        boolean tulos = BinarySearch.search(array, Integer.parseInt(number));

        // Print here the result
        
        System.out.println(tulos);
    }
}
