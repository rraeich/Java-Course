import java.util.Scanner;
//by rraeichp
public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int n,nmbr,max=0,min=0,nmbc=0;

        System.out.print("How many numbers will you enter?: ");
        n = inp.nextInt();

        for (int i=1;i <= n;i++)
        {
            System.out.print("Enter " + i + ". number: ");
            nmbr = inp.nextInt();

            if (i == 2 && nmbr < nmbc){
                min = nmbr;
                max = nmbc;
                continue;
            }

            else if (i == 2 && nmbr > nmbc){
                max = nmbr;
                min = nmbc;
                continue;
            }

            if (nmbr > max) {
                max = nmbr;
            }

            else if (nmbr < min) {
                min = nmbr;
            }
            nmbc = nmbr;
        }

        System.out.println("Biggest number: "+max);
        System.out.println("Lowest number: "+min);
    }
}