
import java.util.Scanner;

public class JavaKurs {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int[][] matris = {
                {5, 8, 6},
                {4, 2, 1},
                {9, 0, 7}
        };

        int[][] transpose = new int[matris[0].length][matris.length];

        for (int i = 0; i < matris.length; i++) {
            for (int y = 0; y < matris[0].length; y++) {

                transpose[y][i] = matris[i][y];
            }
        }

        for (int[] u : transpose) {
            for (int x : u) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}