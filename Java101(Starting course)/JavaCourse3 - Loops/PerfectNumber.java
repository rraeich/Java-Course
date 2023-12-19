import java.util.Scanner;
//by rraeichp
public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int nmb,sum=0,rem;

        System.out.print("Enter a number: ");
        nmb = inp.nextInt();

        for (int i=1;i < nmb;i++){

            rem = nmb % i;

            if (rem == 0){
                sum += i;
            }
        }

        System.out.println(nmb == sum ? nmb + " is a Perfect Number." : nmb + " is not a Perfect Number.");
    }
}