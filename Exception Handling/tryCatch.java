import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        
        try {
           int x = scan.nextInt();
           scan.nextLine();
           int y = scan.nextInt();
           System.out.println(x/y);
        }catch(ArithmeticException e){
            System.out.println("java.lang.ArithmeticException: "+e.getMessage());
        }catch(InputMismatchException e){
            System.out.print("java.util.InputMismatchException");
        }
    }
}