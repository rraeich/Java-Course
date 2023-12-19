import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int bm,x; //Birth Month : bm

        System.out.print("Enter your birth month: ");
        bm = inp.nextInt();

        x = bm % 12;

        switch (x){

            case 0:
                System.out.print("\nYour Chinese Zodiac animal: Monkey");
                break;

            case 1:
                System.out.print("\nYour Chinese Zodiac animal: Cockorel");
                break;

            case 2:
                System.out.print("\nYour Chinese Zodiac animal: Dog");
                break;

            case 3:
                System.out.print("\nYour Chinese Zodiac animal: Pig");
                break;

            case 4:
                System.out.print("\nYour Chinese Zodiac animal: Mouse");
                break;

            case 5:
                System.out.print("\nYour Chinese Zodiac animal: Ox");
                break;

            case 6:
                System.out.print("\nYour Chinese Zodiac animal: Tiger");
                break;

            case 7:
                System.out.print("\nYour Chinese Zodiac animal: Rabbit");
                break;

            case 8:
                System.out.print("\nYour Chinese Zodiac animal: Dragon");
                break;

            case 9:
                System.out.print("\nYour Chinese Zodiac animal: Snake");
                break;

            case 10:
                System.out.print("\nYour Chinese Zodiac animal: Horse");
                break;

            case 11:
                System.out.print("\nYour Chinese Zodiac animal: Sheep");
                break;
        }
    }
}