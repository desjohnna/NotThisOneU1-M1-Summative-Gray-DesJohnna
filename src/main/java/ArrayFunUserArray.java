import java.util.Arrays;
import java.util.Scanner;

public class ArrayFunUserArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] intArray = new int[5];

        for(int i = 0; i < intArray.length; i++) {
            intArray[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(intArray));


        {


        }


    }
}