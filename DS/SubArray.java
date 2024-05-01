import java.util.Scanner;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        scan.nextLine();
        
        String line = scan.nextLine();
        String[] strl = line.split("\\s+");
        
        int res = 0;
        
        for (int i = 0; i < n; i++) {
            int currentSum = 0;
            for (int j = i; j < n; j++) {
                currentSum += Integer.parseInt(strl[j]);
                if (currentSum < 0) {
                    res++;
                }
            }
        }
        
        System.out.println(res);
        scan.close();
    }
}
