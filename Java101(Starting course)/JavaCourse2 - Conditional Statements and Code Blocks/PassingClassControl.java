import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);

        int mat,phy,trk,che,mus,sum=0;
        double average;

        System.out.print("Write your maths note:");
        mat = inp.nextInt();

        System.out.print("\nWrite your physic note:");
        phy = inp.nextInt();

        System.out.print("\nWrite your turkish note:");
        trk = inp.nextInt();

        System.out.print("\nWrite your chemistry note:");
        che = inp.nextInt();

        System.out.print("\nWrite your music note:");
        mus = inp.nextInt();

        sum += mat<=100 && mat >=0 ? mat : 0;
        sum += phy<=100 && phy >=0 ? phy : 0;
        sum += trk<=100 && trk >=0 ? trk : 0;
        sum += che<=100 && che >=0 ? che : 0;
        sum += mus<=100 && mus >=0 ? mus : 0;

        average = (float)sum/5;

        System.out.println("\n\n--------------------------------");
        System.out.println("Year End Grade: "+average);
        if (average>=55){

            System.out.println("You passed the class.");
            System.out.println("--------------------------------");
        }

        else {

            System.out.println("You didn't passed the class.");
            System.out.println("--------------------------------");
        }
    }
}