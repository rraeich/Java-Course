import java.util.Scanner;

public class Main {
    public static void main(String[] args)

    {
        Scanner inp = new Scanner(System.in);

        double boy,kilo,vki;

        System.out.print("Sırasıyla kilonuzu(kg) ve boyunuzu(m) giriniz:");
        kilo = inp.nextDouble(); boy = inp.nextDouble();

        vki = kilo / (boy * boy);

        System.out.print("\nVücut kitle indeksi: " + vki);
    }
}