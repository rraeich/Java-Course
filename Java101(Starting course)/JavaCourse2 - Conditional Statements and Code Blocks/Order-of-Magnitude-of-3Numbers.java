import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int x,y,z;

        System.out.print("Enter 3 random numbers (x,y,z) :");
        x = inp.nextInt(); y = inp.nextInt(); z = inp.nextInt();

        if ((x >= y && x >= z) && y >= z){

            System.out.println("Order of Magnitude of the numbers: " + z + "<" + y + "<" + x);
        }

        else if ((y >= x && y >= z) && z >= x) {

            System.out.println("Order of Magnitude of the numbers: " + x + "<" + z + "<" + y);
        }

        else if ((z >= x && z >= y) && y >= x) {

            System.out.println("Order of Magnitude of the numbers: " + x + "<" + y + "<" + z);
        }

        else if ((y >= x && y >= z) && x >= z) {

            System.out.println("Order of Magnitude of the numbers: " + z + "<" + x + "<" + y);
        }

        else if ((z >= y && z >= x) && x >= y) {

            System.out.println("Order of Magnitude of the numbers: " + y + "<" + x + "<" + z);
        }

        else if ((x >= z && x >= y) && z >= y) {

            System.out.println("Order of Magnitude of the numbers: " + y + "<" + z + "<" + x);
        }
    }
}
