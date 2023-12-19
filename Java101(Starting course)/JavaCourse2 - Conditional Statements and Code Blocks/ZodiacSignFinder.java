import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your birth month: ");
        int month = input.nextInt();
        System.out.print("Enter your birth day: ");
        int day = input.nextInt();

        if (month == 1) {
            if (day <= 21) {
                System.out.println("Your zodiac sign: Capricorn");
            } else {
                System.out.println("Your zodiac sign: Aquarius");
            }
        } else if (month == 2) {
            if (day <= 19) {
                System.out.println("Your zodiac sign: Aquarius");
            } else {
                System.out.println("Your zodiac sign: Pisces");
            }
        } else if (month == 3) {
            if (day <= 20) {
                System.out.println("Your zodiac sign: Pisces");
            } else {
                System.out.println("Your zodiac sign: Aries");
            }
        } else if (month == 4) {
            if (day <= 21) {
                System.out.println("Your zodiac sign: Aries");
            } else {
                System.out.println("Your zodiac sign: Taurus");
            }
        } else if (month == 5) {
            if (day <= 19) {
                System.out.println("Your zodiac sign: Taurus");
            } else {
                System.out.println("Your zodiac sign: Gemini");
            }
        } else if (month == 6) {
            if (day <= 22) {
                System.out.println("Your zodiac sign: Gemini");
            } else {
                System.out.println("Your zodiac sign: Cancer");
            }
        } else if (month == 7) {
            if (day <= 22) {
                System.out.println("Your zodiac sign: Cancer");
            } else {
                System.out.println("Your zodiac sign: Leo");
            }
        } else if (month == 8) {
            if (day <= 22) {
                System.out.println("Your zodiac sign: Leo");
            } else {
                System.out.println("Your zodiac sign: Virgo");
            }
        } else if (month == 9) {
            if (day <= 22) {
                System.out.println("Your zodiac sign: Virgo");
            } else {
                System.out.println("Your zodiac sign: Libra");
            }
        } else if (month == 10) {
            if (day <= 22) {
                System.out.println("Your zodiac sign: Libra");
            } else {
                System.out.println("Your zodiac sign: Scorpio");
            }
        } else if (month == 11) {
            if (day <= 21) {
                System.out.println("Your zodiac sign: Scorpio");
            } else {
                System.out.println("Your zodiac sign: Sagittarius");
            }
        } else if (month == 12) {
            if (day <= 21) {
                System.out.println("Your zodiac sign: Sagittarius");
            } else {
                System.out.println("Your zodiac sign: Capricorn");
            }
        }
    }
}
