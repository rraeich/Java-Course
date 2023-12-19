import java.util.Scanner;

public class Main {

    static long exp(int base,int power){

        if (power == 1){
            return base;
        }
        return exp(base,power-1) * base;
    }

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int base,power;

        System.out.print("Enter base: ");
        base = inp.nextInt();

        System.out.print("Enter power: ");
        power = inp.nextInt();

        System.out.println(exp(base,power));
    }
}