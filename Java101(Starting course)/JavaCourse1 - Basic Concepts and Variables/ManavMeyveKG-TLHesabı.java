import java.util.Scanner;

public class Main {
    public static void main(String[] args)

    {
        Scanner inp = new Scanner(System.in);

        int armut,elma,domates,muz,patlican;
        double toplam;

        System.out.println("Meyveler ve KG Fiyatları\n" +
                "\n" +
                "Armut : 2,14 TL\n" +
                "Elma : 3,67 TL\n" +
                "Domates : 1,11 TL\n" +
                "Muz: 0,95 TL\n" +
                "Patlıcan : 5,00 TL");

        System.out.println("\nSırasıyla kaç kilo alındığını giriniz: ");
        armut = inp.nextInt(); elma = inp.nextInt(); domates = inp.nextInt(); muz = inp.nextInt(); patlican = inp.nextInt();

        toplam = (armut * 2.14) + (elma * 3.67) + (domates * 1.11) + (muz * 0.95) + (patlican * 5.0);

        System.out.print("Ürünlerin toplam fiyatı: "+ toplam);
    }
}