import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int lenStr = str.length() - 1;
        // split the array 
        char[] charArray = str.toCharArray();
        String reversedStr = "";
        while(lenStr >= 0){
            reversedStr +=charArray[lenStr];
            lenStr --;
        }
        
        // compare these strings with equals
        if(reversedStr.equals(str)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
        sc.close();
        
    }
}



