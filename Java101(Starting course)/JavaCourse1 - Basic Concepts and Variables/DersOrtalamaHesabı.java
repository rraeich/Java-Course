import java.util.Scanner;

public class Main {
    public static void main(String[] args)

    {
        Scanner inp = new Scanner(System.in);

        int mat,phy,trk,chm,his,mus;

        System.out.printf("Turkce notunuzu giriniz:");
        trk = inp.nextInt();

        System.out.printf("\nMatematik notunuzu giriniz:");
        mat = inp.nextInt();

        System.out.printf("\nTarih notunuzu giriniz:");
        his = inp.nextInt();

        System.out.printf("\nFizik notunuzu giriniz:");
        phy = inp.nextInt();

        System.out.printf("\nKimya notunuzu giriniz:");
        chm = inp.nextInt();

        System.out.printf("\nMuzik notunuzu giriniz:");
        mus = inp.nextInt();

        float toplam = mus + chm + phy + mat + trk + his;
        float ort = toplam / 6 ;

        System.out.printf("\nNot ortalamanız: %f",ort);

        System.out.println(ort >=60 ? "\nGECTİ" : "\nKALDI");
    }
}