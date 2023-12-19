import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner inp = new Scanner(System.in);

        int x,y,z=1,t=1;

        System.out.print("Enter a number: ");
        x = inp.nextInt();

        System.out.print("\nNumbers that are powers of 4: ");

        for(;z <= x;z*=4)
        {
            System.out.print( z + ",");
        }

        System.out.print("\n\nNumbers that are powers of 5: ");

        for(;t <= x;t*=5)
        {
            System.out.print( t + ",");
        }
    }
}