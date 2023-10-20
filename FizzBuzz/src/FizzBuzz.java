import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        boolean numTrue = false;

        // error validation
        while (!numTrue) {
            try {
                System.out.println("Please enter an integer: ");
                num1 = scanner.nextInt();
                numTrue = true;
            } catch (Exception e) {
                System.out.println("You must enter an integer.");
                scanner.nextLine();
            }
        }

        // loop through range 1 -> user input
        for (int i = 1; i <= num1; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz ");
            } else if (i % 3 == 0) {
                System.out.println("Fizz ");
            } else if (i % 5 == 0) {
                System.out.println("Buzz ");
            } else {
                System.out.println(i + " ");
            }
        }
    }
}