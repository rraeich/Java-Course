import java.util.Scanner;

public class Main {
    public static void main(String[] args)

    {
        Scanner inp = new Scanner(System.in);

        double r,a,alan;

        System.out.print("Dairenin yaricapini giriniz: ");
        r = inp.nextDouble();

        System.out.print("Alanini bulacaginiz dilimin merkez aci olcusunu giriniz: ");
        a = inp.nextDouble();

        alan = 3.14 * r * r * a / 360;

        System.out.println("Açısı " + a + " derece olan dilimin alanı: " + alan);
    }
}