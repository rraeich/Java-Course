import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner inp = new Scanner(System.in);

        int x;

        System.out.print("Enter a number: ");
        x = inp.nextInt();

        for (int i=0 ;i < x;i++){

            for (int z=0;z < x-i ;z++){
                System.out.print(" ");
            }

            for (int j=0;j <= 2*i;j++){
                System.out.print("*");
            }

            System.out.print("\n");
        }

        for (int i=0 ;i <= x;i++){

            for (int z=0;z < i ;z++){
                System.out.print(" ");
            }

            for (int j=0;j <= 2*(x-i) ;j++){
                System.out.print("*");
            }

            System.out.print("\n");
        }
    }
}