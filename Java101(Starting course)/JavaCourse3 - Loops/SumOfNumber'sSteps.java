import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int nmb,rnmb,step=0,sum=0,rem;

        System.out.print("Enter a number: ");
        rnmb = inp.nextInt();

        nmb = rnmb;

        while(nmb != 0){

            nmb = nmb / 10;
            step++;
        }

        nmb = rnmb;

        for(int i=1;i<=step;i++){

            rem = nmb % 10;
            nmb = (nmb - rem) / 10;
            sum = sum + rem;

        }

        System.out.println(rnmb + "'s step sum: "+sum);
    }
}