import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        double sum=0;
        int n;

        System.out.print("Enter 'n' number: ");
        n = inp.nextInt();

        for (float i=1;i <= n;i++){
            sum = sum + (1/i);
        }

        System.out.println("Harmonic series of the "+n+": " +sum);
    }
}