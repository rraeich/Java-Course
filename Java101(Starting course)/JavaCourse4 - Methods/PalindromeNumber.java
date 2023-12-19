import java.util.Scanner;

public class Main {

    static long step(long y){
        int x=0;

        if (y == 0) {
            return 0;
        }

        y = y - (y % 10);
        y = y /10;
        x++;

        return step(y)+x;
    }

    static long palindrome(long z) {

        long rem,newn;
        int x=0;

        if(z == 0){
            return 0;
        }

        rem = z % 10;
        z = (z - rem) / 10;

        newn = rem * (long)Math.pow(10,step(z));

        return palindrome(z) + newn;
    }

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        long nmb;

        System.out.print("Enter a number: ");
        nmb = inp.nextLong();

        if (nmb == palindrome(nmb)){
            System.out.println(nmb + " is a palindrome number.");
        }

        else {
            System.out.println(nmb +" isn't a palindrome number.");
        }
    }
}
