import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        
        System.out.println(str1.length()+str2.length());
        String [] strList ={str1,str2};
        
        Arrays.sort(strList);
    
        if(strList[0] == str1){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
        
        String concatenateStr = str1.substring(0,1).toUpperCase()+str1.substring(1)+" "+str2.substring(0,1).toUpperCase()+str2.substring(1);
        
        System.out.println(concatenateStr);
        
        
        scanner.close();
    }
}