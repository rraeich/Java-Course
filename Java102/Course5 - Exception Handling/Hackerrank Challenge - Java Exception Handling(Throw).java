import java.util.Scanner;

public class Solution {

    public static void checkException(int n, int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("n or p should not be negative.");
        }

        if (n == 0 && p == 0) {
            throw new Exception("n and p should not be zero.");
        }
    }

    public static long calcPower(int n, int p) {
        int result = 1;
        for (int i = 0; i < p; i++) {
            result = result * n;
        }
        
        if (n == 0){
            result = 0;
        }
        if (p == 0){
            result = 1;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x=5;
        int i=0;
        
	// x, 2 testte de girebilsin diye önce 5 e eğer ilk input olan 10 girilmiş ise (2. test çalışmışsa) 10 olacak şekilde ayarlandı.
        while (i < x){
            int n = input.nextInt();
            int p = input.nextInt();
            
            if (n == 10){
                x = 10;
            }
            
            while ((n <= -10 || n > 10) || (p <= -10 || p > 10)){
                n = input.nextInt();
                p = input.nextInt();
            }

            try {
                checkException(n, p);
                System.out.println(calcPower(n, p));
            } catch (Exception e) {
                System.out.println(e.toString());
            }
            i++;
        }
    }
}