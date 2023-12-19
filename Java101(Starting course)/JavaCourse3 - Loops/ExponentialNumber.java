import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int x,y,n=1; // x^y

        System.out.print("Enter base number: ");
        x = inp.nextInt();

        System.out.print("Enter power: ");
        y = inp.nextInt();

        for(int i=1; i<=y ;i++){

            n = n * x;
        }

        System.out.print("\nExponential of " + x +"^"+ y +":" + n);
    }
}