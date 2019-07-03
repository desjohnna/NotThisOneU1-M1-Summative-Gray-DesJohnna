import java.util.Scanner;

public class ValidNumber {

//Ask user for number and run method. (I could have run in the main but wanted to practice methods)
    public static void main(String[] args) {
        System.out.println("Please enter a number between 1 - 10.");
        validNum();

    }

    //Set up scanner to receive the input and store number ina variable
    public static void validNum() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        boolean x = false;

        while (x == false) {
            if (num < 1 || num > 10) {
                System.out.println("You must enter a number between 1 and 10, please try again.");

                num = scanner.nextInt();
            } else {

                System.out.println(num);
                x = true;

            }


        }
    }


}


