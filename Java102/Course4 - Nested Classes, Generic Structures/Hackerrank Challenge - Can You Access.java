import java.util.*;

public class Solution {

    private int x;

    Solution(int x){
        this.x = x;
    }

    class InnerPrivate{

        public void powerof2(){
            int oldX = Solution.this.x;
            int a;
            for (int i = 0; i < 30; i++) {
                a = x % 2;
                
                if(x == 2 || x == 1){
                    System.out.println(oldX + " is power of 2");
                    System.out.println("An instance of class: Solution.Inner.Private has been created");
                    break;
                }
                
                if (a != 0 || x == 0) {
                    System.out.println(oldX + " is not a power of 2");
                    System.out.println("An instance of class: Solution.Inner.Private has been created");
                    break;
                }
                
                x = x / 2;
            }
        }
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int max=1;
        for (int i = 0; i < 30;i++){
            max = max * 2;
        }

        int number = input.nextInt();

        while (!(number >= 0 && number <= max)){
            number = input.nextInt();
        }

        Solution solution = new Solution(number);
        InnerPrivate ip = solution.new InnerPrivate();

        ip.powerof2();
    }
}