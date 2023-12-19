import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int nmb,x,y,sum=0;

        do{
            System.out.print("\nEnter a number: ");
            nmb = inp.nextInt();

            x = nmb % 2;
            y = nmb % 4;
            if(y == 0){
                sum += nmb;
            }
        }
        while (x == 0);

        System.out.println("\nSum of numbers: "+ sum);
    }
}