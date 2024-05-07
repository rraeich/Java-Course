import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int T = input.nextInt();

        String[] left = new String[T];
        String[] right = new String[T];

        for (int i = 0; i < T; i++) {
            left[i] = input.next();
            right[i] = input.next();
        }

        HashSet<String> hSet = new HashSet<>();
        for (int i = 0; i < T; i++) {
            hSet.add(left[i] + " " + right[i]);
            System.out.println(hSet.size());
        }
    }
}