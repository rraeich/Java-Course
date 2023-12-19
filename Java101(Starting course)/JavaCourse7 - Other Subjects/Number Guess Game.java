import java.util.Scanner;

public class JavaKurs {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int secret_number = (int) (Math.random() * 101);
        int guess, x = 0;

        do {
            System.out.print("(0-100)System selected a number. You have 7 chances. Guess it: ");
            guess = inp.nextInt();
            System.out.println();

            if (guess > 100 || guess < 0) {
                System.out.println("Please enter a number from the range 0 to 100. Try Again.");
            }
        } while (guess < 0 || guess > 100);

        while (true) {

            if (guess < secret_number) {

                x++;

                System.out.println("Remaining choice: " + (7 - x));
                if (x == 7) {
                    System.out.println("You don't have any chance.");
                    System.out.println("Secret number is: " + secret_number);
                    break;
                }

                System.out.print("Your guess is smaller than secret number. Try Again: ");
                guess = inp.nextInt();
                System.out.println();

                if (guess > 100 || guess < 0) {
                    System.out.print("Please enter a number from the range 0 to 100. Try Again.");
                    x--;
                }

                System.out.println();
            } else if (guess > secret_number) {

                x++;

                System.out.println("Remaining choice: " + (7 - x));
                if (x == 7) {
                    System.out.println("You don't have any chance.");
                    System.out.println("Secret number is: " + secret_number);
                    break;
                }

                System.out.print("Your guess is bigger than secret number. Try Again: ");
                guess = inp.nextInt();
                System.out.println();

                if (guess > 100 || guess < 0) {
                    System.out.print("Please enter a number from the range 0 to 100. Try Again.");
                    x--;
                }

                System.out.println();
            } else if (guess == secret_number) {
                System.out.println("----------------------------------------------------------------");
                System.out.println("Congratulations! Your guess is right! Secret number is: " + secret_number);
                System.out.println("----------------------------------------------------------------");
                break;
            }
        }
    }
}