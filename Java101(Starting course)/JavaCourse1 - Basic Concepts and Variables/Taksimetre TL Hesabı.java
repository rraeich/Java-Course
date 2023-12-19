import java.util.Scanner;

public class Main {
    public static void main(String[] args)

    {
        Scanner inp = new Scanner(System.in);     //mesafe + " KM gidildiyse, odenmesi gereken tutar: " + tutar + "TL'dir."

        double mesafe,tutar;

        System.out.print("Kac km gidildi?:");
        mesafe = inp.nextDouble();

        tutar = 10 + mesafe * 2.2;

        System.out.println(tutar > 20 ? mesafe + " KM gidildiyse, odenmesi gereken tutar: " + tutar + "TL'dir." : mesafe + "KM gidildiyse minimum tutar 20 TL oldugundan, odenmesi gereken tutar: 20 TL'dir.");
    }
}