import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int heat;

        System.out.print("Write the heat (°C):");
        heat = inp.nextInt();

        if (heat < 5){

            System.out.println("You should go to the ski.");
        }

        else if (heat >= 5 && heat < 15) {

            System.out.println("You should go to the cinema.");
        }

        else if (heat >= 15 && heat < 25 ) {

            System.out.println("You should have a picnic");
        }

        else if (heat >= 25){

            System.out.println("You should go to the swimming.");
        }

    }
}