import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int nmb1,nmb2,i=0,rem1,rem2,hcf,lcm;

        System.out.print("Enter two numbers: ");
        nmb1 = inp.nextInt(); nmb2 = inp.nextInt();

        while (true)
        {
            i++;

            if (nmb1 == nmb2)
            {
                hcf = nmb1;
                break;
            }

            else if (nmb1 > nmb2)
            {
                rem1 = nmb1 % (nmb2-i);
                rem2 = nmb2 % (nmb2-i);

                if (rem1 == 0 && rem2 == 0)
                {
                    hcf = (nmb2-i);
                    break;
                }
            }

            else
            {
                rem1 = nmb1 % (nmb1-i);
                rem2 = nmb2 % (nmb1-i);

                if (rem1 == 0 && rem2 == 0)
                {
                    hcf = (nmb1-i);
                    break;
                }
            }
        }

        lcm = (nmb1 * nmb2) / hcf;

        System.out.println("Highest common factor of ("+nmb1+","+nmb2+"): "+hcf);
        System.out.println("Lowest common multiple of ("+nmb1+","+nmb2+"): "+lcm);
    }
}
//by rraeichp