import java.util.Scanner;



public class Scannner {

	public static int x = 10;
	
	public static String str;
	
	public static void main(String[] args) {
		
		System.out.println( " -- value of x:" + x);
		
		System.out.println( "New value for x:?" );
	    int newX = new Scanner( System.in ).nextInt();
	    
	    x= newX;
	    
	    System.out.println( " -- value of x:" + x);
	    
	    ReadStaticVariable rsv = new ReadStaticVariable();
	    
	   System.out.println("from other class ++: "+ rsv.incr(rsv.readStaticFromScanner()));
	   
	   System.out.println( " -- value of x:" + x);
	    
//	    System.out.println("Your name: " +name);
//	    
//	    System.out.println( " Wie alt bist du?" );
//	    int age = new Scanner(System.in).nextInt();
//	    
//	    System.out.println("Your age: " +age);
	}
}
