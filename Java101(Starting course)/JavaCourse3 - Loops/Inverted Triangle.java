import java.util.Scanner;
//by rraeichp
public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int x;

        System.out.print("Enter a step number: ");
        x = inp.nextInt();

        for (int i=0;i < x;i++)
        {
            for (int z=1;z <= i;z++)
            {
                System.out.print(" ");
            }

            for (int j=1;j < 2*(x-i);j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}