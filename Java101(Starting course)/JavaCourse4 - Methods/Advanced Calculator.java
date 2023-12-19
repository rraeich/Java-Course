import java.util.Scanner;

public class Main {

    static int sum(int x, int y){
        return x+y;
    }

    static int ext(int x, int y){
        return x-y;
    }

    static int multiplication(int x,int y){
        return x*y;
    }

    static double division(double x ,double y){
        return x/y;
    }

    static int rem(int x ,int y){
        return x % y;
    }

    static int rectarea(int x, int y){
        return x*y;
    }

    static int rectenv(int x, int y){
        return 2*(x+y);
    }

    static long factorial(long x){
        long sum=1;

        for (int i=1 ; i <= x ; i++){
            sum *= i;
        }

        return sum;
    }

    static int exp(int x,int y){

        int exp_number=1;

        for (int i=1 ; i <= y; i++){
            exp_number *= x;
        }
        return exp_number;
    }


    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int action,x,y;
        String menu = "----------------------------------------\n" +
                "1- Sum\n" +
                "2- Subtraction\n" +
                "3- Multiplication\n" +
                "4- Division\n" +
                "5- Exponential Number Calculating\n" +
                "6- Factorial Number Calculating\n" +
                "7- Getting Mod\n" +
                "8- Rectangle environment and area calculating\n" +
                "----------------------------------------\n";



        do {

            System.out.print(menu);
            System.out.print("Enter your action number: ");
            action = inp.nextInt();

        } while (action != 1 && action != 2 && action != 3 && action != 4 && action != 5 && action != 6 && action != 7 && action != 8);

        switch (action){

            case 1:
                System.out.println("Enter the numbers you want to sum: ");
                x = inp.nextInt(); y = inp.nextInt();

                System.out.println(sum(x,y));
                break;

            case 2:
                System.out.println("Enter the numbers you want to ext: ");
                x = inp.nextInt(); y = inp.nextInt();

                System.out.println(ext(x,y));
                break;

            case 3:
                System.out.println("Enter the numbers you want to multiplication: ");
                x = inp.nextInt(); y = inp.nextInt();

                System.out.println(multiplication(x,y));
                break;

            case 4:
                System.out.println("Enter the numbers you want to division: ");
                x = inp.nextInt(); y = inp.nextInt();

                System.out.println(division(x,y));
                break;

            case 5:
                System.out.println("(Exponential number) Enter the base: ");
                x = inp.nextInt();

                System.out.println("(Exponential number) Enter the power: ");
                y = inp.nextInt();

                System.out.println(exp(x,y));
                break;

            case 6:
                System.out.println("Enter the number you want to calculating to factorial: ");
                x = inp.nextInt();

                System.out.println(factorial(x));
                break;

            case 7:
                System.out.println("Enter the numbers you want to get a mod: ");
                x = inp.nextInt();

                System.out.println("Enter the number you will divide: ");
                y = inp.nextInt();

                System.out.println(rem(x,y));
                break;

            case 8:
                System.out.println("Enter the numbers you want to rectangle's edges: ");
                x = inp.nextInt(); y = inp.nextInt();

                System.out.println("Rectangle's area: " + rectarea(x,y));
                System.out.println("Rectangle's env: "+ rectenv(x,y));
                break;

            default:
                break;
        }
    }
}
