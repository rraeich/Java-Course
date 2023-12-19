import java.util.Scanner;

public class Main {
    public static void main(String[] args)

    {
        Scanner inp = new Scanner(System.in);

        int a,b,c;
        float u;
        double alan;

        System.out.println("Ilk kenarini giriniz:");
        a = inp.nextInt();

        System.out.println("Ikinci kenarini giriniz:");
        b = inp.nextInt();

        System.out.println("Ucuncu kenarini giriniz:");
        c = inp.nextInt();

        u = ((float)a+(float)b+(float)c) / 2;
        alan = Math.sqrt(u * Math.abs((u-(float)a)) * Math.abs((u-(float)b)) * Math.abs((u-(float)c)));

        System.out.println("Ucgenin alani: " + alan);
    }
}
