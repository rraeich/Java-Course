import java.util.Scanner;

public class JavaKurs {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        String str;
        String newStr = "";

        System.out.print("Enter the word you want to check if it is palindromic: ");
        str = inp.nextLine();

        char[] contStr = str.toCharArray();
        char[] mainStr = str.toCharArray();

        System.out.println(newStr);

        for (int i=0; i < str.length();i++) {
                contStr[i] = mainStr[(mainStr.length - i) - 1];
        }

        for (int i=0; i < contStr.length; i++){
            newStr = newStr + contStr[i];
        }

        System.out.println("Main word: "+str);
        System.out.println("Palindromic word: " + newStr);
        
        if (str.equals(newStr)){
            System.out.println("\nArrays matched. This words are palindromic.");
        }
        else{
            System.out.println("\nArrays not matched. This words are not palindromic.");
        }
    }
}