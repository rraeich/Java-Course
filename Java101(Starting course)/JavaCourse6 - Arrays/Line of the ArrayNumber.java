import java.util.Scanner;
import java.util.Arrays;

public class JavaKurs {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("Type how many numbers you want to enter: ");
        int x = inp.nextInt();

        int[] mainList = new int[x];

        for (int i = 0; i < x; i++) {
            System.out.print("Enter " + (i + 1) + ". number: ");
            mainList[i] = inp.nextInt();
        }
        Arrays.sort(mainList);

        System.out.println("Line of the numbers ");
        for (int i:mainList){
            System.out.print(i + " ");
        }
    }
}