import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        long nmbOne, nmbTwo, n = 1L, r = 1L, x = 1L, cmb; // n = nmbOne! , r = nmbTwo! , x = (nmbOne - nmbTwo)!

        System.out.print("Enter the numbers you want to combination: ");
        nmbOne = inp.nextLong();
        nmbTwo = inp.nextLong();

        if (nmbOne < nmbTwo) {
            System.out.print("Error... Program is closing..");
            return;
        }

        for (int i = 1; i <= nmbOne; i++) {

            n = n * i;
        }

        for (int i = 1; i <= nmbTwo; i++) {

            r = r * i;
        }

        for (int i = 1; i <= (nmbOne - nmbTwo); i++) {

            x = x * i;
        }

        cmb = n / (r * x);

        System.out.print("Combination of (" + nmbOne + "," + nmbTwo + "): " + cmb);
    }
}