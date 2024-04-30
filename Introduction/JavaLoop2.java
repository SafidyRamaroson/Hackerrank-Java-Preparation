import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int q = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < q; i++) {
            ArrayList<String> l = new ArrayList<>();
            String[] line = scanner.nextLine().split("\\s+");
            int a = Integer.parseInt(line[0]);
            int b = Integer.parseInt(line[1]);
            int n = Integer.parseInt(line[2]);
            int temp = a;
            for (int k = 0; k < n; k++) {
                temp += b * Math.pow(2, k);
                l.add(Integer.toString(temp));
            }
           
            for (String element : l) {
                System.out.print(element + " ");
            }
            System.out.println(); 
        }
        scanner.close();
    }
}
