public class JavaKurs{
    public static void main(String[] args) {

        double[] numbers = {1, 2, 3,4,5,6,7,8,9};
        double sum=0;

        for (int i=0;i < numbers.length; i++){
            sum = sum + (1 / numbers[i]);
        }

        System.out.println("Harmonic series average: " + ( numbers.length / sum));
    }
}