import java.util.Arrays;
import java.util.Scanner;

public class ArrayFunUserArray {

    public static void main(String[] args) {
        //Setting up scanner
        Scanner scanner = new Scanner(System.in);

        //Creating an array with 5 ints
        int[] intArray = new int[5];

        //for loop that gets input from user and inputs into array
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = scanner.nextInt();
        }

        //Print out array
        System.out.println(Arrays.toString(intArray));

    }
}