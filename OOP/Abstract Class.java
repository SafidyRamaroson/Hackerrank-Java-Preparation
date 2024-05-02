import java.util.*;

// abstract class is a class that we cannot instance directly 
abstract class Book{
	String title;
	abstract void setTitle(String s);
	String getTitle(){
		return title;
	}
}

//Write MyBook class here
class MyBook extends Book {
    
    //  pour indiquer qu'une méthode dans une classe dérive
    //  d'une méthode dans une classe parente, et qu'elle remplace donc cette méthode.
    @Override
    void setTitle(String s){
        title = s;
    }
}

public class Main{
	
	public static void main(String []args){
		//Book new_novel=new Book(); This line prHMain.java:25: error: Book is abstract; cannot be instantiated
		Scanner sc=new Scanner(System.in);
		String title=sc.nextLine();
		MyBook new_novel=new MyBook();
		new_novel.setTitle(title);
		System.out.println("The title is: "+new_novel.getTitle());
      	sc.close();
		
	}
}