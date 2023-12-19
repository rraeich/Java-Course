import java.util.Scanner;

public class Main {

    static int prime(int x,int y){

        if (y == 1){
            return x;
        }

        int rem;

        rem = x % y;

        if (rem == 0 && ((y != 1) && (y != x))){
            return 1;
        }

        return prime(x,y-1);
    }

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int nmb;

        System.out.print("Enter a number: ");
        nmb = inp.nextInt();

        if (nmb != 0 && nmb == prime(nmb,nmb) && nmb != 1){
            System.out.println(nmb + " is a prime number.");
        }

        else {
            System.out.println(nmb + " isn't a prime number.");
        }
    }
}