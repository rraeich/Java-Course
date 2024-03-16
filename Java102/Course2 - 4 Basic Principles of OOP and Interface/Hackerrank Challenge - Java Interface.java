import java.util.*;

interface AdvancedArithmetic{

    int divisorSum(int x);
}

class MyCalculator implements AdvancedArithmetic{

    public int divisorSum(int x){
        int sum=0;
        for (int i=1; i <= x;i++){
            if (x % i == 0){
                sum += i;
            }
        }
        return sum;
    }
}

public class Solution {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        do {
            if (number > 1000){
                System.out.println("'x' must be smaller than 1000. Try again:");
                number = input.nextInt();
            }
        } while (number > 1000);

        MyCalculator test = new MyCalculator();

        System.out.println("I implemented: AdvancedArithmetic");
        System.out.println(test.divisorSum(number));
    }
}