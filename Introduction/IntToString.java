import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        
        // convert an integer to string 
        String s = String.valueOf(n);
        
        if(s != null && -100 <= n && n <= 100){
            System.out.println("Good job");
        }else{
            System.out.println("Wrong answer");
        }
 
    }
}