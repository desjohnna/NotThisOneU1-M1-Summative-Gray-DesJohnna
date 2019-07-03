import java.util.Arrays;
import java.util.Scanner;

public class ArrayFun5Words {

    public static void main(String[] args) {
        //Setting up scanner
        Scanner scanner = new Scanner(System.in);

        //Creating a String array with 5 elements
        String[] stringArray = new String[5];

        //Incrementing the variable representing the elements in the array until it reaches the end of the full length of array
        for (int i = 0; i < stringArray.length; i++) {
            //storing the user input from scanner in the incrementing elements
            stringArray[i] = scanner.nextLine();
        }
        //printing the array
        System.out.println(Arrays.toString(stringArray));

    }
}







