import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        
        int size = scan.nextInt();
        scan.nextLine();
        
        String[] elements = scan.nextLine().split("\\s+");
        

        // dynamic array list 
        ArrayList<String> liste = new ArrayList<>();
        for (String element : elements) {
            liste.add(element);
        }
        
        int nq = scan.nextInt();
        scan.nextLine();
        
        for(int i = 0 ; i < nq; i++){
            String type = scan.nextLine();
            String[] values = scan.nextLine().split("\\s+");
            
            if(type.equals("Insert")){
                liste.add(Integer.parseInt(values[0]),values[1]);
            }else{
                liste.remove(Integer.parseInt(values[0]));
            }
        }
        
        for(String s:liste){
            System.out.print(s + " ");
        }
        
        scan.close();
    }
}