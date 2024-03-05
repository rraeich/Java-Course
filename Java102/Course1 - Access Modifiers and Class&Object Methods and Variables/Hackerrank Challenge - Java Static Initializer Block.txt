import java.util.Scanner;

class Solution {

    public boolean check;
    public static boolean check2 = true;

    Solution(boolean check){
        this.check = check;
    }

    static {
        Scanner inp = new Scanner(System.in);
        int breadth = inp.nextInt();
        int height = inp.nextInt();

        if (breadth > 0 && height > 0){
            System.out.print(breadth * height);
            check2 = false;
        }
    }

    public static void main(String[] args) {

        Solution x = new Solution(Solution.check2);
        if (x.check){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
}