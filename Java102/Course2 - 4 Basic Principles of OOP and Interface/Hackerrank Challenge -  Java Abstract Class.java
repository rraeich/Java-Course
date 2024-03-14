import java.util.Scanner;

abstract class Book{
    String title;
    
    abstract void setTitle(String s);
    
    String getTitle(){
        return title;
    }
}

class MyBook extends Book{
    
    void setTitle(String title){
        System.out.print("The title is: " + title);
    }
}

public class Solution {
    public static void main(String[] args) {
        
        MyBook bookTitle = new MyBook();
        
        Scanner inp = new Scanner(System.in);
        String title = inp.nextLine();
        
        bookTitle.setTitle(title);
    }
}