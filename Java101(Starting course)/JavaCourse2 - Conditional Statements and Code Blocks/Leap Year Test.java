import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int year,x,y,z;

        System.out.print("Enter a random year: ");
        year = inp.nextInt();

        x = year % 4;
        y = year % 100;
        z = year % 400;

        System.out.print("\n");

        if (x == 0)
        {
            if(y == 0)
            {
                if (z == 0)
                {
                    System.out.print(year + " is a leap year.");
                }

                else
                {
                    System.out.print(year + " isn't a leap year.");
                }
            }

            else
            {
                System.out.print(year + " is a leap year.");
            }
        }

        else
        {
            System.out.print(year + " isn't a leap year.");
        }
    }
}