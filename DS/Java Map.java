//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
        HashMap<String,Integer> phoneBook = new HashMap<>();
		in.nextLine();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
            phoneBook.put(name,phone);
			in.nextLine();
		}
		while(in.hasNext())
		{
			String s=in.nextLine();
            if(phoneBook.containsKey(s)){
                int phoneNumber = phoneBook.get(s);
                System.out.println(s+"="+String.valueOf(phoneNumber));
                
            }else{
                System.out.println("Not found");
            }
		}
	}
}



