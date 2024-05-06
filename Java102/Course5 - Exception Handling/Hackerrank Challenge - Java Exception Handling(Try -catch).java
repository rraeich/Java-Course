import java.util.Scanner;
import java.util.InputMismatchException;


public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            Integer a = input.nextInt();
            Integer b = input.nextInt();
            System.out.println(a / b);
        } catch (InputMismatchException mme) {
            System.out.println(mme.toString().split(":")[0]);
        } catch (ArithmeticException ae) {
            System.out.println(ae.toString());
        }
    }
}