
import java.util.Arrays;

public class ArrayFunReverseIt {

    public static void main(String[] args) {
        int[] mainArray = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(mainArray));


        int[] nextArray = new int[5];
        System.out.println();
        int j = 0;

        for (int i = mainArray.length - 1; i >= 0; i--) {
            nextArray[j] = mainArray[i];
            j++;

        }
        System.out.println(Arrays.toString(nextArray));


    }
}
