import java.util.Scanner;

public class Main {
    public static void main(String[] args)

    {
        Scanner inp = new Scanner(System.in);

        int tutar;
        float kdvlitutar,kdv;

        System.out.print("Belirtilen tutari giriniz: ");
        tutar = inp.nextInt();

        // Kdv Tutarı: 0-1000 = %18 // 1000+ = %8

        kdvlitutar = tutar > 1000 ? ((float)tutar + (float)tutar*8/1000) : ((float)tutar + (float)tutar*18/1000);
        kdv = kdvlitutar - (float)tutar;

        System.out.println("\nKdvsiz tutar: " + tutar);
        System.out.println("Kdvli tutar: " + kdvlitutar);
        System.out.println("Kdv Tutari: " + kdv);
    }
}