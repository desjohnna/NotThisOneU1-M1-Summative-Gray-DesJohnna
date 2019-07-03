import java.util.Scanner;

public class MathConverterIf {

    public static void main(String[] args) {
        //Ask for a number
        System.out.println("Please enter a number between 1 - 12.");


        //Grab number and store it.
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        //Logic to match number to month and print corresponding month
        if (num == 1) {
            System.out.println("January");
        } else if (num == 2) {
            System.out.println("Febuary");
        } else if (num == 3) {
            System.out.println("March");
        } else if (num == 4) {
            System.out.println("April");
        } else if (num == 5) {
            System.out.println("May");
        } else if (num == 6) {
            System.out.println("June");
        } else if (num == 7) {
            System.out.println("July");
        } else if (num == 8) {
            System.out.println("August");
        } else if (num == 9) {
            System.out.println("September");
        } else if (num == 10) {
            System.out.println("October");
        } else if (num == 11) {
            System.out.println("November");
        } else if (num == 12) {
            System.out.println("December");
        } else {
            System.out.println("You have entered an invalid number. You must enter a number between 1 and 12. Goodbye.");
        }
    }
}


