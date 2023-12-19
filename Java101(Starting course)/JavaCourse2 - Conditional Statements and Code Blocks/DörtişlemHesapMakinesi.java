import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    
    {
        Scanner inp = new Scanner(System.in);

        int x,y,islem;
        double sonuc;

        System.out.println("İlk sayıyı giriniz:");
        x = inp.nextInt();

        System.out.println("İkinci sayıyı giriniz:");
        y = inp.nextInt();

        System.out.println("1-Toplama" +
                "\n2-Çıkarma" +
                "\n3-Çarpma" +
                "\n4-Bölme");
        System.out.println("\nHangi işlemi yapmak istediğinizi seçiniz:");
        islem = inp.nextInt();

        switch (islem){

            case 1:
                sonuc = (double)x+(double)y;
                System.out.println("İşlem sonucu: " + sonuc);
                break;
            case 2:
                sonuc = (double)x-(double)y;
                System.out.println("İşlem sonucu: " + sonuc);
                break;
            case 3:
                sonuc = (double)x*(double)y;
                System.out.println("İşlem sonucu: " + sonuc);
                break;
            case 4:
                sonuc = (double)x/(double)y;
                System.out.println("İşlem sonucu: " + sonuc);
                break;
            default:
                System.out.println("Yanlış işlem seçtiniz.");
        }
    }
}
