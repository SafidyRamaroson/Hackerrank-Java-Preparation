import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        scanner.nextLine();
        int h = scanner.nextInt();
        
        if(b > 0 && h > 0 && b <=100 && h <= 100){
            System.out.println(b*h);
        }else{
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
}