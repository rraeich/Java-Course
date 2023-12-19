
import java.util.Scanner;
import java.util.Arrays;

public class JavaKurs {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int[] numbers = {19, -99, 17, 23, 2403, 100, -3, -56, 61, 18, 4,434,1983,-188,-1902,2104,65,324};
        int[] copyNumbers = Arrays.copyOf(numbers,numbers.length);
        Arrays.sort(copyNumbers);

        int x,max = copyNumbers[numbers.length-1],min= copyNumbers[0];

        System.out.println(Arrays.toString(numbers));

        System.out.print("Enter a number: ");
        x = inp.nextInt();

        for (int i=0; i < numbers.length; i++){

            if (x > numbers[i] && numbers[i] > min){
                min = numbers[i];
            }

            else if (x < numbers[i] && numbers[i] < max){
                max = numbers[i];
            }
        }

        System.out.println();
        System.out.println("Next big number: "+max);
        System.out.println("Next small number: "+min);
    }
}