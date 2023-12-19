import java.util.Scanner;

public class JavaKurs {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int[] list = {10, 20, 17, 20, 10, 10, 20, 17, 5, 20, 19};
        int[] control = new int[list.length + 1];
        control[0] = 0;

        go:
        for (int i = 0; i < list.length; i++) {

            int x = 0;

            for (int j = 0; j < list.length; j++) {
                if (list[j] == list[i]) {
                    x++;
                }
            }

            for (int u : control) {
                if (u == list[i]) {
                    continue go;
                }
            }
            control[i + 1] = list[i];
            System.out.println(list[i] + " -> " + x + " times repeated.");
        }
    }
}