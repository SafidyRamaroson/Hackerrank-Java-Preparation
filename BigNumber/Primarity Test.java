import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        
        BigInteger bign = new BigInteger(n);
        
        // using isProbablePrime Method 
        boolean isPrime = bign.isProbablePrime(20);
        
        System.out.println((isPrime) ? "prime":"not prime");
        bufferedReader.close();
    }
}
