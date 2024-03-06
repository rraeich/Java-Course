class Adder extends Arithmetic{

    public Adder(int number_one, int number_two) {
        super(number_one, number_two);
    }
}

class Arithmetic {
    private int number_one;
    private int number_two;

    Arithmetic(int number_one,int number_two){
        this.number_one = number_one;
        this.number_two = number_two;
    }

    public int sum(int x,int y){
        return (x+y);
    }
}


public class Solution {
    public static void main(String[] args) {

        Adder adder = new Adder(42,13);

        System.out.println("My superclass is: Arithmetic");
        System.out.print(adder.sum(20,22) +" "+ adder.sum(10,3) +" "+ adder.sum(5,15));
        
    }
}