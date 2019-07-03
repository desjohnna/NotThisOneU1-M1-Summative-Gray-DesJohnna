
import java.util.Arrays;

public class ArrayFunReverseIt {

    public static void main(String[] args) {

        //Creating in array and giving it values
        int[] mainArray = {1, 2, 3, 4, 5};

        //Printing mainArray
        System.out.println(Arrays.toString(mainArray));

        //Creating a new array with no values but 5 elements
        int[] nextArray = new int[5];

        //Naming a variable to represent the nextArray elements
        int j = 0;

        //for loop to increment the mainArrays elements from
        // the last element to the first and setting each to equal the opposite of that with the nextArray
        for (int i = mainArray.length - 1; i >= 0; i--) {
            nextArray[j] = mainArray[i];
            j++;

        }
        //Print the new array
        System.out.println(Arrays.toString(nextArray));


    }
}
