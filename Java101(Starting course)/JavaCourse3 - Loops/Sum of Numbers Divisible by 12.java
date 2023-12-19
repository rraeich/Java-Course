import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int nmb,sum=0;

        System.out.print("Enter a number: ");
        nmb = inp.nextInt();

        System.out.print("\nNumbers divisible by 12:");

        for(int i=0;i <= nmb;i++){

            int x = i % 3;
            int y = i % 4;

            if (x == 0 && y == 0){
                System.out.print(i + ",");
                sum += i;
            }
        }
        System.out.print("\nSum of numbers: " +sum);
    }
}