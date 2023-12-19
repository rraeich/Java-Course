import java.util.Scanner;
//by rraeichp
public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int rem,sum=0;

        System.out.print("Prime numbers of (0,100): ");

        for (int i=1;i <= 100;i++)
        {
            sum=0;
            for (int j=1 ; j<=i ;j++)
            {
                rem = i % j;

                if(rem == 0){
                   sum += j;
                }
            }

            if ((i+1) == sum){
                System.out.print(i+",");
            }
        }
    }
}