import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String strValue1 = scan.nextLine();
        String strValue2 = scan.nextLine();
        
        BigInteger value1 = new BigInteger(strValue1);
     
        BigInteger value2 = new BigInteger(strValue2);
        
        System.out.println(value1.add(value2));
        System.out.println(value1.multiply(value2));
        
        scan.close();
    }
}