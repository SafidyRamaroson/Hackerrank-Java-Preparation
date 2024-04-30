import java.util.Scanner;
// we cannot import other library
public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        a = a.toUpperCase();
        b = b.toUpperCase();
        
        if(a.length() != b.length()){
            return false;
        }
        
        int len = a.length();


        for(int i = 0 ; i< len;i++){
            int countCurrentChA = 0;
            int countCurrentChB = 0;
            
            for(int k = 0 ; k < len;k++){
                if(a.charAt(i) == a.charAt(k)){
                    countCurrentChA ++;
                }
            }
            
            for(int k = 0 ; k < len;k++){
                if(a.charAt(i) == b.charAt(k)){
                    countCurrentChB ++;
                }
            }
            
        
            if(countCurrentChB != countCurrentChA){
                return false;
            }
            
        }
        
        return true;

}

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}