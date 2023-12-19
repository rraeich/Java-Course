import java.util.Scanner;

public class Main {

    static int div_5(int x){

        int n=0;

        while (x >= 0)
        {
            x -= 5;
            n++;

            if (x < 0 && x % 5 != 0){
                n++;
            }
        }

        return n;
    }

    static int loop(int x,int y,int z){

        System.out.print(y + " ");

        int i,c = 5;

        if (y > 0 && z > 0)
        {
            i = c;
        }

        else {
            c = -5;
            i = c;
        }

        if (x == y && c == -5) {
            return x;
        }

        return loop(x,y-i,z-1);
    }



    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int nmb;

        System.out.print("Enter a number: ");
        nmb = inp.nextInt();

        System.out.print("Line of the loop: ");
        loop(nmb,nmb,div_5(nmb));

    }
}