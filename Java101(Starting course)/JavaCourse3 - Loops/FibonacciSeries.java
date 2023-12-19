import java.util.Scanner;
//by rraeichp
public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int nmbf=1,nmbr=0,nmbc,n; // nmbf = forward number / nmbr = number reverse

        System.out.print("Enter step number: ");
        n = inp.nextInt();


        System.out.println(n+"-element Fibonacci series: ");

        for (int i=0; i < n ;i++)
        {
            System.out.println(nmbr+" + "+nmbf+" : " + (nmbf + nmbr));

            nmbc = nmbf;
            nmbf = (nmbr + nmbf);
            nmbr = nmbc;
        }
    }
}