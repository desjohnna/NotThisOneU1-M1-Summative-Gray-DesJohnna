import java.util.Scanner;

public class ValidNumber {

//Ask user for number and run method. (I could have run in the main but wanted to practice methods)
    public static void main(String[] args) {
        System.out.println("Please enter a number between 1 - 10.");
        validNum();

    }

    //Set up scanner to receive the input and store number in variable num
    public static void validNum() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        //Setting a boolean to turn my while statement on and off with.
        boolean x = false;

        while (x == false) {

            //If the number is not with 1-10 then tell them to try again.
            if (num < 1 || num > 10) {
                System.out.println("You must enter a number between 1 and 10, please try again.");

                //Set num to equal next int input by user
                num = scanner.nextInt();
            } else {
                //Or else, print out the number and change the while statement variable x to true, stopping while loop
                System.out.println(num);
                x = true;

            }


        }
    }


}


