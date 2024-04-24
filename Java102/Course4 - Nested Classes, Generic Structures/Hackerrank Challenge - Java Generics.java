import java.io.*;
import java.util.*;

class ArrayPrint {

    public static <T> void writeArray(T[] array,T[] array2) {

        for (T i : array){
            System.out.println(i);
        }
        
        for (T i: array2){
            System.out.println(i);
        }
    }
}

public class Solution {
    public static void main(String[] args) {
        
        Integer[] x = {1,2,3};
        String[] a = {"Hello","World"};

        ArrayPrint.writeArray(x,a);
    }
}