import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        
        int inputInt = scanner.nextInt();
        scanner.nextLine();
        double inputDouble = scanner.nextDouble();
        scanner.nextLine(); 
        String inputString = scanner.nextLine();
        
        System.out.println("String: "+ inputString);
        System.out.println("Double: "+ inputDouble);
        System.out.println("Int: "+ inputInt);
        
        scanner.close();
        
    }
}
